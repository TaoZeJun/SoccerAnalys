package com.kuangquanshui.soccer;

public class Sleeper {
    private final long period;
    private final Stoppable stoppable;
    private final Object sleepLock=new Object();
    private boolean wake=false;

    public Sleeper(long period, final Stoppable stoppable) {
        this.period = period;
        this.stoppable = stoppable;
    }

    /**
     * 如果睡眠，停止睡眠，如果不是，跳过
     */
    public void skipSleepCycle(){
        synchronized (sleepLock){
            wake=true;
            sleepLock.notifyAll();
        }
    }

    public void sleep(){
        sleep(System.currentTimeMillis());
    }

    public void sleep(final long startTime){
        if (this.stoppable.isStopped()){
            return;
        }
        long nowtime=System.currentTimeMillis();
        long waitTime=this.period-(nowtime-startTime);
        if (waitTime>this.period){
            System.out.println("计算出等待时间大于");
            waitTime=this.period;
        }

        while (waitTime>0){
            long woke=-1;
            try{
                synchronized (sleepLock){
                    if (wake){
                        break;
                    }
                    sleepLock.wait(waitTime);
                }
                woke=System.currentTimeMillis();
                long slep=woke-nowtime;
                if (slep-this.period>5000){
                    System.out.println("睡的时间太长了");
                }
            }catch (Exception e){
                if (this.stoppable.isStopped()){
                    return;
                }
                Thread.currentThread().interrupt();
            }
            woke=(woke==-1)? System.currentTimeMillis():woke;
            waitTime=this.period-(woke-startTime);
        }
        wake=false;
    }

}
