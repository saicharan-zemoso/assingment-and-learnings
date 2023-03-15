package com.assignments.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class FindRange {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("enter no of test cases:");
        n= Integer.parseInt(sc.nextLine());
        System.out.println("enter "+n+" testcases");
        String inputs[]=new String[n];
        for(i=0;i<n;i++)
        {
            inputs[i]=sc.nextLine();
        }
        for(i=0;i<n;i++)
        {
            String inputSplits[]=inputs[i].split(" ");
            String signupDate[]=inputSplits[0].split("-");
            String currentDate[]=inputSplits[1].split("-");

            LocalDate sup=LocalDate.of(Integer.parseInt(signupDate[2]),Integer.parseInt(signupDate[1]),Integer.parseInt(signupDate[0]));
            LocalDate curr=LocalDate.of(Integer.parseInt(currentDate[2]),Integer.parseInt(currentDate[1]),Integer.parseInt(currentDate[0]));

            if(ChronoUnit.DAYS.between(sup,curr)<0||ChronoUnit.DAYS.between(sup,curr)<335)
            {
                System.out.println("no range");
            }
            else {
                LocalDate start=LocalDate.of(Integer.parseInt(currentDate[2]),Integer.parseInt(signupDate[1]),Integer.parseInt(signupDate[0]));
                start=start.minusDays(30);
                long diff=ChronoUnit.DAYS.between(start,curr);
                if(diff<0)
                {
                    System.out.println(start.minusDays(365).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+start.minusDays(305).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                } else if (diff<60) {
                    System.out.println(start.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+start.plusDays(diff).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                    
                }
                else {
                    System.out.println(start.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+start.plusDays(60).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                }
            }

        }

    }
}
