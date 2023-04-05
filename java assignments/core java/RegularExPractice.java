package com.basics;
import java.util.regex.*;
public class RegularExPractice {
    public static void main(String args[])
    {
        Pattern pattern1= Pattern.compile("(a*b)foo");
        Matcher matcher1= pattern1.matcher("aabfooabfooaaabfooaabfoo");
        //find is used to find the next match
        //group is to return the match
        //start give the start index of match
        //end gives end index of match
        while(matcher1.find()) {
            System.out.println(matcher1.group()+" start index at "+matcher1.start()+" end index at "+matcher1.end());
        }
        pattern1=Pattern.compile("[\\w.]*@(gmail.com|hotmail.com|email.com)");
        matcher1=pattern1.matcher("Saicharan1402@gmail.com Saicharan1402@hotmail.com Saicharan1402@email.com saicharan.995121@gmail.com");
        while(matcher1.find()) {
            System.out.println(matcher1.group()+" start index at "+matcher1.start()+" end index at "+matcher1.end());
        }
        //matches return if the given string is in the pattern
        matcher1=pattern1.matcher("Saicharan1402@gmail.com");
        //matches can be used directly like this
        System.out.println(matcher1.matches());
        System.out.println(Pattern.matches("[\\w.]*@gmail.com","saicharan.995121@gmail.com"));

    }
}
