    /*O máximo divisor  comum de  dois inteiros  é o maior número que divide ambos  sem  deixar resto.
    Escreva um programa que lê dois inteiros e calcula o seu máximo divisor comum.
 */

package Lista5;
import java.util.Scanner;
public class Lista5Att5 {
    public static void main(String[] args) {
     int valor1, valor2,resto;
        String Repita = "continue";
        while (Repita.equals("Continue")||Repita.equals("continue")){
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com o primerio número: "); //Atribuindo os valores das variaveis
        valor1 = ler.nextInt();
        System.out.print("Entre com segundo número: ");
        valor2 = ler.nextInt();
        while (valor2 != 0) {   //Um loop para que execute enquanto a variável "valor2" for diferente 0.
            resto = valor1 % valor2;
            valor1 = valor2;    //Atribuindo o valor da variável valor2 para variável valor1.
            valor2 = resto;     //Atribuindo o valor da variável resto para variável valor2.
            System.out.println("MDC = " + valor1); // resultado
            }
            System.out.println("Se dejesar continuar o programa digite 'continue'...");
            Repita = ler.next();
        }
    }
}
