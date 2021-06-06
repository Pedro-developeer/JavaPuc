/* Faça um programa para exibir os quadrados dos números inteiros de A a N.
O programa deve permitir rodar mais de uma vez
 */
import java.util.Scanner;
public class Lista5Att2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int LimiteInicial,LimiteFinal;
        double Quadrado;
        String Repita = "continue";
        while (Repita.equals("Continue") || Repita.equals("continue")){
            System.out.print("Digite o numero limite inicial: ");
            LimiteInicial = ler.nextInt();
            if (LimiteInicial<0){
                System.out.println("Opção invalida, digite um numero inteiro positivo!");
            }else {
                System.out.print("Digite o numero limite Final: ");
                LimiteFinal =ler.nextInt();
                if (LimiteInicial>LimiteFinal){
                    System.out.println("Opção invalida o numero inicial NÃO pode ser maior numero final !");
                }
                while (LimiteInicial<=LimiteFinal){
                    Quadrado = Math.pow(LimiteInicial,2);
                    System.out.println("O numero  "+LimiteInicial+"² = "+Quadrado);
                    LimiteInicial++;
                }
            }
            System.out.println("Digite 'continue' para continuar o programa...");
            Repita = ler.next();
        }
    }
}
