package desafio3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer quantidadeNomes = scanner.nextInt();
        List<String> nomes = new LinkedList<>();

        for (int iterador = 1; iterador <= quantidadeNomes; iterador++)
            nomes.add(scanner.next());

        Integer quantidadeConsultas = scanner.nextInt();
        List<String> consulta = new LinkedList<>();

        for (int iterador = 1; iterador <= quantidadeConsultas; iterador++)
            consulta.add(scanner.next());

        Resolucao resolucao = new Resolucao(nomes, consulta);
        resolucao.resposta();

    }
}

class Resolucao {

    private List<String> nomes;
    private List<String> consultas;

    Resolucao(List<String> nomes, List<String> consultas) {
        this.nomes = nomes;
        this.consultas = consultas;
    }

    public void resposta() {
        int[] repeticoes = new int[consultas.size()];

        for (int i = 0; i < consultas.size(); i++) {
            String consulta = consultas.get(i);

            for (String nome : nomes) {
                if (nome.startsWith(consulta) && nome.length() > consulta.length()) {
                    repeticoes[i]++;
                }
            }
        }

        // Imprimir os resultados
        for (int count : repeticoes) {
            System.out.println(count);
        }
    }
}
