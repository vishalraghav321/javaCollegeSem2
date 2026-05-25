import java.io.*;
public class file3
{
public static void main(String[] args)
{
InputStream in;
byte []bt=new byte[40];
try
{
in=new FileInputStream("d:\\java\\one.txt");
in.read(bt,5,20);

	for(int i=0; i<40; i++)
	{
	System.out.print("b["+i+"] = "+(char)bt[i]);
	}
}
catch(FileNotFoundException e)
{System.out.println(e);}
catch(IOException e)
{System.out.println(e);}
}
}