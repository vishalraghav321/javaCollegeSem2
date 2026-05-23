import java.io.*;
public class Demo2{

public static void main(String[] args){
	String s = "We are using filter stream.";
	int a = 12;
	float b = 3.141f;
	double c = 3295;
	DataOutputStream fos;
	DataInputStream fis;
	Boolean d = true;
	try{
	fis = new DataInputStream(new FileInputStream("D:\\ClassWork\\Sem 2\\JAVA\\FileHandling\\One.txt"));
	fos = new DataOutputStream(new FileOutputStream("D:\\ClassWork\\Sem 2\\JAVA\\FileHandling\\One.txt"));
	fos.writeInt(a);
	fos.writeFloat(b);
	fos.writeDouble(c);
	fos.writeBoolean(d);	
	fos.writeChars(s);
	
	System.out.println(fis.readInt());
	System.out.println(fis.readFloat());
	System.out.println(fis.readDouble());
	System.out.println(fis.readBoolean());
	System.out.println(fis.read());

	}catch(FileNotFoundException e){
	System.out.println("File not found" + e);
	}
	catch(IOException e){
	System.out.println(e);
	}

}}