import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void interleaveStrings(String str1, String str2) {
        int size1 = str1.length();
        int size2 = str2.length();

        int lengthFinal = size1 + size2;
        ArrayList<Character> interleave = new ArrayList<>(lengthFinal);

        for(int i = 0; i < lengthFinal; i++){
            if(i < size1){
                interleave.add(str1.charAt(i));
                System.out.print(str1.charAt(i));
                
            }
            if(i < size2){
                interleave.add(str2.charAt(i));
                System.out.print(str2.charAt(i));
                
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        interleaveStrings(str1, str2);


    }
}