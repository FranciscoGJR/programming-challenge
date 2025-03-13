import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.lang.Long;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) throws IOException {

        List<Long> lista = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        Integer tamanhoLista = 5;
        for(int iterador = 0; iterador < tamanhoLista; iterador++ )
            lista.add(scanner.nextLong());

        Resolucao resolucao = new Resolucao(lista);
        resolucao.resposta();

    }
}


class Resolucao {

    private Integer tamanhoDaLista;
    private List<Long> lista;

    
    Resolucao(List<Long> lista){

        this.lista = lista;
        this.tamanhoDaLista = lista.size();
    }


    public void resposta() {
        
        Collections.sort(lista);

        System.out.println("" + somaMenores() + " " + somaMaiores());
        somaMenores();
        somaMaiores();
        
        return;
    }


    public String somaMaiores(){
        Long soma = 0L;
        
        for(int iterador = 1; iterador < tamanhoDaLista; iterador++ ) soma += lista.get(iterador);

        return ("" + soma);
    }


    public String somaMenores(){
        Long soma = 0L;
        
        for(int iterador = 0; iterador < tamanhoDaLista -1; iterador++) soma += lista.get(iterador);

        return ("" + soma);
    }

}

