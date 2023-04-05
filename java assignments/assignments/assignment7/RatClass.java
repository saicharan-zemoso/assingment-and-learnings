package com.assignments.assignment7;

public class RatClass extends RodentClass{
    RatClass()
    {
        System.out.println("rats have sharp teeth and mostly found in dirty places");
    }
    public boolean hasIncisorTeeth()
    {
        System.out.println("for rat class");
        return incisorTeeth;
    }
    public boolean hasLongTail()
    {
        return true;
    }
    public boolean hasLongEars()
    {
        return false;
    }
}
