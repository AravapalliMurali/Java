package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
        
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "krishna"));
        studs.add(new Student(26, "kishan"));
        studs.add(new Student(22, "krishnan"));
        studs.add(new Student(25, "krishnasai"));

        Collections.sort(studs, com);

        //Collections.sort(studs); // here we are not passing the "com" for compareTo method 

        for(Student s: studs)
            System.out.println(s);

        //System.out.println(studs);
    }
}

/**
 * Student
 * here i am using the implements with comparable for natural sorting  
 */

 public class Student implements Comparable<Student>{
    int age;
    String name;

    // creating  concustor 
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }


    public String toString(){
        return "Student [age =" + age + ", name = " + name + "]";
    }

    public int compareTo(Student that){
        return this.age > that.age ? 1 : -1;
    }

    
}