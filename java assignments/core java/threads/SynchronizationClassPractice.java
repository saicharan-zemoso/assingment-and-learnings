package com.basics.threads;
import java.lang.Thread;
import com.basics.threads.SynchronizedSingletonClass;
import com.basics.threads.SynchronizationClassExtendedThread;

public class SynchronizationClassPractice {
    public static void main(String args[])
    {
        SynchronizedSingletonClass singleObject=SynchronizedSingletonClass.getObj();
        SynchronizationClassExtendedThread obj=new SynchronizationClassExtendedThread();
        obj.setName("common object");
        SynchronizationClassExtendedThread obj1=new SynchronizationClassExtendedThread(){public void run(){
            this.printWithSynchronizedBlock();
            this.printNumbers();
            singleObject.printWithWait();
        }};
        SynchronizationClassExtendedThread obj2=new SynchronizationClassExtendedThread(){public void run(){
            this.printWithSynchronizedBlock();
            this.printNumbers();
            try{
                Thread.sleep(1000);
            }
            catch (Exception e)
            {}

            singleObject.printWithNotify();
        }};
        obj1.setName("Thread1");
        obj2.setName("Thread2");
        obj1.start();
        obj2.start();
    }
}
