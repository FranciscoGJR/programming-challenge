import java.util.Scanner;

public class comparacao{
    public static void Main(String[] args){

        System.out.println("está chovendo ?");

        Scanner entrada = new Scanner(System.in)
        
        int chuva= entrada.nextInt();

        System.out.println("está nublado ?");

        int nublado = entrada.nextInt();

        boolean  estaChovendo = true;
        boolean estaNublado = false;

        if ( estaChovendo) {
            System.out.println(" está chovendo");
        }

        else if ( estáNublado ){
            System.out.println("está nublado, mas ñ está chovendo\n");
        }
        else { 
            System.out.println("ñ está chovendo nem nublado\n");
        }

    }

}

