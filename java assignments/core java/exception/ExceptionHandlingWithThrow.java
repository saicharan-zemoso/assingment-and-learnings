package com.basics.exception;

public class ExceptionHandlingWithThrow extends Exception {
    ExceptionHandlingWithThrow()
    {
        super("this how we create our own exception");
    }
    public static void main(String args[])
    {
        //java also support multiple try blocks and nested try blocks
        try {
            try {
                try {
                    throw new ArithmeticException();
                } catch (ArithmeticException ae) {
                    System.out.println(ae);
                }
                try {
                    try {
                        throw new NullPointerException();
                    } catch (StringIndexOutOfBoundsException sioobe) {
                        System.out.println(sioobe);
                    }
                } catch (NullPointerException np) {
                    System.out.println(np);
                }
                throw new ExceptionHandlingWithThrow();
            } catch (ExceptionHandlingWithThrow e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e)
        {
            System.out.println("if any inner exceptions are not handled then this will get executed");
        }
        finally {
            System.out.println("this will get executed even when the exception is not handled");
        }


    }
}
