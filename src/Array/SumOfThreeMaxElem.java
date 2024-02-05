package Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfThreeMaxElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.print(arr[n-1]+arr[n-2]+arr[n-3]);
    }
}
