import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int remainder;
        int sum = 0;

        while (num != 0) {

            remainder = num % 10;
            sum = sum + (remainder * remainder * remainder);
            num = num / 10;

        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } 
        else {
            System.out.println(original + " is not an Armstrong number");
        }

    }
}