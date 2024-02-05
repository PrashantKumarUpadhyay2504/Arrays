package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sum_pair_element {
    private static int[] Sum_pair_element(int arr[]){
        int n = arr.length;
        int n1=arr[0];
        for (int i=0;i<n;i++){
            if(i<arr.length-1){
                arr[i]=arr[i]+arr[i+1];
            }else{
                arr[i]=arr[i]+n1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0 ;i < n;i++){
            arr[i]=sc.nextInt();
        }
        Sum_pair_element(arr);
        System.out.println(Arrays.toString(arr));
    }
}
