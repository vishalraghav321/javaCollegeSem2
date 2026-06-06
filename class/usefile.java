import java.io.*;
public class usefile
{
public static void main(String[] args)
{
InputStream fi=null;
int size,i;
try
{
fi=new FileInputStream("one.txt");
/*size=fi.available();fi.skip(23);
size=fi.available();
System.out.println(size);*/

while((i=fi.read())!=-1)
System.out.print((char)i);

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