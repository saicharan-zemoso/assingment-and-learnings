package com.basics;

public class StringsPractice {
    public  static void main(String args[])
    {
        String string1="h1";
        String string2="h1";
        String string3= new String("h1");
        char arr1[]={'h','i'};
        String string4 =new String(arr1);
        String string5= new String("hello welcome to programming");
        if(string1==string2)
        {
            System.out.println("both refer to same string");
        }
        //== checks references
        if(string1!=string3)
        {
            System.out.println("even the string is same but both refer to different string");
        }
        if(string1.equals(string3))
        {
            System.out.println("both strings are equal");
        }
        if(!string1.equals(string4))
        {
            System.out.println("the difference between "+string1+" and "+string4+" is returned as number and it is "+string1.compareTo(string4));
        }
        System.out.println("length of string"+string1.length());
        System.out.println("char at 0 is "+string1.charAt(0));
        System.out.println("substring of "+string5+"is"+string5.substring(6) );
        System.out.println("substring of "+string5+" is "+string5.substring(6,14) );
        //splits the string where it matches the given string
        for(String s:string5.split(" ",10))
            System.out.println(s);
        System.out.println("the string after replacing hello is "+string5.replace("hello","hi"));
        System.out.println("the index of the l is "+string5.indexOf("l"));
        System.out.println("the string in upper case is "+string5.toUpperCase());
        System.out.println("the string in lower case is "+string5.toLowerCase());
        System.out.println("join of strings "+String.join(";",string5.split(" ")));
    }
}
