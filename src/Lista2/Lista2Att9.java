/*9. Uma lanchonete vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo,
 uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 5
 0 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um programa que leia a quantidade de
 sanduíches a fazer, calcule e mostre as quantidades (em quilos) de queijo, presunto e hambúrguer necessários.
 */
import java.util.Scanner;
public class Lista2Att9 {
    public static void main(String[] args) {
int Sanduba;
int FatiaDeQueijo,FatiaDeHaburguer,FatiaDePresunto;
Scanner ler = new Scanner (System.in);
        System.out.println("Informe a quantidade de Sanduba desejada");
        Sanduba = ler.nextInt();
        FatiaDeQueijo = (Sanduba * 50) * 2 /1000;
        FatiaDePresunto =(Sanduba * 50) * 2 /1000;
        FatiaDeHaburguer =(Sanduba * 100)/1000;
        System.out.println("Quilos de Queijo é:"+FatiaDeQueijo+ "KG");
        System.out.println("Quilos de Hamburguer é:"+FatiaDeHaburguer+ "KG");
        System.out.println("Quilos de Presunto é:"+FatiaDePresunto+ "KG");

    }
}
