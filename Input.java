import java.util.Scanner;
class Input{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name: ");
String s1 = sc.nextLine();

System.out.println("Enter your age: ");
int i = sc.nextInt();
System.out.println(s1 + " is " + i + " years old");

System.out.println("Enter a short datatype: ");
short s = sc.nextShort();

System.out.println("Enter a long datatype: ");
long l = sc.nextLong();

System.out.println("Enter a float datatype: ");
float f = sc.nextFloat();

System.out.println("Enter a double datatype: ");
double d = sc.nextDouble();

System.out.println("Enter a char datatype: ");
char c = sc.next().charAt(0);

System.out.println("Enter a byte datatype: ");
byte b = sc.nextByte();

System.out.println("Enter a Boolean datatype: ");
boolean bool = sc.nextBoolean();

System.out.println("Short:" +s);
System.out.println("Long:" +l);
System.out.println("Float:" +f);
System.out.println("Double:" +d);
System.out.println("Char:" +c);
System.out.println("Byte:" +b);
System.out.println("Boolean:" +bool);


}
}



