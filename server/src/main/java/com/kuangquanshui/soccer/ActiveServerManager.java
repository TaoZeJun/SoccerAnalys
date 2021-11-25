package com.kuangquanshui.soccer;

import java.util.concurrent.atomic.AtomicBoolean;

public class ActiveServerManager extends ZooKeeperListener{

    public final AtomicBoolean clusterHasActiveServer=new AtomicBoolean(false);

    private final AtomicBoolean clusterisShutDown=new AtomicBoolean(false);

    private final SoccerServer server;

    /**
     * 当前server的节点
     */
    public  ServerName serverName=null;

    /**
     * 当前的server机器名
     */
    public final ServerName currentServer;


    public ActiveServerManager(ZooKeeperWatcher watcher ,ServerName currentServer) {
        super(watcher.getActiveServerAddressZnode(),watcher);
        this.currentServer = currentServer;
    }
}
