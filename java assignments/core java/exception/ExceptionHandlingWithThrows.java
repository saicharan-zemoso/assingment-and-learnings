package com.basics.exception;

public class ExceptionHandlingWithThrows {
    public static void main(String args[]) throws Exception{
        System.out.println("exception is handled by the compiler");
        try{
            int a= 100/0;
        }
        finally {
            System.out.println("this is executed even if the exception is not handled");
        }

        System.out.println("this is not executed as the exception is not handled immediately");

    }
}
