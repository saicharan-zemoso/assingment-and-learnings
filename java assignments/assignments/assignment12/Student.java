package com.assignments.assignment12;

public class Student {
    public int id,age,yearOfEnrollment;
    public double perTillDate;
    public String name,gender,engDepartment;
    Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate)
    {
        this.id=id;
        this.age=age;
        this.engDepartment=engDepartment;
        this.gender=gender;
        this.name=name;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
    public String toString()
    {
        return ""+this.id+" "+this.name+" "+this.age+" "+this.gender+" "+this.engDepartment+" "+this.yearOfEnrollment+" "+this.perTillDate;
    }
}
