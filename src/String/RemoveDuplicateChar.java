import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String str = sc.next();
        char chr[] = str.toCharArray();
        HashSet<Character> s = new LinkedHashSet<>(str.length()-1);

        for (char i: chr){
            s.add(i);
        }
        for( char x : s)
        System.out.print(x);
       
    }
}
