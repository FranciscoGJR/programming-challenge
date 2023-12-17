import java.util.Scanner; 

public class Main {
	
	public static double areaTrianguloRetangulo(double base, double altura){
		return (base * altura)/2;
	}
	
	
	public static double areaCirculo(double raio){
		final double PI = 3.14159;
		return PI * raio* raio; 
	}
	

	public static double areaTrapezio(double baseMaior, double baseMenor, double altura){
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
	
	public static double areaQuadrado(double lado){
		return lado * lado;
	}
	
	
	public static void main(String[] args){
    		
    	Scanner input = new Scanner(System.in);
    	
    	double a = input.nextDouble();
    	double b = input.nextDouble();
    	double c = input.nextDouble();
    	
    	// TRIANGULO
    	double areaTraingulo = areaTrianguloRetangulo(a, c);
    	System.out.printf("TRIANGULO: %.3f\n", areaTraingulo);
    	
    	//CIRCULO
    	double areaCirculo = areaCirculo(c);
    	System.out.printf("CIRCULO: %.3f\n", areaCirculo);
    	
    	// TRAPEZIO
    	double areaTrapezio = areaTrapezio(a, b, c);
    	System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
    	
    	// QUADRADO
    	double areaQuadrado = areaQuadrado(b);
    	System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
    }
}
