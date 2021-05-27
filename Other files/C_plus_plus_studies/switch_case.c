//SALARIO DE REVENDEDOR

#include <stdio.h>   //biblioteca padrao de IO
int main()           //função principal
{
    int mes;


    printf("Entre com o numero do mes: ");  // Exibe texto "Entre com o numero do mes "
    scanf("%d", &mes);                      // Entrada do numero do mes
    printf("\nMes referente: ");                // Exibe texto \n para pular para proxima linha

    switch (mes)    // exibe mes referente se o numero digitado estiver nos cases da funcao switch
    {
        case 1 : printf("Janeiro");  break;
        case 2 : printf("Fevereiro");  break;
        case 3 : printf("Marco");  break;
        case 4 : printf("Abril");  break;
        case 5 : printf("Maio");  break;
        case 6 : printf("Junho");  break;
        case 7: printf("Julho");  break;
        case 8 : printf("Agosto");  break;
        case 9 : printf("Setembro");  break;
        case 10 : printf("Outubro");  break;
        case 11 : printf("Novembro");  break;
        case 12 : printf("Dezembro");  break;
        default : printf("Nao existe mes com este numero!\n"); // caso o numero digitado for diferente dos cases declarados na funcao switch a funcao defaut apresenta o texto de valor invalido

    }

    printf("\n=======================\n \n");


    return 0; //sai do programa retonando valor nulo /zero
}

