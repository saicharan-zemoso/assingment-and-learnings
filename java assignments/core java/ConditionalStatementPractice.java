package com.basics;

public class ConditionalStatementPractice {
    public static void main(String args[])
    {
        //types of if else statements are
        //1 if
        if(1%2==1)
        {
            System.out.println("odd number");
        }
        //2 if-else
        if(1%2==1)
        {
            System.out.println("odd number");
        }
        else {
            System.out.println("even number");
        }
        //3 if-else ladder
        if(3%7==1)
        {
            System.out.println("reminder is 1");
        }
        else if(3%7==2)
        {
            System.out.println("reminder is 2");
        }
        else
        {
            System.out.println("reminder is "+3%7);
        }
        //4 nested if else
        if(30<100)
        {
            if(30%2==0)
            {
                System.out.println("even number less then 100");
            }
            else{
                System.out.println("odd number less then 100");
            }
        }
        else{
            if(110%2==0)
            {
                System.out.println("even number more the 100");
            }
            else
            {
                System.out.println("odd number grater the 100");
            }
        }
    }
}
