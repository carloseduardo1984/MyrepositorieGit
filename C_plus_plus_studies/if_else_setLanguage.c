#include <stdio.h>
#include <stdlib.h>
#include <locale.h>



int main()
{
    system("color 60"); // muda cor para backcolor 6=yellow e font 0=black

    setlocale(LC_ALL, "Portuguese");//habilita a acentuação para o português




float media, numerox, contador50, contador20, soma_das_idades50, soma_das_idades20 ;


contador50, contador20 = 0;
numerox = 0;
soma_das_idades50, soma_das_idades20 = 0;

while (10000){


    printf("Digige a idade número %d :  ", contador50+1);     // Escreve Digite uma idade

    scanf("%f" ,&numerox);                      //Le numero digitado
    printf("=================== \n");

    if(numerox ==0) {
            printf("CALCULANDO...\n");  // se numero digitado igua a zero mostra frase calculando
            printf("=================== \n");}

    else{
        printf("PARA CALCULAR DIGITE ZERO!\n");   // se numero digitado diferente de zero indica a frase para calcular so digitar zero
        printf("=================== \n"); }

        if (numerox >50) { soma_das_idades50 = soma_das_idades50 + numerox; contador50++;}    //Incrementa contador50 para ler proximo numero // calcula soma das idades maiores que 50 digitadas



    if (numerox == 0)  break;        // se numerox for zero para o loop repetitivo do while com a funcao break


     if (numerox > 20) contador20++; // se tiver agum numero menor que vinte incrementa contador


}

  media = soma_das_idades50 / contador50;  //calcula media de valores maiores que 50

printf("++++++++++++++++++++++++++++++++++++++ \n\n");
printf(" A média das idades maiores que 50 digitadas é igual a %.1f", media);        //Escreve valor da media de valores maiores que 50calculada
printf("\n++++++++++++++++++++++++++++++++++++++\n \n");
printf(" A quantidade de valores maiores que 20 foi de %.1f", contador20);        //Escreve quantidade de valores menores que 20
printf("\n=========================================== \n");

return 0;
}
