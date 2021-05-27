//SALARIO BRUTO

#include <stdio.h>   //biblioteca padrao de IO
int main()           //função principal
{
    float salario, liquido;


    printf("Entre com o salario bruto: ");  // Exibe texto "Entre com o salario bruto: "
    scanf("%f", &salario);                 // Entrada do salario bruto

    liquido = salario * (1 - 0.07 - 0.08) ;         // calcula salario liquido


    printf("\nO funcionario Jorge Silveira recebera R$");                // Exibe texto \n para pular para proxima linha
    printf(" %.2f\n", liquido);      	                                        // Exibe resultado do salario liquido  %.2f com uma casa decimal
    printf("===================================================\n \n");



    return 0; //sai do programa retonando valor nulo /zero
}

