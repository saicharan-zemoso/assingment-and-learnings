package com.assignments.assignment10;

public class SList {
    int num;
    SList obj=null;
    SList(int num)
    {
        this.num=num;
    }
    public String toString()
    {
        String s1="the object is ";
        SList obj1;
        obj1=this;
        while(obj1!=null)
        {
            s1=s1+"["+obj1.num+"]-->";
            obj1=obj1.obj;
        }
        s1=s1+"null";
        return s1;
    }
    public SListIterator iterator()
    {
        return new SListIterator(this);
    }
}
