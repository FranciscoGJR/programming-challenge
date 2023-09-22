import java.util.Scanner;


class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        Resolucao resolucao = new Resolucao(texto);
        resolucao.resposta();

        scanner.close();
    }
}


class Resolucao{

    private String horario;
    private Integer horas;
    private Integer minutos;
    private Integer segundos;

    Resolucao(String horaio){
        this.horario = horaio;
        this.horas = Integer.parseInt("" + horario.charAt(0) + horario.charAt(1));
        this.minutos = Integer.parseInt("" + horario.charAt(3) + horario.charAt(4));
        this.segundos = Integer.parseInt("" + horario.charAt(6) + horario.charAt(7));
        
        if(horario.charAt(8) == 'P' && horas != 12) horas+= 12;
    
        if(horario.charAt(8) == 'A' && horas == 12) horas = 0;
    }

    public void resposta(){

        System.out.println(toString());
        
        return;
    }
    
    
    public String toString(){
        String resultado = String.format("%02d:%02d:%02d", horas, minutos, segundos);

        return resultado;
    }

}
