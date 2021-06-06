/*Uma padaria vende certa quantidade de pães franceses e uma quantidade de pães de queijo a cada dia.
 Cada pão francês custa R$ 0,12 e o pão de queijo custa R$ 1,50. Ao final do dia, o dono quer saber
  quanto arrecadou com as vendas, e quanto deve guardar numa conta de poupança (10% do total arrecadado).
   Faça um programa que leia a quantidade de pães franceses e pães de queijo, calcule e mostre o valor
    arrecadado no dia e o valor que deve ser guardado na conta de poupança.
 */
import java.util.Scanner;
public class Lista2Att7 {
    public static void main(String[] args) {
    int paes,PaoDeQueijo;
    double TotalDeVendas,Poupanca;
        Scanner ler = new Scanner (System.in);
        System.out.println("----------------------------");
        System.out.println("Panificadora Canto do Galo");
        System.out.println("Informe a quantidade pães vendidos pela panificadora: ");
        paes= ler.nextInt();

        System.out.println("Informe a quantidade de Pão de queijos vendidos pela panificadora: ");
        PaoDeQueijo = ler.nextInt();
        TotalDeVendas= (paes * 0.12) + (PaoDeQueijo * 1.50);
        Poupanca= TotalDeVendas * 0.10;
        System.out.println(" O valor total foi de R$:"+TotalDeVendas);
        System.out.println("O valor foi pra Poupança é de R$:" +Poupanca);


    }
}
