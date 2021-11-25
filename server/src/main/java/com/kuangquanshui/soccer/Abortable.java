package com.kuangquanshui.soccer;

public interface Abortable {
    void abort(String why,Throwable e);

    boolean isAbortted();
}
