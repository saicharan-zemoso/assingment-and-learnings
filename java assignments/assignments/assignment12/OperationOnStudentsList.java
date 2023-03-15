package com.assignments.assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OperationOnStudentsList {
    List<Student> listOfStudents;
    OperationOnStudentsList()
    {
        listOfStudents=new ArrayList<>();
        listOfStudents.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        listOfStudents.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        listOfStudents.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        listOfStudents.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
        listOfStudents.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        listOfStudents.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        listOfStudents.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        listOfStudents.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        listOfStudents.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        listOfStudents.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        listOfStudents.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        listOfStudents.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        listOfStudents.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        listOfStudents.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        listOfStudents.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        listOfStudents.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        listOfStudents.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }
    void printDepartments()
    {
        System.out.println("The departments are:");
        listOfStudents.stream().map(student->student.engDepartment).distinct().forEach(System.out::println);
    }
    void studentsEnrolledAfter2018()
    {
        System.out.println("\nThe students enrolled after 2018 are: ");
        listOfStudents.stream().filter(student -> student.yearOfEnrollment>2018?true:false).map(student->student.name).forEach(System.out::println);
    }
    void maleCSEStudents()
    {
        System.out.println("\nThe male students in CSE are: ");
        listOfStudents.stream().filter(student -> student.gender.equals("Male")&&student.engDepartment.equals("Computer Science")?true:false).forEach(System.out::println);
    }
    void genderCount()
    {
        Map<String,List<Student>> grouped=listOfStudents.stream().collect(Collectors.groupingBy(student -> student.gender));
        System.out.println("\nMale students count is "+grouped.get("Male").size()+" female students count is "+grouped.get("Female").size());

    }
    void averageAgeOfStudents()
    {
        Map<String,List<Student>> grouped=listOfStudents.stream().collect(Collectors.groupingBy(student -> student.gender));
        System.out.println("\nthe average age of male students is "+grouped.get("Male").stream().map(student -> student.age).reduce((s1,s2)->s1+s2).get()/Double.valueOf(grouped.get("Male").size()));
        System.out.println("\nthe average age of female students is "+grouped.get("Female").stream().map(student -> student.age).reduce((s1,s2)->s1+s2).get()/Double.valueOf(grouped.get("Female").size()));
    }
    void studentWithHighestPercentage()
    {
        System.out.println("\ndetails of student with highest percentage is "+listOfStudents.stream().max((s1,s2)->s1.perTillDate>s2.perTillDate?1:-1).get());
    }
    void noOfStudentsInDepartments()
    {
        Map<String,List<Student>> groupedByDepartment=getGroupedDepartment();
        for(String s1:groupedByDepartment.keySet())
        {
            System.out.println("\nThe no of students in "+s1+" department is "+groupedByDepartment.get(s1).size());
        }
    }
    void averageOfDepartment()
    {
        Map<String,List<Student>> groupedByDepartment=getGroupedDepartment();
        for(String s1:groupedByDepartment.keySet())
        {
            System.out.println("\nThe average percentage of "+s1+" department is "+groupedByDepartment.get(s1).stream().map(student -> student.perTillDate).reduce((student1,student2)->student1+student2).get()/groupedByDepartment.get(s1).size());
        }
    }
    void minAgeInElectronic()
    {
        System.out.println("\ndetails of youngest student in electronic department is "+listOfStudents.stream().filter(student -> student.engDepartment.equals("Electronic")).min((s1,s2)->s1.age>s2.age?1:-1).get());
    }
    void genderCountInCSE()
    {
        Map<String,List<Student>> groupedByDepartment=getGroupedDepartment();
        System.out.println("\nthe no of male students in computer science department is "+groupedByDepartment.get("Computer Science").stream().filter(student -> student.gender.equals("Male")).count());
        System.out.println("\nthe no of female students in computer science department is "+groupedByDepartment.get("Computer Science").stream().filter(student -> student.gender.equals("Female")).count());
    }
    Map<String,List<Student>> getGroupedDepartment()
    {
        Map<String,List<Student>> groupedByDepartment=listOfStudents.stream().collect(Collectors.groupingBy(student -> student.engDepartment));
        return groupedByDepartment;
    }


}
