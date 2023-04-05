package com.basics;

public class PolymorphismExample {
    int a;
    public void setValueOfA()
    {
        this.a=10;
    }
    //it is known as overloading and also known as compile time polymorphism
    public void setValueOfA(int a)
    {
        this.a=a;
    }

}
class PolymorphismImp extends PolymorphismExample{
    //this is overriding and also known as runtime polymorphism
    public void setValueOfA()
    {
        a=20;
    }
    public void setValueOfA(int a)
    {
        this.a=10;
    }
}
