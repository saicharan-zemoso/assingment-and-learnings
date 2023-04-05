package com.assignments.assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class AssignmentEleven {

    public static void main(String args[]) {
        int a;
        HashMap map1=new HashMap<Character,Integer>();
        String s1;
        Iterator keys1,values1;
        try {
            FileReader input1 = new FileReader("C:\\Users\\sai charan\\IdeaProjects\\javaLearnings\\src\\com\\assignments\\assignment11\\"+args[0]);
            FileWriter output1=new FileWriter("C:\\Users\\sai charan\\IdeaProjects\\javaLearnings\\src\\com\\assignments\\assignment11\\"+args[1]);
            a=input1.read();
            while(a!=-1)
            {
                if(map1.get((char)a)!=null)
                {
                    map1.put((char)a,(Integer)map1.get((char)a)+1);
                }
                else {
                    map1.put((char)a,1);
                }
                a=input1.read();
            }
            keys1=map1.keySet().iterator();
            values1=map1.values().iterator();
            output1.write("The characters in the file and their count is\n");
            output1.write("characters\t count\n");
            while (keys1.hasNext())
            {
                s1=keys1.next()+"\t\t\t\t"+values1.next()+"\n";
                output1.write(s1);
            }
            input1.close();
            output1.close();


        }catch (IOException e1)
        {
            System.out.println(e1.getMessage());
        }

    }

}
