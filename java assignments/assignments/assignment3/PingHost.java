package com.assignments.assignment3;

import java.net.*;
import java.util.*;
public class PingHost {
    public static void main(String args[])
    {
        long start,end;
        boolean a;
        InetAddress address1;
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of hosts you want to ping:");
        n=Integer.parseInt(sc.nextLine());
        String site;
        long time[]=new long[n];
        try {
            i=0;
            while(i<n)
            {
                System.out.println("enter site or ip:");
                site= sc.nextLine();
                address1=InetAddress.getByName(site);
                start=System.currentTimeMillis();
                a=address1.isReachable(5000);
                end=System.currentTimeMillis();
                System.out.println("time taken is to reach "+site+" is "+(end-start)+" and is reachable "+a);
                time[i]=(end-start);
                i++;
            }
            Arrays.sort(time);
            if((n&1)==1)
            {
                System.out.println("the median of time taken to ping is "+(time[n/2]/1.0)+" ms");
            }
            else {
                System.out.println("the median of time taken to ping is "+((time[n/2]+time[n/2-1])/2.0)+" ms");
            }
        }catch (Exception e1)
        {
            System.out.println(e1.getMessage());
        }



    }
}
