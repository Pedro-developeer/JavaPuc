/* - Faça um programa para ler três números A, B e C, e determinar qual o maior e qual o menor.
 */
import java.util.Scanner;
public class Lista3Att7 {
    public static void main(String[] args) {
    int A,B,C;
        System.out.println("-----------------------------------------------");
        System.out.println("Ler três numeros A,B,C. Qual é o Maior e menor?");
        System.out.print("Indorme o numero de A: ");
        Scanner ler = new Scanner (System.in);
        A = ler.nextInt();
        System.out.print("Informe o valor de B: ");
        B = ler.nextInt()  ;
        System.out.print("Informe o valor de C: ");
        C = ler.nextInt();

        if (A>B) {
            A=A+B;
            B=A-B;
            A=A-B;
        }
        if (A>C){
            A=A+C;
            C=A-C;
            A=A-C;
        }
        if (B>C){
            B=B+C;
            C=B-C;
            B=B-C;
        }
       if ((A==B)&&(B==C)){
            System.out.println("Todos são iguais!");
        }
       else {
           System.out.println("O MENOR è "+A+ " e o MAIOR é " +C);
           System.out.println("FIM DO PROGRAMA!");
       }
    }
}
