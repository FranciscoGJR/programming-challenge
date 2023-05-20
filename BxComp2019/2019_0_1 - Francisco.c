#include <stdio.h>
#include <string.h>

#define D 1

void main(){
    int x, i, c, size_txt;
    char aux[5];        //ira armazenar o 'GADO'
    char txt[30];       // ira armazenar o 'D...'

    scanf("%i", &x);

    for(i = 0; i < x; i++){
        scanf("%s %s", &aux, &txt);     //2 inputs, o primeiro para a palavra 'GADO' e o segundo para o 'D...'

        size_txt = strlen(txt);     //contar quantas letras tem em 'D...'

        if(size_txt == 1){
            printf("O combustivel nao possui dano\n");
        }else{
            printf("Dano de nivel %i\n", size_txt - D);
        }
    }
}
