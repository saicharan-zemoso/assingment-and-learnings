package com.assignments.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;
public class AssignmentNine {
    public static void main(String args[])
    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        input=sc.nextLine();
        if(Pattern.matches("^[A-Z].*[.]$",input))
        {
            System.out.println("The given sentence\n"+input+"\nstart with capital letter and ends with a period");
        }
        else if(Pattern.matches(".*[.]$",input))
        {
            System.out.println("The given sentence\n"+input+"\ndoes not start with capital letter");
        }
        else if(Pattern.matches("^[A-Z].*",input))
        {
            System.out.println("The given sentence\n"+input+"\ndoes not end with a period");
        }
        else
        {
            System.out.println("The given sentence\n"+input+"\ndoes not start with capital letter and does not ends with a period as well");
        }

    }
}
