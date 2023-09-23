import java.util.Scanner;
import java.lang.Integer;

class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int ordemMatriz = scanner.nextInt();
        Integer[][] matriz = new Integer[ordemMatriz][ordemMatriz];

        for(int iterador1 = 0; iterador1 < ordemMatriz; iterador1++){
            for(int iterador2 = 0; iterador2 < ordemMatriz; iterador2++)
                matriz[iterador1][iterador2] = scanner.nextInt();
        }

        Resolucao resolucao = new Resolucao(matriz, ordemMatriz);
        resolucao.resposta();
    }
}

class Resolucao{

    private Integer[][] matriz;
    private int ordemMatriz;

    Resolucao(Integer[][] matriz, int ordemMatriz){
        this.matriz = matriz;
        this.ordemMatriz = ordemMatriz;
    }

    public void resposta(){

        Integer subtracao = Math.abs(somaDiagonalPrincial() - somaDiagonalSecundaria());
        System.out.println(toString(subtracao));

    }

    public Integer somaDiagonalPrincial(){
        Integer soma = 0;
        
        for(int iterador = 0; iterador < ordemMatriz; iterador++)
            soma += matriz[iterador][iterador];
   
        return soma;
    }
    
    
    public Integer somaDiagonalSecundaria(){
        Integer soma = 0;

        for (int iterador1 = 0, iterador2 = ordemMatriz -1; iterador1 < ordemMatriz ; iterador1++, iterador2--)
            soma += matriz[iterador1][iterador2];
        
        return soma;
    }

    public String toString(Integer subtracao){

        return "" + subtracao;
    }
}