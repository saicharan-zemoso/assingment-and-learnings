package com.assignments.assignment2;

import java.util.Scanner;
import java.util.Arrays;

public class SearchAlphabets {
    public static void main(String args[])
    {
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("enter the string to search");
        String inputString=new String(inputScanner.nextLine().toLowerCase());
        byte stringBytes[]=inputString.getBytes();
        int count=26;
        boolean findAlphas[]=new boolean[26];
        Arrays.fill(findAlphas,false);
        int i=0;
        while(count!=0&&i<inputString.length())
        {
            if(stringBytes[i]>=97&&stringBytes[i]<=122)
            {
                if(!findAlphas[stringBytes[i]-97])
                {
                    findAlphas[stringBytes[i]-97]=true;
                    count--;
                }
            }
            i++;
        }
        if(count==0)
        {
            System.out.println(inputString+" contains all alphabets");
        }
        else {
            System.out.println(inputString+" does not contain all alpha bets");
        }
        // alternateMethod();
	//time complexity of this method is O(n) where n is the length of the string
	//best case scenario O(26)
	//worst case scenario O(n)
	//average case scenario O(n)
    //space complexity is O(n) for the byte array

    }

    // public static void alternateMethod()
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the input string:");
    //     String input=new String(sc.nextLine().toLowerCase());
    //     String alphabets="abcdefghijklmnopqrstuvwxyz";
    //     int count=0;
    //     for(int i=0;i<26;i++)
    //     {
    //         if(input.indexOf(alphabets.charAt(i))<0)
    //         {
    //             break;
    //         }
    //         else{
    //             count++;
    //         }
    //     }

    //     if(count==26)
    //     {
    //         System.out.println(input+"  contains all alphabets");
    //     }
    //     else{
    //         System.out.println(input+" string does not contain all alphabets");
    //     }
    //     //time complexity of the above code is O(26n)
    //     //space complexity is O(1)
    // }
}
