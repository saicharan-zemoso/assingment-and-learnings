package com.basics.innerclasses;

public class InnerClassesPractice {
    private int a=10;
    class InnerClass1
    {
        public void setIntA(int a)
        {
            InnerClassesPractice.this.a=a;
        }
        public  int getA()
        {
            return a;
        }
    }
}
class InnerClassPracticeWithPrivateVariables
{
    public static void main(String args[])
    {
        InnerClassesPractice obj1=new InnerClassesPractice();
        InnerClassesPractice.InnerClass1 iObj= obj1.new InnerClass1();
        iObj.setIntA(20);
        System.out.println(iObj.getA());
        InnerClassesPractice.InnerClass1 iObj1= obj1.new InnerClass1();
        iObj1.setIntA(30);
        System.out.println(iObj1.getA());
        System.out.println(iObj.getA());
    }
}
