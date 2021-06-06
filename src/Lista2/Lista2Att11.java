/*    11 Ler um número inteiro de três dígitos e mostrar a saída da seguinte forma:

Centena = x
Dezena = x
Unidade = x
 */
import java.util.Scanner;
public class Lista2Att11 {
    public static void main(String[] args) {
        int dezena,centena,unidade,numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite qualquer numero inteiro");
        numero = ler.nextInt();
        unidade = numero % 10;
        numero = (numero - unidade)/10;
        dezena = numero % 10;
        numero = (numero - dezena)/10;
        centena = numero;
        System.out.println("centena: "+centena+  " dezena: "+dezena+ " e unidade:  "+unidade);


    }
}
