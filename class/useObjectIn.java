import java.io.*;

public class useObjectIn implements Serializable
{
public static void main(String args[])
{

try
{
FileInputStream fin=new FileInputStream("D:\\mobject.txt");
ObjectInputStream din=new ObjectInputStream(fin); 
Timer t=(Timer)din.readObject();
t.disp();
System.out.println(t.hh+":"+t.mh+":"+t.sh);
}
catch(IOException e)
{}
catch(ClassNotFoundException e)
{}
}}