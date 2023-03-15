package com.assignments.assignment7.innerclass;

public class SecondClass {
    class SecondInnerClass extends FirstClass.InnerclassFirst
    {
        SecondInnerClass(String str) {
            super(str);
        }
    }
}
