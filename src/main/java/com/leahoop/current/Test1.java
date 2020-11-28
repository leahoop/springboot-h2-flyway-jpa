package com.leahoop.current;

import java.util.concurrent.CountDownLatch;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {

        int num = 1;


        for (int i = 0; i < 100; i++) {
            CountDownLatch countDownLatch1 = new CountDownLatch(1);
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            new Thread(() -> {
                System.out.println(num);
                countDownLatch1.countDown();
            }).start();

            new Thread(() -> {
                System.out.println("2222");
                countDownLatch2.countDown();
            }).start();
            countDownLatch1.await();
            countDownLatch2.await();
//            b.join();
//            a.join();
            System.out.println("执行完了");
            System.out.println("==================");
        }

    }

}
