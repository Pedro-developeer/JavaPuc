/*Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de dias.
Faça um programa para converter este tempo em anos, meses e dias. Considere que
cada ano possui 365 dias e cada mês possui 30 dias.
 */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Lista2Att6 {
    public static void main(String[] args) {
        int dados,dias,mes,anos;
        Scanner ler = new Scanner (System.in);
        System.out.println("Controle de Acidentes");
        System.out.println( "Informe o numero de dias");
        dados= ler.nextInt();
        anos=dados/365;
        mes = dados%365/30;
        dias = dados%365%30;
        System.out.println("------------------------------------");
        System.out.println("O numero de anos é:"+anos);
        System.out.println("O numero de meses é:"+mes);
        System.out.println("O numero de dias é:"+dias);

    }
}
