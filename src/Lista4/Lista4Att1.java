/* Desenvolver um algoritmo que leia um número inteiro e verifique se este é
divisível por 5 e por 3 ao mesmo tempo.
 */
import java.util.Scanner;
public class Lista4Att1 {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);                      //Comando de Leitura
        System.out.println("-----------------------------------");
        System.out.println("\t E DIVISIVEL ?                |");  //Nome do Programa
        System.out.println("-----------------------------------");
        System.out.println("Informe um número inteiro: ");
        numero = ler.nextInt();

        if (numero%5==0 && numero %3==0) {                 //Condicional
            System.out.println("O múmero e divisivel! ");
        }
        else {
            System.out.println("O número não é divisivel! ");  //Condicional
        }

    }
}
