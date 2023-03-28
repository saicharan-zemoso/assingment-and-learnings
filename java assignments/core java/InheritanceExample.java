package com.basics;

public class InheritanceExample {
}

class A
{
    int a;
    public void method1()
    {
        this.a=10;
    }
}
//single inheritance
class B extends A
{
    int b;
    public void method1()
    {
        super.method1();
        this.b=20;
    }
}
//multilevel inheritance
class C extends B
{
    int c;
    public void method1()
    {
        super.method1();
        this.c=30;
    }
}
class D extends A{
    int d;
    public void method1() {
        super.method1();
        this.d=40;
    }
}


