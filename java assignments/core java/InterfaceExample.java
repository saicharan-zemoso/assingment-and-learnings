package com.basics;

public class InterfaceExample implements Interface1,Interface2 {
    public void method1()
    {
        System.out.println("In method1");
    }
    public void method11()
    {
        System.out.println("In method11");
    }
    public void method3()
    {
        Interface1.super.method3();
        Interface2.super.method3();
    }
}

interface Interface1
{
    //by default variables declared are public static and final
    int a=10;
    public void method1();
    static void method2(){
        System.out.println("it allows the static methods");
    }
    default void method3()
    {
        System.out.println("it allows the default method");
    }
}

interface Interface2
{
    //by default variables declared are public static and final
    int b=10;
    public void method11();
    static void method22(){
        System.out.println("it allows the static methods");
    }
    default void method3()
    {
        System.out.println("it allows the default method");
    }
}