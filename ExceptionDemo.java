import java.util.Scanner;
class CustomException extends Exception{
	}


public class ExceptionDemo{

public int divide(int a, int b){
	return a/b;}

public int divide(int a) throws CustomException{
	System.out.println("CustomException Raised");
	throw new CustomException();}
	

public static void main(String[] args){
	ExceptionDemo e = new ExceptionDemo();
	Scanner sc = new Scanner(System.in);
	try{	//System.out.println(e.divide(23,0));
		//System.out.println(e.divide(23));
		int[] n = {1,2,3};
		System.out.println(n[2]);
		int a = sc.nextInt();
	}catch(ArithmeticException a){
		System.out.println("b is 0, cannot divide:  " + a);
	}catch(ArrayIndexOutOfBoundsException a){
		System.out.println("Current element does not exist in array.");
	}/* catch(CustomException c){
		System.out.println("Two parameters are required for division.");
	} */

	System.out.println("Code Execution continues....");
}
}