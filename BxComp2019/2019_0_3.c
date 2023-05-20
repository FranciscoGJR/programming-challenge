#include <stdio.h>
#include <string.h>

#define MAX_CHAR 10


void separador(char* frase, char** palavra){
    palavra[0][0] = 'f';
    printf("AAAA   %c   AAAA\n", palavra[0][0]);


    /*
    while(frase[i] != '\0'){
        frase[i] = palavra[0][d];
        d++;
        i++;
    }
        d++;
        i++;
    }
        printf("Frase: %s \nPalavra 0: %s \n", frase, palavra[0]);


    */
}


void main(){

    char frase[50] = "Bomdia";
    char palavra[5][10];
    palavra[0][0] = 'B';
    separador(&frase, &palavra);
    //printf("AAAA   %c   AAAA\n", palavra[0][0]);
}

