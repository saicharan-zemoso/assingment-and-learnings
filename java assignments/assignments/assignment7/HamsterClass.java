package com.assignments.assignment7;

public class HamsterClass extends RodentClass{
    HamsterClass()
    {
        System.out.println("hamsters also have sharp teeth and some people love to have them as pets");
    }
    public boolean hasIncisorTeeth()
    {
        System.out.println("for hamster class");
        return incisorTeeth;
    }
    public boolean hasLongTail()
    {
        return false;
    }
    public boolean hasLongEars()
    {
        return false;
    }
}
