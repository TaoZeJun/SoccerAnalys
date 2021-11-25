package com.kuangquanshui.soccer;

public final class SoServer implements Runnable,Server{
    private ServerName serverName;
    private volatile byte flag =0;
    /**
     * 进程睡眠时间
     */
    private static final long SLEEP_TIME=500L;

    private Sleeper stopSleeper =new Sleeper(SLEEP_TIME,this);

    private long serverStartTime;
    private long becomeACTIVEtime;
    private SoccerTrackerManager soccerTrackerManager;
    private ActiveServerManager activeServerManager;


    /**
     *
     * @param why
     * @param e
     */
    @Override
    public void abort(String why, Throwable e) {

    }

    @Override
    public boolean isAbortted() {
        return false;
    }

    @Override
    public void stop(String why) {

    }

    @Override
    public boolean isStopped() {
        return false;
    }

    @Override
    public void run() {

    }
}
