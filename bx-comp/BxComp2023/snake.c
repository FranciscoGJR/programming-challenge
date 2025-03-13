#include <stdio.h>

#define SIZE 5

void buscarValor(int matrix[SIZE][SIZE], int valor, int* posicaoX, int* posicaoY) {
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            if (matrix[i][j] == valor) {
                *posicaoX = i;
                *posicaoY = j;
                printf("=== BUSCANDO VALOR\n");
                printf("posicaoX = %d  \nposicaoY = %d\n", *posicaoX, *posicaoY);
                return;
            }
        }
    }
    *posicaoX = -1;
    *posicaoY = -1;
}


int calculaDistancia(int posicaoX1, int posicaoY1, int posicaoX2, int posicaoY2){
    int distanciaX =  posicaoX1 - posicaoX2;
    int distanciaY = posicaoY1 - posicaoY2;

    if(distanciaX < 0)
        distanciaX *= -1;

    if(distanciaY < 0)
        distanciaY *= -1;

    printf("distanciaX = %d \ndistancia = %d\n", distanciaX, distanciaY);
    return distanciaX + distanciaY;
}


int main() {
    int matrix[SIZE][SIZE];
    int casosTeste;
    
    scanf("%d", &casosTeste);

    int posicaoCorujaX, posicaoCorujaY;
    int posicaoCobraX, posicaoCobraY;

    int rodada, velocidade = 1;
    for(rodada = 0; rodada < casosTeste; rodada++){ 

        // receber os valores da matriz
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                scanf("%d", &matrix[i][j]);
            }
        }

        // encontrar posicao da cobra
        if(rodada ==  0){
            buscarValor(matrix, 42, &posicaoCobraX, &posicaoCobraY);
        }
 
        // encontrar posicao da coruja
        buscarValor(matrix, 13, &posicaoCorujaX, &posicaoCorujaY);

        if(posicaoCorujaX == -1 && posicaoCorujaY == -1){
            printf("Sem corujas para salvar\n");
            return 0;
        }

        
        int tempo = calculaDistancia(posicaoCobraX, posicaoCobraY, posicaoCorujaX, posicaoCorujaY); 
        velocidade *= 2;

        printf("tempo: %d\n", tempo);
       
        posicaoCobraX = posicaoCorujaX;
        posicaoCobraY = posicaoCorujaY;

    }

    return 0;
}
