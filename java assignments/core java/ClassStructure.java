package com.basics;

public class ClassStructure {
     public static void main(String arg[])
     {
         ImpClassStructure variable1=new ImpClassStructure();
         variable1.setValueOfA(10);
         variable1.setValueOfB(10);
         variable1.setValueOfC(10);
         variable1.setValueOfD(10);
     }
}
class ImpClassStructure{
    /*access specifiers are used to hide the data*/
    public int a; //accessed anywhere
    private int b; // accessed inside the same class
    protected int c; // accessed inside the class and subclasses
    int d; // default is accessed inside the same package
    static int e;
    // structure of methods is access specifier and return type and method name
    public void setValueOfA(int a)
    {
        this.a=a;
    }
    public void setValueOfB(int b)
    {
        this.b=b;
    }
    public void setValueOfC(int c)
    {
        this.c=c;
    }
    public void setValueOfD(int d)
    {
        this.d=d;
    }
}
