package com.assignments.assignment6;

public class ArrayInitializationTwo {
    ArrayInitializationTwo(String str)
    {
        System.out.println("The string sent to constructor is "+str);
    }
    public static void main(String args[])
    {
        ArrayInitializationTwo obj[]=new ArrayInitializationTwo[10];
        for (int i=0;i<10;i++)
        {
            obj[i]=new ArrayInitializationTwo("new "+(i+1)+" object is created");
        }

        System.out.println("array is initialized and objects are assigned ");
    }
}
