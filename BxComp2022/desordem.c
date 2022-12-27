#include <stdio.h>
#include <stdbool.h>  
#include <string.h>


// definição de uma struct que representa cada programa
typedef struct{
    char nome[10];
    int prioridade;
    bool ehAnime;
    
} Programa;




void definirAtributos(Programa *p){

    /* verificar nome do programa e definir prioridade com base:
        
        1 - Os Padrinhos M  - PadrinhosM
        2 - Bob Esponja     - BobE  
        3 - Dragon Ball     - DragB         - eh anime
        4 - Caverna Do D.   - CavernaD
        5 - Hamtaro         - Hamtaro       - eh anime
        6 - Kim Possible    - KimP
        7 - Pica-Pau        - PicaP
        8 - Rugrats         - Rugrats
        9 - Beyblade        - BeyB          - eh anime
        10 - Digimon        - Digi          - eh anime
        11 - Luluzinha      - Lulu
        12 - X-men          - X-men
    */
    
    
    if(strcmp(p->nome,"PadrinhosM") == 0){
        p->prioridade = 1;
        p->ehAnime = false;
    }
    
    else if(strcmp(p->nome,"BobE") == 0){
        p->prioridade = 2;
        p->ehAnime = false;
    }
    
    else if(strcmp(p->nome,"DragB") == 0){
        p->prioridade = 3;
        p->ehAnime = true;
    }
        
    else if(strcmp(p->nome,"CavernaD") == 0){
        p->prioridade = 4;
        p->ehAnime = false;
    }
        
    else if(strcmp(p->nome,"Hamtaro") == 0){
        p->prioridade = 5;
        p->ehAnime = true;
    }
        
    else if(strcmp(p->nome,"KimP") == 0){
        p->prioridade = 6;
        p->ehAnime = false;
    }
        
    else if(strcmp(p->nome,"PicaP") == 0){
        p->prioridade = 7;
        p->ehAnime = false;
    }
    
    else if(strcmp(p->nome,"Rugrats") == 0){
        p->prioridade = 8;
        p->ehAnime = false;
    }
        
    else if(strcmp(p->nome,"BeyB") == 0){
        p->prioridade = 9;
        p->ehAnime = true; 
    }
    
    else if(strcmp(p->nome,"Digi") == 0){
        p->prioridade = 10;
        p->ehAnime = true;
    }
    
    else if(strcmp(p->nome,"Lulu") == 0){
        p->prioridade = 11;
        p->ehAnime = false;
    }
        
    else if(strcmp(p->nome,"X-men") == 0){
        p->prioridade = 12;
        p->ehAnime = false;
    }
        
}




// Bubble Sort utilizado para ordenar a lista
void  ordenaProgramacao(Programa* lista, int tamanho) {
    for (int i = 1; i < tamanho; i++){
        
        for (int j = 0; j < tamanho - 1; j++){
            
            if (lista[j].prioridade > lista[j + 1].prioridade){
                Programa temp = lista[j];
                lista[j] = lista[j + 1];
                lista[j + 1] = temp;
            }
        }
    }
}




// funcao responsavel por imprimir toda a programacao
void imprimeProgramacao(Programa lista[], int tamanho) {
  for (int i = 0; i < tamanho; i++){
        printf("%s ", lista[i].nome);   
    }
  
  printf("\n");
}




// funcao responsavel por identificar proximo nao anime da programacao
int proximoNaoAnime(Programa lista[], int i, int tamanho){
    int programasRestantes = tamanho - i;

    for(; programasRestantes != 0; programasRestantes--, i++){
        if(lista[i].ehAnime == false)
            return i;
    }
    
    return -1;    
}




void ordenaRepetido(Programa* lista, int tamanho){
    int i, contAnime = 0;
  
    // iterar por toda a programacao
    for(i = 0; i < tamanho; i++){
        
        // identifica se ha repetido
        if(lista[i].ehAnime == true){
            contAnime ++;
        }
        else{
            contAnime = 0;
        }
 
        // quando ha 3 animes repetidos, fazer modificacao na ordem
        if(contAnime == 3){

            int proximo = proximoNaoAnime(lista, i, tamanho);
            if(proximo == -1)
              return;
          
            Programa aux = lista[i];
            lista[i] = lista[proximo];
            lista[proximo] = aux;
              
            contAnime = 0;
        }

      
    }
  
  
}   
    



int main(){
    
    int casosTeste;
    scanf("%d", &casosTeste);  
    int i;
    for(i = 0; i < casosTeste; i++){
        
        // entrada da quant de programas
        int quantProgramas;
        scanf("%d", &quantProgramas);
    
        
        // criar lista em que ficara toda a programacao do dia
        Programa programacao[quantProgramas];
    
    
        // entrada dos programas + alimenta atributos da estrutura
        int j;
        for(j = 0; j < quantProgramas; j++){
            Programa p;
            scanf("%s", (p.nome));
            definirAtributos(&p);
            programacao[j] = p;
        }
    
        // caso tenha poucos programas
        if(quantProgramas < 6 ){
            printf("Soh isso? Tem crianca chorando\n");
        }
        else{
        // ordena com base na prioridade de cada programa
        ordenaProgramacao(programacao, quantProgramas);
    
        // ordena os animes repetidos
        ordenaRepetido(programacao, quantProgramas);
        
        imprimeProgramacao(programacao, quantProgramas);
            
        }
    
    }
    
    return 0;
}

