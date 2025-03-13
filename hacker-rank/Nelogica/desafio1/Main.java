package desafio2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Integer tamanho = scanner.nextInt();

        List<Long> lista = new LinkedList<>();

        for(int iterador = 0; iterador < tamanho; iterador++){
            lista.add(scanner.nextLong());
        }
        
        Resolucao resolucao = new Resolucao(lista, tamanho);
        resolucao.resposta();
    }
}

class Resolucao{

    private List<Long> lista;
    private Integer tamanho;


    Resolucao(List<Long> lista, Integer tamanho){
        this.lista = lista;
        this.tamanho = tamanho;
    }

    public void resposta(){
        Long soma = 0L;
        Integer expoente = tamanho -1;

        for(int iterador = 0; iterador < tamanho; iterador++, expoente--){
            if(lista.get(iterador) == 1) soma += (long) Math.pow(2, expoente);
        }

        System.out.println(soma);
        return;
    }
}