package Array;
import java.util.Scanner;

public class MultipleDuplicateElement {
    private static int MultipleDuplicateElement(int arr[]) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers one by one :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = MultipleDuplicateElement(arr);
        System.out.print(res);
    }
}
