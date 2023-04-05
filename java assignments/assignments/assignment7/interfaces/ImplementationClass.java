package com.assignments.assignment7.interfaces;

public class ImplementationClass extends ConcreateClass implements CombinedInterface{

    public void interfaceOneMethod1() {
        System.out.println("1st interface method1 is written");
    }


    public void interfaceOneMethod2() {
        System.out.println("1st interface method2 is written");
    }


    public void interfaceTwoMethod1() {
        System.out.println("2nd interface method1 is written");
    }


    public void interfaceTwoMethod2() {
        System.out.println("2nd interface method2 is written");
    }


    public void interfaceThreeMethod1() {
        System.out.println("3rd interface method1 is written");
    }


    public void interfaceThreeMethod2() {
        System.out.println("3rd interface method2 is written");
    }


    public void combinedMethod() {
        System.out.println("Combined interface method is written");
    }

    public void methodOne(InterfaceOne obj)
    {
        obj.interfaceOneMethod1();
        obj.interfaceOneMethod2();
    }

    public void methodTwo(InterfaceTwo obj)
    {
        obj.interfaceTwoMethod1();
        obj.interfaceTwoMethod2();
    }

    public void methodThree(InterfaceThree obj)
    {
        obj.interfaceThreeMethod1();
        obj.interfaceThreeMethod2();
    }

    public void methodFour(CombinedInterface obj)
    {
        obj.combinedMethod();
    }

    public static void main(String args[])
    {
        ImplementationClass obj=new ImplementationClass();
        obj.methodOne(obj);
        obj.methodTwo(obj);
        obj.methodThree(obj);
        obj.methodFour(obj);
    }

}
