import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
    // ENTRADA DE DADOS
		int funcionarioID = sc.nextInt();
		int horasMensal = sc.nextInt();
		double valorHora = sc.nextDouble();
		
    // PROCESSAMENTO
		double salario = horasMensal * valorHora;
		 
    // SAIDA
		System.out.printf("NUMBER = %d\n", funcionarioID);
		System.out.printf("SALARY = U$ %.2f\n", salario);
	
	}
}
