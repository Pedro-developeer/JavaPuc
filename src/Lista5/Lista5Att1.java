/* Faça um programa para calcular e exibir a soma de N primeiros números inteiros (1+2+3+4+.....+N).
O programa deve permitir rodar mais de uma vez.
 */
import java.util.Scanner;
public class Lista5Att1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, soma, limite;
        String repetir = "continue";
        while (repetir.equals("Continue") || repetir.equals("continue")) {  /*repetir.equals ele da um loop no programa
                                                                              permitindo que ele inicie novamente */
            numero = 1;
            soma = 0;
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\t Programa acomulador de somas (1+2+3+4+.....+N)");
            System.out.print("Porfavor selecione o valor limite a ser somado a partir de 1: ");
            limite = ler.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            if (limite <= 0)
                System.out.println("Por favor selecione uma opção valida, um numero maior do que ZERO!");

            while (numero <= limite) {
                soma = soma + numero;
                numero++;
            }

            System.out.println("A soma de 1 até :" + limite + "=" + soma);
            System.out.println("Se deseja continuar digite continue");
            repetir = ler.next();

        }

    }
}