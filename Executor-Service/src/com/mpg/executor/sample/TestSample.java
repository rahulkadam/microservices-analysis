package com.mpg.executor.sample;


import java.util.Random;
import java.util.concurrent.*;

public class TestSample {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        System.out.println("Testing Executor Service");
        Executor_CallerRunsPolicy();
        System.out.println("End outer");
    }


    public static void Executor_CallerRunsPolicy() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService= new ThreadPoolExecutor(3,3,
                500, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2), new CustomRejectionExecutionPolicy());

        for(int i=0; i<10; i++) {
            executorService.execute(SampleTask("Test  " + i ));
        }
        System.out.println("Ending");
        executorService.shutdown();
    }

    public static void Executor_CustomRunsPolicy() throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService= new CustomExecutor(3,3,
                500, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2), new CustomRejectionExecutionPolicy());

        for(int i=0; i<10; i++) {
            executorService.execute(SampleTask("Test  " + i ));
        }
        System.out.println("Ending");
        executorService.shutdown();
    }

    private static Runnable SampleTask(String msg) {
        return () -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int random = (int) (1000*Math.random());
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(msg + " Number : " + random + " ::  " + name);
            };
    }

}
