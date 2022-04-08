import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);
 
		// PRODUTO 1
		int id1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		// PRODUTO 2
		int id2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double carrinho = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", carrinho);
	}
}

