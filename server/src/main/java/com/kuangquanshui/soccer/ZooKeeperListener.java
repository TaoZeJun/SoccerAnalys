package com.kuangquanshui.soccer;

public class ZooKeeperListener {
    protected final String znode;
    protected final ZooKeeperWatcher watcher;

    public ZooKeeperListener(String znode, ZooKeeperWatcher watcher) {
        this.znode = znode;
        this.watcher = watcher;
    }
}
