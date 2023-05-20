#include <stdio.h>

typedef int bool;
#define true 1
#define false 0

void main(){
    char enemy[50];
    int ally, score = 0, i;
    bool is_Aquiles = false;

    scanf("%s %i", &enemy, &ally);

        //Has trojan horse
    if(enemy[0] == 'C'){
        printf("Ah que mal deve ser receber um presente de grego?");
        return 0;}

        //Count enemy
    for(i = 0; enemy[i] != '\0'; i++){
        if(enemy[i] == 'A'){
            score += 10;
            is_Aquiles = true;
        }else
            score += 1;}

        //Has Aquiles
    if(is_Aquiles == true && ally <= score){
        printf("Eu que nao fico no caminho dele!");
        return 0;}

    if(ally > score){
        printf("Atacar!");
        return 0;
    }else{
        printf("Recuar!");
        return 0;
    }
}
