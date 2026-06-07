import java.io.*;
public class dinputr
{
public static void main(String args[])
{
int a;
float b;
double c;
boolean d;
int bi;
try
{
FileInputStream fin=new FileInputStream("D:\\Demo.txt");
DataInputStream din=new DataInputStream(fin); 

a=din.readInt();
b=din.readFloat();
c=din.readDouble();
d=din.readBoolean();

System.out.println("Integer = "+a);
System.out.println("Float = "+b);
System.out.println("Double = "+c);
System.out.println("Boolean = "+d);
while((bi=din.read())!=-1)
System.out.print((char)bi);
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}