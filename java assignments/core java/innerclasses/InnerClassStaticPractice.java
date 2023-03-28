package com.basics.innerclasses;

class InnerStaticPractice{
    static private int data;
    static class InnerStaticClassIMP{
        public int getData()
        {
            return data;
        }
        public void setData(int data)
        {
            InnerStaticPractice.data=data;
        }
    }
}
public class InnerClassStaticPractice {
    public static void main(String args[])
    {
        InnerStaticPractice.InnerStaticClassIMP obj1=new InnerStaticPractice.InnerStaticClassIMP();
        obj1.setData(20);
        System.out.println(obj1.getData());
    }
}
