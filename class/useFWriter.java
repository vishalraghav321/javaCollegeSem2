import java.io.*;

public class useFWriter 
{
public static void main(String args[])
{
try
{
String sr="Hello Friends";
char ar[]=sr.toCharArray();

FileWriter fw=new FileWriter("D:\\writer.txt");

fw.write(65);
fw.write(ar);
fw.write(ar,5,8);
fw.flush();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}
