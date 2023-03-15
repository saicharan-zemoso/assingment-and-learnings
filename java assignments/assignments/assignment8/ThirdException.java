package com.assignments.assignment8;

public class ThirdException extends Exception{
    ThirdException()
    {
        super("This is third custom exception");
    }
    ThirdException(String msg)
    {
        super(msg);
    }
}
