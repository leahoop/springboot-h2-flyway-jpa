package com.leahoop.current;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test2 {

    private static final Object lock = new Object();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        OutPrint out = new OutPrint();
//        new Thread(() -> {
//            out.priint1("Hello world");
//        }).start();
//
//        new Thread(() -> {
//            out.priint1("Bay Bay!");
//        }).start();


        FutureTask<String> ft2
                = new FutureTask<>(new Tea.T2Task());
        // 创建任务 T1 的 FutureTask
        FutureTask<String> ft1
                = new FutureTask<>(new Tea.T1Task(ft2));
        // 线程 T1 执行任务 ft1
        Thread T1 = new Thread(ft1);
        T1.start();
        // 线程 T2 执行任务 ft2
        Thread T2 = new Thread(ft2);
        T2.start();
        // 等待线程 T1 执行结果
        System.out.println(ft1.get());

    }

}
