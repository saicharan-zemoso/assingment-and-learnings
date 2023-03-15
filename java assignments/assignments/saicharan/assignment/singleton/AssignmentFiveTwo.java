package saicharan.assignment.singleton;

public class AssignmentFiveTwo {
    String str;
    static AssignmentFiveTwo obj;
    AssignmentFiveTwo(String str)
    {
        this.str=str;
    }
    public static AssignmentFiveTwo getObject(String s1)
    {
        // we cannot use nonstatic variables in static methods,but we can create a new object very time to we access this method
        //if we try to assign the string we get an error
        //to avoid that we are creating a new object every time or.
        //we can use this to create a sting object and get that single object
        if(obj==null) {
            obj = new AssignmentFiveTwo(s1);
            obj.str = s1;
        }

        return obj;
//        return new AssignmentFiveTwo(s1);
    }
    public void printString()
    {
        System.out.println("the string is "+str);
    }
}
