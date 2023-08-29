import java.util.Scanner;

public class StringPalindrome {
    private static boolean Check_Palindrome(String str){
        int left =0 ; 
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        boolean result= Check_Palindrome(str1);
        if(result==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

}
