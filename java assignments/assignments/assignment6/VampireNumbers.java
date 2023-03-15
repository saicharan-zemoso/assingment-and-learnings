package com.assignments.assignment6;


public class VampireNumbers {
    public static void main(String args[])
    {
        int count,vamp,x,y,mul=100,len=1,temp;
        boolean flag=true;
        int nums[]={0,0,0,0,0,0,0,0,0,0};
        System.out.println("The first 100 vampire numbers are");
        vamp=10;
        count=0;
        while (count<100)
        {
//            System.out.println("count loop");
            if(vamp<mul) {
                x=len;
                while(x<len*10)
                {
//                    System.out.println("vamp loop "+x+"vamp val"+vamp);
                    flag=true;
                    if(vamp%x==0)
                    {
//                        System.out.println("vamp loop "+x+"vamp val"+vamp);
                        y=vamp/x;
                        if(y<x)
                        {
                            break;
                        }
                        if(x%10==0&&y%10==0)
                        {
                            x+=1;
                            continue;
                        }
                        temp=x;
                        while(temp!=0)
                        {
                            nums[temp%10]+=1;
                            temp=temp/10;
                        }
                        temp=y;
                        while(temp!=0)
                        {
                            nums[temp%10]+=1;
                            temp=temp/10;
                        }
                        temp=vamp;
                        while(temp!=0)
                        {
                            nums[temp%10]-=1;
                            temp=temp/10;
                        }
                        for(int i=0;i<10;i++)
                        {
                            if(nums[i]!=0)
                            {
                                nums[i]=0;
                                flag=false;
                            }
                        }
                        if(flag)
                        {
                            System.out.println(vamp+" "+x+" "+y);
                            count++;
                            break;
                        }


                    }
                    x++;
                }

            }
            else
            {
                vamp=vamp*10;
                mul=mul*100;
                len=len*10;
            }
            vamp++;


        }
    }
}
