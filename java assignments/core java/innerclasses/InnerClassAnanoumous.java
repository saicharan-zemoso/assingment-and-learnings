package com.basics.innerclasses;

abstract class AnonymousClassPractice
{
    //private does not work
    protected int a=10;
    abstract void setA(int a);
    abstract int getA();
}

public class InnerClassAnanoumous {
    public static void main(String args[])
    {
        AnonymousClassPractice obj1=new AnonymousClassPractice(){ public void setA(int a){
            this.a=a;
        }
        public int getA()
        {
            return a;
        }};
        System.out.println(obj1.getA());
        obj1.setA(30);
        System.out.println(obj1.getA());


    }
}