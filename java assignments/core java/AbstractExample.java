package com.basics;

public class AbstractExample extends AbstractImp {
    public void method1()
    {
        System.out.println("implementing the abstract method");
    }

}

abstract class AbstractImp{
    abstract public void method1();
    public void method2()
    {
        System.out.println("abstract class can have concreate methods and abstract methods");
    }
}
