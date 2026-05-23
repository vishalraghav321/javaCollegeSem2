import java.io.*;
public class Demo{

public static void main(String[] args){
	try{
	FileInputStream fis = new FileInputStream("D:\\ClassWork\\Sem 2\\JAVA\\FileHandling\\One.txt");
	FileOutputStream fos = new FileOutputStream("D:\\ClassWork\\Sem 2\\JAVA\\FileHandling\\Two.txt");
	int a;
	while((a=fis.read())!=-1){
		fos.write(a);}
	}catch(FileNotFoundException e){
		System.out.println("File Not Found");
	}catch(Exception e){
		System.out.println(e);
	}
}}
	
		

	