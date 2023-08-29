import java.util.Scanner;

public class Count_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;

        String str=sc.nextLine();
        for(int i=0 ; i<str.length()-1; i++){
            if(str.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println(cnt+1);
    }
}
