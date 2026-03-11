public class Student1{

int rollno;
String name;
int age;
String course;

public Student1(){
rollno = 1;
name = "John Doe";
age = 18;
course = "MCA";
}

public Student1(String a){
name = a;}

public Student1(int a, String b, int c, String d){
rollno = a;
name = b;
age = c;
course = d;}

public void print(){
System.out.println("Roll No = " + rollno);
System.out.println("Name = " + name);
System.out.println("Age = " + age);
System.out.println("Course = " + course);}

public static void main(String[] args){
Student1 s1 = new Student1();
Student1 s2 = new Student1("Mayank");
Student1 s3 = new Student1(23, "Abhishek", 21, "MCA");
System.out.println("Student 1 Information:");
s1.print();
System.out.println();
System.out.println("Student 2 Information:");
s2.print();
System.out.println();
System.out.println("Student 3 Information:");
s3.print();

}
}

