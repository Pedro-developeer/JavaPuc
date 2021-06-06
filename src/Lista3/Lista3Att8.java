/* Escreva um programa que receba dois números e que disponibilize as opções abaixo e i
mprima o resultado da operação.
1 - retornar o quociente inteiro de uma divisão;
2 - retornar a multiplicação de dois números;
3 - retornar o soma de dois números;
4 – retornar a subtração de dois números.
5 – retornar mensagem de erro (opção inválida)
*/


import java.util.Scanner;
public class Lista3Att8 {
    public static void main(String[] args) {
        float a, b, valor;
        int opcao, valorint;
        Scanner ler = new Scanner(System.in);
        System.out.println("Operações aritimeticas entre A e B");
        System.out.println("Opções");

        System.out.println("\t 1- para cociente inteiro de uma divisão");
        System.out.println("\t 2- para multiplicação de dois numeros");
        System.out.println("\t 3- para soma de dois numeros");
        System.out.println("\t 4- para subtração de dois números");
        System.out.println("");
        System.out.println("Entre com a opção: ");
        opcao = ler.nextInt();

        System.out.println("informe o valor de A:");
        a = ler.nextFloat();
        System.out.println("informe o valor de B:");
        b = ler.nextFloat();
        switch (opcao) {
            case 1:
                if (b == 0) {
                    System.out.println("Não existe divisão por Zero. ");
                } else {
                    valorint = (int) (a / b);
                    System.out.println(valorint);
                    break;
                }
            case 2:
                valor=a*b;
                System.out.println(valor);
                break;
            case 3:
                valor=a+b;
                System.out.println(valor);
                break;
            case 4:valor=a-b;
                System.out.println(valor);
                break;
            default:
                System.out.println("Opção ivalida");
        }
    }
}