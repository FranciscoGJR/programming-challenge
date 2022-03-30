import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
	  Scanner sc = new Scanner(System.in);
	  
	  double pi = 3.14159;
	  double R = sc.nextDouble();
	  
	  double area = pi * (R * R);
	  
	  System.out.println(String.format("A=%.4f", area));
 
    }
 
}
