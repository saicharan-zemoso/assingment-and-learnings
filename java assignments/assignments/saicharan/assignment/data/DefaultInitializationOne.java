package saicharan.assignment.data;

public class DefaultInitializationOne {
    //by default instant variables are assigned int is 0 and str is empty string
    int num;
    String str;
    public void printVariables()
    {
        System.out.println("the int instant variable value is "+num+"\nthe string instant variable is "+str );
    }
//    public void printLocalVariables()
//    {
//        int num;
//        String str;
//        try{
//            System.out.println("the integer value for local un assigned variable is "+num);
//            System.out.println("the string value for local un assigned variable "+str);
//        }
//        catch (NullPointerException e1)
//        {
//            System.out.println(e1.getMessage());
//        }
//    }
    public static void main(String args[])
    {
        DefaultInitializationOne obj1=new DefaultInitializationOne();
        obj1.printVariables();
//        obj1.printLocalVariables();
    }
}
