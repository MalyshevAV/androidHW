package com.android;

public class Lab11 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
    class MyThread  implements Runnable  {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                if (i % 10 == 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }
    }
