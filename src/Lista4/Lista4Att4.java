/* Números quadrados perfeitos são aqueles cuja raiz quadrada é um número inteiro.
Exemplo 144. Fazer um algoritmo que dado um número inteiro positivo, calcule
 e escreva se este é ou não quadrado perfeito.
 */
import java.util.Scanner;
public class Lista4Att4 {
    public static void main(String[] args) {
        double numero,auxiliar;
        Scanner ler = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("È UM QUADRADO PERFEITO ?");
        System.out.print("Digite um numero inteiro positivo: ");
        numero = ler.nextInt();
        System.out.println("-------------------------------------------------");

        auxiliar = Math.sqrt(numero);

        if (numero <=0) {
            System.out.println("Opção invalida, porfavor DIGITE UM NÚMERO INTEIRO !");
        }
        else if (Math.pow(auxiliar,2) == numero) {
            System.out.println("É um quadrado perfeito !");
        }
        else {
            System.out.println("Não é um quadrado perfeito !");
        }
    }
}
