import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        		
		Scanner sc = new Scanner(System.in);
		
		double pesoProva1 = 3.5;
		double pesoProva2 = 7.5;
		double prova1 = sc.nextDouble();
		double prova2 = sc.nextDouble();
		
		double media = ((pesoProva1 * prova1) + (pesoProva2 * prova2)) / (pesoProva1 + pesoProva2);
		
		System.out.printf("MEDIA = %.5f\n", media);
    }
 
}
