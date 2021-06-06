/*  A sequência abaixo é conhecida como série de Fibonacci.
 Faça um programa para escrever esta série até o seu trigésimo termo.
Série de Fibonacci : 1,1,2,3,5,8,13,21,34,55,… */
import java.util.Scanner;
public class Lista5Att4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String repetir = "continue";
        while (repetir.equals("Continue") || repetir.equals("continue")) {
            int anterior, soma, limite, auxiliar;
            anterior = soma = limite = 1;
            System.out.print(+anterior + ",");
            while (limite < 30) {
                System.out.print(+soma + ",");
                auxiliar = soma;
                soma = soma + anterior;
                anterior = auxiliar;
                limite++;
            }
            System.out.println("");
            System.out.println("Se deseja continuar digite continue");
            repetir = ler.next();
        }
    }
}