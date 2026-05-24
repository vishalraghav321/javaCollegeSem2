import java.io.*;
class Student implements Serializable 
{
int roll;
String name;
Student(int r,String n)
{
roll=r;
name=n;
}
}
public class useOOutput 
{
public static void main(String[] args)
{
try
{
FileOutputStream fi=new FileOutputStream("d:\\obj.txt");
ObjectOutputStream ob=new ObjectOutputStream(fi);
Student s=new Student(34,"Nisha");
ob.writeObject(s);
ob.flush();
}
catch(IOException e)
{
System.out.println(e);
}
}
}