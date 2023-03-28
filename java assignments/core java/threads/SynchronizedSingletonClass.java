package com.basics.threads;

public class SynchronizedSingletonClass {
    private static SynchronizedSingletonClass obj=null;
    private SynchronizedSingletonClass()
    {

    }
    public synchronized void printWithWait()
    {
        System.out.println("the thread entered this print wait method is "+Thread.currentThread().getName());
        for(int i=1;i<6;i++)
        {
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName()+" thread is going to wait...");
        try{wait();}
        catch (Exception e)
        {
            System.out.println("handled wait exception");
        }
        System.out.println(Thread.currentThread().getName()+" executed after wait");
    }
    public synchronized void printWithNotify()
    {
        System.out.println(Thread.currentThread().getName()+" entered the notify method");
        try{Thread.sleep(1000);}
        catch (Exception e)
        {}
        System.out.println("now it is going to notify the waiting thread ");
        notifyAll();
    }
    public synchronized static SynchronizedSingletonClass getObj()
    {
        if(obj==null)
        {
            obj=new SynchronizedSingletonClass();
        }
        return obj;
    }
}
