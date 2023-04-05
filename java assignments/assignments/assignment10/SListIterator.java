package com.assignments.assignment10;

public class SListIterator {
    SList obj,iObj;
    SListIterator(SList obj)
    {
        this.obj=obj;
        this.iObj=obj;
    }
    public void pointToStartList()
    {
        iObj=obj;
    }
    public boolean hasNext()
    {
        if(iObj!=null)
        {
            return true;
        }
        return false;
    }
    public SList next()
    {
        SList obj1=iObj;
        iObj=iObj.obj;
        return obj1;
    }
    public void addElement(SList obj)
    {
        if(this.obj==null)
        {
            this.obj=obj;
            return;
        }
        SList obj1=this.obj;
        while(obj1.obj!=null)
        {
            obj1=obj1.obj;
        }
        obj1.obj=obj;
    }
    public SList removeLastElement()
    {
        SList obj1=obj,obj2;
        if(obj1==null)
        {
            System.out.println("there are no elements");
            return null;
        }
        while(obj1.obj!=null&&obj1.obj.obj!=null)
        {
            obj1=obj1.obj;
        }
        if(obj1.obj==null)
        {
            obj=null;
            return obj1;
        }
        obj2=obj1.obj;
        obj1.obj=null;
        System.out.println("removed element is "+obj2.num);
        return obj2;

    }
}
