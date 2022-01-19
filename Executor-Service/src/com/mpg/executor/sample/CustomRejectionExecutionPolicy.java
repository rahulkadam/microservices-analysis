package com.mpg.executor.sample;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class CustomRejectionExecutionPolicy implements RejectedExecutionHandler {
    /**
     * Creates a {@code CustomRejectionExecutionHandler}.
     */
    public CustomRejectionExecutionPolicy() { }

    /**
     * Executes task r in the caller's thread, unless the executor
     * has been shut down, in which case the task is discarded.
     *
     * @param r the runnable task requested to be executed
     * @param e the executor attempting to execute this task
     */
    public void rejectedExecution(Runnable r, ThreadPoolExecutor e) {
        System.out.println("Rejected , so calling parent main thread and running task");
        if (!e.isShutdown()) {
            r.run();
        }
    }
}
