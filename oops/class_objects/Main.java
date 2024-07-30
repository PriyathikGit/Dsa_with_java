package oops.class_objects;
public class Main{
    public static void main(String[] args) {
        Student rohan = new Student();
        System.out.println(rohan.rno);
        System.out.println(rohan.name);
        System.out.println(rohan.marks);
        rohan.greeting();
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("hello good morning "+name);
    }
    Student(){
        this.rno=16;
        this.name="rohan";
        this.marks=78.6f;
    }
}