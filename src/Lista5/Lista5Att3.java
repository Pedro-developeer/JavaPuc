/* Sendo H = 1 +    +   + ........... +  ,
fazer um programa para solicitar N e gerar o número H.
 */
import java.util.Scanner;
public class Lista5Att3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float H,N;
        String Repita = "continue";
        while (Repita.equals("Continue")||Repita.equals("continue")){
            H = 0;
            System.out.print("Digite um numero inteiro positivo: ");
            N = ler.nextFloat();
            while (N>0){
                H = H + 1 / N;
                N--;
            }
            System.out.println("O valor de H é "+H);
            System.out.println("Se dejesar continuar o progroma digite 'continue'...");
            Repita = ler.next();
        }
    }
}
