package com.assignments.assignment12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface OperationsInterface {
    public void printDepartments();
    public void studentsEnrolledAfter2018();
    public void maleCSEStudents();
    public void genderCount();
    public void averageAgeOfStudents();
    public void studentWithHighestPercentage();
    public void noOfStudentsInDepartments();
    public void averageOfDepartment();
    public void minAgeInElectronic();
    public void genderCountInCSE();
    public Map<String,List<Student>> getGroupedDepartment();
}
