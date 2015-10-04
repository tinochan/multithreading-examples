package com.tinochan.multithreading.startthreads;

/**
 * Created by tino on 4/10/15.
 */

class ConcurrentJobR implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<8; i++){
            System.out.println(Thread.currentThread().getName() + " ConcurrentJobR Running task " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ImplementsRunnable {

    public static void main(String[] args){
        Thread job1 = new Thread(new ConcurrentJobR());
        job1.start();
        Thread job2 = new Thread(new ConcurrentJobR());
        job2.start();
    }
}
