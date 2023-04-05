package com.assignments.assignment7;

public class RabbitClass extends RodentClass {
    RabbitClass()
    {
        System.out.println("rabbit also have sharp teeth and they are very fast and mostly found in jungles");
    }
    public boolean hasIncisorTeeth()
    {
        System.out.println("for rabbit class");
        return incisorTeeth;
    }
    public boolean hasLongTail()
    {
        return false;
    }
    public boolean hasLongEars()
    {
        return true;
    }
}
