import java.util.Arrays;
import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1=sc.next();
        System.out.println("Enter second String : ");
        String str2=sc.next();

        if(str1.length() == str2.length()){
            char chr1[] = new char[str1.length()];
            char chr2[] = new char[str1.length()];

            Arrays.sort(chr1);
            Arrays.sort(chr2);

            if(Arrays.equals(chr1,chr2)){
                System.out.print(str2+" is Permutation of "+str1);
            }else{
                System.out.print(str2+" is not Permutation of "+str1);
            }

        }else{
            System.out.print(str2+" is not Permutation of "+str1);
        }
    }
}
