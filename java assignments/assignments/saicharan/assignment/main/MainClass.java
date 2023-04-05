package saicharan.assignment.main;

import saicharan.assignment.data.DefaultInitializationOne;
import saicharan.assignment.singleton.AssignmentFiveTwo;

public class MainClass {
    public static void main(String arg[])
    {
        DefaultInitializationOne obj1=new DefaultInitializationOne();
        AssignmentFiveTwo obj2= AssignmentFiveTwo.getObject("new object got created");
        obj1.printVariables();
        obj2.printString();
    }
}
