package OOPs;
import java.util.*;

public class Constuctors {
    public static void main(String[] args) {
        // constuctor overloading (it calls the suitable constructor itself)
        Student1 s1 = new Student1();
        //Student s2 = new Student("Abhay", 13);
        
        s1.name = "Abhay";
        s1.age = 13;
        s1.password = "xyz";
        s1.marks[0] = 80;
        s1.marks[1] = 99;
        s1.marks[2] = 92;

        Student1 s3 = new Student1(s1);
        s3.password = "abcd";
        s1.marks[2] = 78;

        System.out.println(s3.name);
        System.out.println(s3.password);
        System.out.println(Arrays.toString(s3.marks));

    }
}
class Student1{
    String name; // null
    int age;  // 0
    String password;
    int marks[];

    // Constuctor without parameters (non - parameterized)
    Student1(){
        marks = new int[3];
        System.out.println("Constuctor is called...");
    }

    // Constructor with parameters (parameterized)
    Student1(String name, int age){
        marks = new int[3];
        this.name = name;
        this.age = age;
    }

    // copy constuctor
    Student1(Student1 s){
        marks = new int[3];
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks;
    }
    
}

