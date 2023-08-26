import java.util.Scanner;

public class UniqueNumber {
    private static int UniqueNumber(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res=UniqueNumber(n, arr);
        if(res>0){
            System.out.println("Unique element is "+ res);
        }else{
            System.out.print("There is no Unique element in Array");
        }
    }
}
