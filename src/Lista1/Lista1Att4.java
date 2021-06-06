/*
O custo do seguro contra granizo numa comunidade típica de fazendeiros  é 3,5%  do  valor de cobertura
 solicitado (para cada  acre), multiplicado pelo  número  de acres  plantados.  Supondo  que as
  possibilidades de colheita sejam limitadas a milho, feijão e café, faça um programa para ler
  a cobertura desejada e o número de acres plantados para cada uma das três plantações e calcular
 o custo de seguro para cada produto e o custo total do seguro para o cliente.
 */
import java.util.Scanner;
public class Lista1Att4 {
    public static void main(String[] args) {
    double preçoMilho,preçoFeijao,preçoCafe,seguroMilho,seguroFeijao,seguroCafe,seguro;
    double acreMilho,acreFeijao,acreCafe;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de acres para milho:");
        acreMilho= ler.nextFloat();
        System.out.println("Informe a quantidade de acre de feijão:");
        acreFeijao= ler.nextFloat();
        System.out.println("Informe a quantidade de acre de cafe:");
        acreCafe= ler.nextFloat();
        System.out.println("Informe o valor de acres para milho:");
        preçoMilho= ler.nextDouble();
        System.out.println("Informe o valor de acres para feijão:");
        preçoFeijao= ler.nextDouble();
        System.out.println("Informe o valor de acres de café:");
        preçoCafe= ler.nextDouble();
        seguroMilho=0.035*(acreMilho*preçoMilho);
        seguroFeijao=0.035*(acreFeijao*preçoFeijao);
        seguroCafe=0.035*(acreCafe*preçoCafe);
        seguro=seguroMilho+seguroCafe+seguroFeijao;
        System.out.println("O valor do seguro do milho R$"+seguroMilho);
        System.out.println("O valor do seguro do feijão R$"+seguroFeijao);
        System.out.println("O valor do seguro do feijão R$"+seguroCafe);
        System.out.println("O valor total do seguro é R$:" +seguro);
        
    }
}

