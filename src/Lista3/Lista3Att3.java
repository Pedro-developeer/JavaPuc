/*Faça um programa para ler o nome e a idade de uma pessoa e determinar se esta pessoa é ou
 não maior de idade (idade maior ou igual a 18 anos). O programa deve imprimir
 a seguinte frase:
 _____________ tem ________ anos e é / não é maior de id
 */
import java.util.Scanner;
public class Lista3Att3 {
    public static void main(String[] args) {
        int idade;
        System.out.println("---------------------------------");
        System.out.println("BALADINHA +18");
        System.out.print("Qual sua idade? ");
        Scanner ler = new Scanner (System.in);
        idade = ler.nextInt();

        if (idade>=18)
        {
            System.out.println("Pode entrar pra Baladinha , boa diverção !");
        }
        else {
            System.out.println("Sua mãe sabe que você esta aqui? Não pode entrar pra Baladinha !");
        }
    }
}
