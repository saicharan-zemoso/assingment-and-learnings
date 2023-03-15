package com.assignments.assignment6;

public class ArrayInitialization {
    ArrayInitialization(String str)
    {
        System.out.println("The string sent to constructor is "+str);
    }
    public static void main(String args[])
    {
        ArrayInitialization obj[]=new ArrayInitialization[10];
        System.out.println("array is initialized");
    }

}
