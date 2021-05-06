//SALARIO DE REVENDEDOR

#include <stdio.h>   //biblioteca padrao de IO
int main()           //função principal
{
    float numero_de_vendas, salario, total_das_vendas;


    printf("Entre com o numero de vendas do mes: ");  // Exibe texto de numero de vendas do mes 
    scanf("%f", &numero_de_vendas);             // Entrada do numero de vendas
    printf("\nEntre com o valor total das vendas: ");  // Exibe texto valor total de vendas do mes
    scanf("%f", &total_das_vendas);             // Entrada do valor de vendas do mes


    salario = ((1014*3) + (numero_de_vendas * 130)) + (total_das_vendas * 0.07) ;         // calculo do Salario = 3 salarios + 130 por cada venda +  7% sobre o valor total de vendas


    printf("\nSalario do mes foi de: \n");                // Exibe texto \n para pular para proxima linha
    printf("=======================\n");
    printf(" %.2f\n", salario);      	// Exibe resultado do salario  %.2f com uma casa decimal
    printf("=======================\n \n");



    return 0; //sai do programa retonando valor nulo /zero
}

