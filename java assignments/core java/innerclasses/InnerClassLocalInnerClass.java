package com.basics.innerclasses;
class LocalInnerClassPractice{
    private int a;
    public void setA(int b)
    {
        class LocalInnerClassCon{
            public void setOutterA(int a)
            {
                LocalInnerClassPractice.this.a=a;
            }
        }
        LocalInnerClassCon obj1=new LocalInnerClassCon();
        obj1.setOutterA(b);
    }
    public int getA()
    {
        return a;
    }
}
public class InnerClassLocalInnerClass {
    public static void main(String args[])
    {
        LocalInnerClassPractice obj1=new LocalInnerClassPractice();
        obj1.setA(20);
        System.out.println(obj1.getA());
    }
}
