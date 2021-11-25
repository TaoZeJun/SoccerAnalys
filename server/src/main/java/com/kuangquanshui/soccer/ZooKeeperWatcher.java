package com.kuangquanshui.soccer;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ZooKeeperWatcher implements Watcher,Abortable, Closeable {
    private static final long ZK_WAIT_TIME=500L;
    protected Abortable abortable;
    private boolean abort =false;
    /**
    *集群
     */
    private final String quorum;

    private String baseZKNode;

    private String activeServerAddressZnode;

    private String backupServerAddressZnode;

    private String clusterIdZnode;

    /**
     * 集群状态节点
     */

    private String clusterStateZnode;

    private final List<ZooKeeperListener> listeners=new CopyOnWriteArrayList<>();
    public ZooKeeperWatcher() {
    }

    @Override
    public void abort(String why, Throwable e) {

    }

    @Override
    public boolean isAbortted() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public void process(WatchedEvent watchedEvent) {

    }

    public static long getZkWaitTime() {
        return ZK_WAIT_TIME;
    }

    public Abortable getAbortable() {
        return abortable;
    }

    public void setAbortable(Abortable abortable) {
        this.abortable = abortable;
    }

    public boolean isAbort() {
        return abort;
    }

    public void setAbort(boolean abort) {
        this.abort = abort;
    }

    public String getQuorum() {
        return quorum;
    }

    public String getBaseZKNode() {
        return baseZKNode;
    }

    public void setBaseZKNode(String baseZKNode) {
        this.baseZKNode = baseZKNode;
    }

    public String getActiveServerAddressZnode() {
        return activeServerAddressZnode;
    }

    public void setActiveServerAddressZnode(String activeServerAddressZnode) {
        this.activeServerAddressZnode = activeServerAddressZnode;
    }

    public String getBackupServerAddressZnode() {
        return backupServerAddressZnode;
    }

    public void setBackupServerAddressZnode(String backupServerAddressZnode) {
        this.backupServerAddressZnode = backupServerAddressZnode;
    }

    public String getClusterIdZnode() {
        return clusterIdZnode;
    }

    public void setClusterIdZnode(String clusterIdZnode) {
        this.clusterIdZnode = clusterIdZnode;
    }

    public String getClusterStateZnode() {
        return clusterStateZnode;
    }

    public void setClusterStateZnode(String clusterStateZnode) {
        this.clusterStateZnode = clusterStateZnode;
    }

    public List<ZooKeeperListener> getListeners() {
        return listeners;
    }
}
