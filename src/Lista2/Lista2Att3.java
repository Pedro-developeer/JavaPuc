/*
A granja Frangotech possui um controle automatizado de cada frango da sua produção.
 No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são
  dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel
  com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um programa que leia a
   quantidade de frangos na granja, calcule e mostre o gasto total da granja para marcar
    todos os seus frangos.
 */
import java.util.Scanner;
public class Lista2Att3 {
    public static void main(String[] args) {

        int QuantidadeFrangos;
        double IdentificacaoChip,AlimentoChip,Gasto;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de galinhas de sua granja : ");
        QuantidadeFrangos = ler.nextInt();
        IdentificacaoChip=QuantidadeFrangos*4.00;
        AlimentoChip=QuantidadeFrangos*2*3.50;
        Gasto=AlimentoChip+IdentificacaoChip;
        System.out.println("o Gasto total de chips para sua granja é de "+Gasto+"");


    }
}
