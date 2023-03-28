package com.assignments.assignment8;

public class SecondException extends Exception{
    SecondException()
    {
        super("this is the second custom exception");
    }
    SecondException(String msg)
    {
        super(msg);
    }

}
