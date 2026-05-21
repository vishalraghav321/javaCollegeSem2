import java.util.Scanner;

public class LowestIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // taking size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // taking array input
        System.out.println("Enter the elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // letting first element as the smallest
        int min = arr[0];
        int index = 0;

        // find lowest element index
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Index of the lowest element is: " + index);
    }
}