#include <string.h>
#include <stdio.h>

int main(){
    char expressao[1001];
    int N, tam, resposta, cauda;

    scanf("%d\n", &N);
    
    for(int k = 0; k < N; ++k){
        scanf("%s", expressao);

        resposta = 0;
        cauda = 0;
        tam = strlen(expressao);
        for(int i = 0; i < tam; ++i){
            if(expressao[i] == 'X'){
                ++cauda;
            }else if(expressao[i] == 'D' && cauda > 0){
                --cauda;
                ++resposta;
            }
        }

        printf("%d\n", resposta);
    }

    return 0;
}

