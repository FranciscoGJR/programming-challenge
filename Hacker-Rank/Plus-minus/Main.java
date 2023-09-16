import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaElementos = new LinkedList<>();
        
        Integer tamanhoLista = scanner.nextInt();

        for(int iterador = 1; iterador <= tamanhoLista; iterador++){
            listaElementos.add(scanner.nextInt());
        }

        Resolucao.plusMinus(listaElementos);

    }
}


class Resolucao {

    private static Integer tamanhoLista = 0;
    private static Integer quantidadeNegatigos = 0;
    private static Integer quantidadeZeros = 0;
    private static Integer quantidadePositivos = 0;
    private static List<Integer> listaElementos;
    private static List<Double> listaProporcoes = new ArrayList<>();

    public static void calcularProporcoes(){

        listaProporcoes.add((double) (quantidadePositivos) / tamanhoLista);
        listaProporcoes.add((double) (quantidadeNegatigos) / tamanhoLista);
        listaProporcoes.add((double) (quantidadeZeros) / tamanhoLista);

        return;
    }
    
    
    public static void imprimirProporcoes(){
        for (Double proporcao : listaProporcoes) {
            System.out.printf("%.6f\n", proporcao);
        }
        return;
    }

    public static void plusMinus(List<Integer> arr) {
        tamanhoLista = arr.size();
        listaElementos = arr;

        for (Integer elemento : arr) {
            if(elemento < 0) quantidadeNegatigos++;
            if(elemento == 0) quantidadeZeros++;
            if(elemento > 0) quantidadePositivos++;
        }

        calcularProporcoes();

        imprimirProporcoes();
    }

}