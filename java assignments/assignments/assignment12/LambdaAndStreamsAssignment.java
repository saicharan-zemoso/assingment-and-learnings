package com.assignments.assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAndStreamsAssignment {

    public static void main(String args[])
    {
        OperationsInterface obj= new OperationOnStudentsList();

        //stream to print all departments
        obj.printDepartments();
        //stream to print names of students enrolled after 2018
        obj.studentsEnrolledAfter2018();
        //details of male computer science students
        obj.maleCSEStudents();
        //no of male and female using groupBy
        obj.genderCount();
        //student average age
        obj.averageAgeOfStudents();
        //student with the highest percentage
        obj.studentWithHighestPercentage();
        //students count in departments
        obj.noOfStudentsInDepartments();
        //average of each department
        obj.averageOfDepartment();
        //min age in electronic
        obj.minAgeInElectronic();
        //male and female in cse
        obj.genderCountInCSE();

    }
}
