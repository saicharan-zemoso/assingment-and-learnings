package com.basics.threads;

class SynchronizationClassExtendedThread extends Thread{
    //if we don't use synchronized method then multiple threads can run this method and output can be undetermined
    //if we use synchronized method only one thread can access this method if we use sleep() in this the other threads will wait for this thread to complete its execution
    public synchronized void printNumbers()
    {
        System.out.println("the thread entered the synchronized method is " + this.getName());
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
    public void printWithSynchronizedBlock()
    {
        synchronized (this)
        {
            System.out.println("the thread entered the synchronized method is " + this.getName());
            for (int i = 11; i < 20; i++)
                System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            System.out.println("gives time to complete its execution");
        }
    }

}