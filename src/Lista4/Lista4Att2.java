/*
 O número 3025 possui a seguinte característica:
30 + 25 = 55
552             = 3025
*/

import java.util.Scanner;
public class Lista4Att2 {
    public static void main(String[] args) {
        int numero,n1,n2,n3,n4,aux,primeira,segunda,soma,calculo;
        Scanner ler = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.print("Digite um numero de quatro digito: ");
        numero = ler.nextInt();

        n1 = numero / 1000;
        aux = numero % 1000;
        n2 = aux / 100;
        aux = aux % 100;
        n3 = aux / 10;
        n4 = aux % 10;

        primeira = (n1 * 10 ) + n2;
        segunda = (n3 * 10 ) + n4;
        soma = primeira + segunda;
        calculo = (int)Math.pow(soma,2);

        if (calculo==numero) {
            System.out.println("O numero possui tal caracteristica");
        }
        else {
            System.out.println("O numero não possui essa caracteristica ");
        }
    }
}
