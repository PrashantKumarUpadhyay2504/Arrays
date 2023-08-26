import java.util.Scanner;

public class DuplicateElem {
    private static int DuplicateElement(int a[]){
        int n=a.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(a[i]==a[j]){
                    return a[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int res=DuplicateElement(arr);
        System.out.println(res);

    }
}
