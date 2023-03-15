package com.assignments.assignment8;

import com.assignments.assignment8.*;
import java.util.Random;
public class AssignmentEight {
    public static void main(String args[])
    {
        AssignmentEight obj1=new AssignmentEight();
        try{
            obj1.throwsExceptions();

        }
        catch (FirstException | SecondException | ThirdException e1)
        {
            System.out.println(e1.getMessage()+" was thrown");
            throw new NullPointerException();
        }
        finally {
            System.out.println("The finally block is executed even after the null pointer exception was thrown ");
        }
    }
    public void throwsExceptions() throws FirstException,SecondException,ThirdException
    {
        Random r1= new Random();
        int num= r1.nextInt(1000);
        if(num%3==0)
        {
            throw new FirstException();
        } else if (num%3==1) {
            throw new SecondException();

        }
        else {
            throw new ThirdException();
        }

    }

}
