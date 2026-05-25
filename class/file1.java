import java.io.*;
public class file1
{
public static void main(String[] args)
{
InputStream in;
int i;
int size;
try
{
in=new FileInputStream("d:\\java\\one.txt");
in.skip(23);
size=in.available();
System.out.println("size "+size);
	while((i=in.read())!=-1)
	{
	System.out.print((char)i);
	}
}
catch(FileNotFoundException e)
{System.out.println(e);}
catch(IOException e)
{System.out.println(e);}
}
}