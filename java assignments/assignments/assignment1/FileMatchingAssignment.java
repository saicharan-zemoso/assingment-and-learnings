package com.assignments.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileMatchingAssignment {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the path:");

        String path=sc.nextLine();

        //"C:\\Users\\sai charan\\OneDrive\\Documents";

        File file1=new File(path);

        File[] files=file1.listFiles();
        while(true) {
            boolean notFound=true;
            System.out.println("\nenter the pattern for the files: ");
            String pattern= sc.nextLine();

            System.out.println("\nThe files with pattern "+pattern+" files in that path are ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("sleep for interrupted");
            }
            for (File s : files) {
                if (Pattern.compile(pattern).matcher(s.getName()).find()){
                    System.out.println(s.getName() + "\n path is " + s.getAbsolutePath());
                    notFound=false;
                }
            }
            if(notFound)
            {
                System.out.println("there no are files with the "+pattern+" in this path "+path);
            }
        }

    }

}
