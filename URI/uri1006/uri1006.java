import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		double peso1 = 2;
		double peso2 = 3;
		double peso3 = 5;
		
		double notaAluno1 = sc.nextDouble();
		double notaAluno2 = sc.nextDouble();
		double notaAluno3 = sc.nextDouble();
		
		double media = ( (notaAluno1 * peso1) + (notaAluno2 * peso2) + (notaAluno3 * peso3)) / (peso1 + peso2 + peso3) ;
		
		System.out.printf("MEDIA = %.1f\n", media);
	}
	
}   
