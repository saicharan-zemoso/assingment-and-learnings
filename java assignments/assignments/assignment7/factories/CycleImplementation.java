package com.assignments.assignment7.factories;

public class CycleImplementation {
    public static void main(String args[])
    {
        Cycle obj[]=new Cycle[3];
        obj[0]=new UniCycleFactory().getUniCycle();
        obj[1]=new BiCycleFactory().getBiCycle();
        obj[2]=new TriCycleFactory().getTriCycle();
        obj[0].cycle();
        obj[1].cycle();
        obj[2].cycle();
    }
}
