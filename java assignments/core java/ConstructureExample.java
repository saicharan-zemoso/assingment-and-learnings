package com.basics;

public class ConstructureExample {
    public static void main(String arg[])
    {
        ConstructureImp def=new ConstructureImp();
        ConstructureImp par=new ConstructureImp(20,30);
    }
}
class ConstructureImp{
    int a;
    private int b;
    ConstructureImp()
    {
        a=10;
        b=20;
    }
    ConstructureImp(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}