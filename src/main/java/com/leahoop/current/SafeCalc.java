package com.leahoop.current;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeCalc {
    int value = 0;

    private static final Lock lock = new ReentrantLock();

    int get() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }

    synchronized int addOne() {
        return value++;
    }
}
