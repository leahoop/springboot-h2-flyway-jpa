package com.leahoop.current;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Tea {

    // T1Task 需要执行的任务：
// 洗水壶、烧开水、泡茶
    static class T1Task implements Callable<String> {
        FutureTask<String> ft2;

        // T1 任务需要 T2 任务的 FutureTask
        T1Task(FutureTask<String> ft2) {
            this.ft2 = ft2;
        }

        @Override
        public String call() throws Exception {
            System.out.println("T1: 洗水壶...");
            TimeUnit.SECONDS.sleep(1);

            System.out.println("T1: 烧开水...");
            TimeUnit.SECONDS.sleep(15);
            // 获取 T2 线程的茶叶
            String tf = ft2.get();
            System.out.println("T1: 拿到茶叶:" + tf);
            System.out.println("T1: 泡茶...");
            return " 上茶:" + tf;
        }
    }

    // T2Task 需要执行的任务:
// 洗茶壶、洗茶杯、拿茶叶
    static class T2Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            System.out.println("T2: 洗茶壶...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("T2: 洗茶杯...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("T2: 拿茶叶...");
            TimeUnit.SECONDS.sleep(1);
            return " 龙井 ";
        }
    }

}
