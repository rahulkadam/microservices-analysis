package com.mpg.executor.sample;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutor extends ThreadPoolExecutor {

    public CustomExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    protected void beforeExecute(Thread t, Runnable r) {
        System.out.println("Before Execution " + t.getName());
    }

    protected void afterExecute(Runnable r, Throwable t) {
        Thread tr = Thread.currentThread();
        String name = tr.getName();
        System.out.println("after Execution  : " + name);
    }

}
