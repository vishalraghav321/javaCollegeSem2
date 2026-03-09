import java.util.Scanner;

public class ArraySum{

public static void printSum(int[] nums){
int sum = 0;
for(int i:nums) sum += i;
System.out.println("Sum of elements = " +  sum);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of Array: ");
int n = sc.nextInt();
System.out.println("Enter Array Elements: ");

int[] nums = new int[n];
for(int i = 0; i<n; i++){
nums[i] = sc.nextInt();}

printSum(nums);
}

}