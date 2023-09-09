import java.util.Scanner;

public class ReverseWordWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int strt=str.length()-1;
        int end=str.length();
        String res = "";

        while(strt>=0){
            if(str.charAt(strt) == ' '){
                res=res + str.substring(strt+1, end)+" ";
                end=strt;
            }
            strt--;
        }
        res=res+str.substring(strt+1, end); 
        System.out.println(res);
    }
}
