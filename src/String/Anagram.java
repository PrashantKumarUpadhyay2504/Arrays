import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char chr1[]= str1.toCharArray();
        char chr2[]= str2.toCharArray();

        if(str1.length()!=str2.length()){
            System.out.println("Not anagrams");
        }else{
            int flag=0;
            for(int i=0 ; i<str1.length(); i++){
                for(int j=0 ; j<str2.length() ; j++){
                    if(chr1[i]==chr2[j]){
                        flag=1;
                    }else{
                        flag=0;
                    }
                }
            }
            if(flag==1){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not Anagram");
            }
        }
    }
}
