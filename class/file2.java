import java.io.*;
public class file2
{
public static void main(String[] args)
{
InputStream in;
byte []bt=new byte[40];
try
{
in=new FileInputStream("d:\\java\\one.txt");
in.read(bt);

	for(byte b:bt)
	{
	System.out.print((char)b);
	}
}
catch(FileNotFoundException e)
{System.out.println(e);}
catch(IOException e)
{System.out.println(e);}
}
}