import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.lang.Integer;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        int tamanhoLista = scanner.nextInt();

        for(int iterador = 0; iterador < tamanhoLista; iterador++){
            lista.add(scanner.nextInt());
        }
        
        Resolucao resolucao = new Resolucao(lista, tamanhoLista);
        resolucao.resposta();
    
    }
}


class Resolucao{

    private List<Integer> lista;
    private int tamanhoLista;

    
    Resolucao(List<Integer> lista, int tamanhoLista){
        this.lista = lista;
        this.tamanhoLista = tamanhoLista;
        
        Collections.sort(this.lista);
    }


    public void resposta(){

        for(int iterador = 0; iterador < tamanhoLista; iterador+= 2){
            Integer atual = lista.get(iterador);
            
            if(iterador == tamanhoLista - 1) {
                System.out.println(toString(atual)); 
                return;
            }
            
            Integer proximo = lista.get(iterador+1);

            if(atual != proximo) {
                System.out.println(toString(atual));
                return;
            }

        }
    }


    public String toString(Integer repetente){

        return "" + repetente;
    }
}