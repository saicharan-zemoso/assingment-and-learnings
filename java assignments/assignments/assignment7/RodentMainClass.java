package com.assignments.assignment7;

public class RodentMainClass {
    public static void main(String args[])
    {
        RodentClass arr[]=new RodentClass[3];
        arr[0]=new RatClass();
        arr[1]=new RabbitClass();
        arr[2]=new HamsterClass();
        System.out.println("rat class assigned to Rodentclass and has incisor teeth is"+arr[0].hasIncisorTeeth()+" has long tail is "+arr[0].hasLongTail()+" has long ears is "+arr[0].hasLongEars());
        System.out.println("rabbit class assigned to Rodentclass and has incisor teeth is"+arr[1].hasIncisorTeeth()+" has long tail is "+arr[1].hasLongTail()+" has long ears is "+arr[1].hasLongEars());
        System.out.println("hamster class assigned to Rodentclass and has incisor teeth is"+arr[2].hasIncisorTeeth()+" has long tail is "+arr[2].hasLongTail()+" has long ears is "+arr[2].hasLongEars());
    }
}
