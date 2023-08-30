import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Enter Only Single Character : ");
        String chr =sc.next();
        String ans="";
        for(int i=0 ; i<str.length() ; i++){
            for(int j=0; j<chr.length() ; j++){
                if(str.charAt(i)!=chr.charAt(j)){
                    ans+=str.charAt(i);
                }
            }
        }
        System.out.println(ans);
    }
}
