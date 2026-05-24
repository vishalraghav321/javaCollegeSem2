import java.io.*;
public class usefilei
{
public static void main(String[] args)
{
InputStream fi=null;
byte b[]=new byte[40];
try
{
fi=new FileInputStream("one.txt");

fi.read(b,5,10);

for(byte i:b)
{
System.out.print((char)i);

}
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
catch(IOException e)
{
System.out.println(e);
}
}
}