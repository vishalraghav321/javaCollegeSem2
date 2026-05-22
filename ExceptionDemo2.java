class InvalidAgeException extends Exception{
	}

public class ExceptionDemo2{
	public void checkAge(int age) //throws InvalidAgeException
		{
		try{
			if(age<18) throw new InvalidAgeException();
			System.out.println("Age is valid..");
		}catch(InvalidAgeException a){
			System.out.println("Age is less than 18, invalid");
		}}
	
	public static void main(String[] args){
		int age = 2;
		ExceptionDemo2 e = new ExceptionDemo2();
		//try{
			e.checkAge(age);
		//}catch(InvalidAgeException a){
		//	System.out.println("Age is less than 18, invalid");
		//}
	}
}