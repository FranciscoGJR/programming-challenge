import java.util.Scanner;

public class comparacao{
    public static void Main(String[] args){

        boolean estaChovendo = true;
        boolean estaNublado = false;

        if (estaChovendo) {
            System.out.println(" está chovendo");
        }

        else if (estaNublado){
            System.out.println("está nublado, mas ñ está chovendo\n");
        }
        else { 
            System.out.println("ñ está chovendo nem nublado\n");
        }

    }

}

