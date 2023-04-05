package com.assignments.assignment10;

public class SListMain {
    public static void main(String args[])
    {
        SList obj=new SList(1);
        SListIterator obj1= obj.iterator();
        System.out.println("The slist with single element is "+obj.toString());
        obj1.addElement(new SList(2));
        System.out.println("The slist after adding new element is "+obj.toString());
        obj1.addElement(new SList(3));
        System.out.println("The slist after adding new element is "+obj.toString());
        obj1.removeLastElement();
        System.out.println("The slist after removing last element element is "+obj.toString());
        System.out.println("iterating through the list");
        while (obj1.hasNext())
        {
            System.out.println(obj1.next().num);
        }
        obj1.pointToStartList();
        System.out.println("iterator after executing the point to start method return if it has objects "+obj1.hasNext());
    }
}
