package com.leahoop.current;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class X {
    private final Lock rtl =
            new ReentrantLock();
    int value = 0;

    public int get() {
        // 获取锁
        rtl.lock();
        try {
            return value;
        } finally {
            // 保证锁能释放
            rtl.unlock();
        }
    }

    public void addOne() {
        // 获取锁
        rtl.lock();
        try {
            value = 1 + get();
        } finally {
            // 保证锁能释放
            rtl.unlock();
        }
    }

}
