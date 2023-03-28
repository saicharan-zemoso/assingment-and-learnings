package com.basics.threads;
import java.lang.Thread;
import java.lang.Runnable;
class ThreadsCreation1 extends Thread
{
    public void run()
    {
        System.out.println("the thread class is extended to create a thread and name of thread is "+Thread.currentThread().getName());
        System.out.println("state of the thread with name "+Thread.currentThread().getName()+" is "+Thread.currentThread().getState());
    }
}

class ThreadsCreation2 implements Runnable
{
    public void run()
    {
        System.out.println("Thread is created using the runnable interface and thread name is "+Thread.currentThread().getName());
        System.out.println("state of the thread with name "+Thread.currentThread().getName()+" is "+Thread.currentThread().getState());
        try{Thread.sleep(1500);}
        catch (Exception e){
            System.out.println("runnable thread is sleeping");
        }
    }
}

public class ThreadsPractice {
    public static void main(String args[])
    {
       ThreadsCreation1 t1= new ThreadsCreation1();
       ThreadsCreation2 it2=new ThreadsCreation2();
       Thread t2= new Thread(it2,"runnable implemented thread");
       t1.setName("obj of extended thread class");
       System.out.println("state of the thread with name "+t1.getName()+" is "+t1.getState());
       System.out.println("state of the thread with name "+t2.getName()+" is "+t2.getState());
       t1.start();
       t2.start();

       try {
           t1.join();
       }catch (Exception e)
       {
           System.out.println("thrown by the join method");
       }
        System.out.println("state of the thread after completion of execution with name "+t1.getName()+" is "+t1.getState());
        System.out.println("state of the thread while sleeping with name "+t2.getName()+" is "+t2.getState());
        try{
            t2.join(1500);
        }catch (Exception  e)
        {
            System.out.println("the main thread will thrown the exception");
        }
        System.out.println("state of the thread after execution with name "+t2.getName()+" is "+t2.getState());

    }
}
