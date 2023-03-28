package com.basics;

public class LoopsPractice {
    public static void main(String args[])
    {
        //types of loops are
        //1 for loop
        //types of for loop
        String practiceArray[]={"hi","bye","charan","sai"};
        int i=0;
        //1.1 for loop
        for(i=0;i<practiceArray.length;i++)
        {
            System.out.println(practiceArray[i]);
        }
        //1.2 for each loop
        for(String eachString:practiceArray)
        {
            System.out.println(eachString);
        }
        //2 while loop
        i=0;
        while(i<practiceArray.length)
        {
            System.out.println(practiceArray[i]);
            i++;
        }
        //do while loop
        i=0;
        do{
            System.out.println(practiceArray[i]);
            i++;
        }while (i<practiceArray.length);
    }
}
