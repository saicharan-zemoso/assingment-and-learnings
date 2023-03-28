package com.assignments.assignment8;

public class FirstException extends Exception{
    FirstException()
    {
        super("This is custom exception 1");
    }
    FirstException(String msg)
    {

            super(msg);

    }
}
