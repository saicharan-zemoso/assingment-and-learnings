package com.basics.exception;

public class ExceptionHandlingPractice {
    public static void main(String args[])
    {
        System.out.println("this is exception handling example");
        //exception are the interrupts in the flow of the program.
        //there are two types of exceptions 1. checked which are caught at compile time and 2. unchecked these are at runtime.
        //we use try keyword to declare a block to catch any error or exception which may contain error
        //we use catch block to handle the exception that was occurred in the try block.
        //we can use throws keyword to let the compiler handel the exception.
        /**
         * types of exceptions are
         * 1. arithmetic exception.
         * 2. nullpionter exception.
         * 3. array out of bounds exception....etc
         */
        //example
        try{
            int a=100/0;
            System.out.println("the above line gives error and the lines below are skipped");
        }
        catch (NullPointerException e){
            System.out.println(e);
    }
        catch (Exception e)
        {
            System.out.println(e);
        }
        // we can have multiple catch blocks and, they should be in the order from most specific to general.
        //if now it will give compile time error
        System.out.println("if the error is handled  correctly then this statement executes");
    }
}
