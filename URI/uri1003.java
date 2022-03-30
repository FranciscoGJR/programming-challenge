import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner sc = new Scanner(System.in);

      int number1 = sc.nextInt();
      int number2 = sc.nextInt();

      int soma = number1 + number2;
	  
	  System.out.println("SOMA = " + soma);
		  
    }
 
}
