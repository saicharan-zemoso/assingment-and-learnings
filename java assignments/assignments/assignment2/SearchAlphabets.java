package com.assignments.assignment2;

import java.util.Scanner;

public class SearchAlphabets {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to search");
        String string=new String(sc.nextLine().toLowerCase());
        byte b[]=string.getBytes();
        int count=26;
        boolean findAlphas[]=new boolean[26];
        for(int i=0;i<26;i++)
        {
            findAlphas[i]=false;
        }
        int i=0;
        while(count!=0&&i<string.length())
        {
            if(b[i]>=97&&b[i]<=122)
            {
                if(!findAlphas[b[i]-97])
                {
                    findAlphas[b[i]-97]=true;
                    count--;
                }
            }
            i++;
        }
        if(count==0)
        {
            System.out.println(string+" contains all alphabets");
        }
        else {
            System.out.println(string+" does not contain all alpha bets");
        }

    }
}
