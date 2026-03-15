import java.util.Scanner;
public class Longest{

public static void find(String input){
String words[] = input.split(" ");
String longest = "";
for(String s:words){
	if(s.length()>longest.length()) longest = s;	
}
System.out.println("Longest Word is: " + longest);
}

public static void main(String []args){
Scanner  sc = new Scanner(System.in);
System.out.println("Enter a String ");
String s=sc.nextLine();

find(s);
} 
}