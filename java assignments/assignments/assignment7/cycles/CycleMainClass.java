package com.assignments.assignment7.cycles;

public class CycleMainClass {
    public static void main(String args[])
    {
        CycleClass obj[]=new CycleClass[3];
        obj[0]=new UniCycleClass();
        obj[1]=new BicycleClass();
        obj[2]=new TriCycle();
        System.out.println("the balance method is called when upcasting casting");
        obj[0].balance();
        obj[1].balance();
        obj[2].balance();
        System.out.println("the balance method is called after down casting");
        new UniCycleClass().balance();
        new BicycleClass().balance();
        new TriCycle().balance();
    }
}
