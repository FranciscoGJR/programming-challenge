import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double comissao = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f\n", comissao);
	}
}
  
