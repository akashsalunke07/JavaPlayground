/*

Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
otherwise the name should be equal to the String value passed while creating object of Student class.

 */

package playground;


import java.util.Scanner;

class Student{
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }
}


public class StudentName {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine(); ;


        Student obj = new Student();
        System.out.println(obj.name);

        Student obj1 = new Student(name);
        System.out.println(obj1.name);


    }
}
