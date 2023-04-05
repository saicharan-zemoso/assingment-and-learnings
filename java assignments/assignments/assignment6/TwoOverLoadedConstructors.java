package com.assignments.assignment6;

public class TwoOverLoadedConstructors {
    int num;
    String str;
    TwoOverLoadedConstructors()
    {
        num=10;
        System.out.println("The first constructor is being executed");
    }
    TwoOverLoadedConstructors(String msg)
    {
        this();
        str=msg;
        System.out.println("The second constructor is being executed");
    }
    public static void main(String args[])
    {
        TwoOverLoadedConstructors obj1= new TwoOverLoadedConstructors("This is an example of constructor chaining");
        System.out.println("The objected is created and the int value is "+obj1.num+"\nand string is "+obj1.str);
    }
}
