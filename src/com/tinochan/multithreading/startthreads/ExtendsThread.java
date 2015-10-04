package com.tinochan.multithreading.startthreads;

/**
 * Created by tino on 4/10/15.
 */

class ConcurrentJob extends Thread{

    @Override
    public void run(){
        for(int i=0; i<8; i++){
            System.out.println(Thread.currentThread().getName() + " ConcurrentJob Running task " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ExtendsThread {

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        ConcurrentJob job1 = new ConcurrentJob();
        System.out.println("Time needed to create a thread: " + (System.currentTimeMillis() - start));

        ConcurrentJob job2 = new ConcurrentJob();
        job1.start();
        job2.start();
    }
}
