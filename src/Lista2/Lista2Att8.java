/* Três amigos, Carlos, André e Felipe, decidiram rachar igualmente a conta em um bar. Faça um programa
para leia o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos.
Por exemplo: uma conta de R$101,53   R$33,00 para Carlos, R$33,00 para André e R$ 35,53 para Felipe.
 */
import java.util.Scanner;
public class Lista2Att8 {
    public static void main(String[] args) {
        float ValorTotal,Felipe;
        int Carlos,Andre;
        Scanner ler = new Scanner (System.in);
        System.out.println("Conta do Bar");
        System.out.println("\n" +
                "┈┈┈┈┏┓┈┈┈┈☆┈┈┈┈┈\n" +
                "┈┈┈┈┣┫┈┈┈┈┈┈☆┈┈┈\n" +
                "┈┈┈╭╯╰╮┈┈☆┈┈┈┈┈┈\n" +
                "┈┈┈┃╭╮┃┈╭━☆╮┈┈┈┈\n" +
                "┈┈┈┃╳╳┃┈┣━━┣╮┈┈┈\n" +
                "╭━━┃╰╯┃━┃╲╲┣╯━━╮\n" +
                "┃╲╲╰━━╯╲╰━━╯╲╲╲┃\n" +
                "\n");
        System.out.println("---------------------------");
        System.out.println("Qual o valor total da conta:");
        ValorTotal = ler.nextFloat();
        Carlos = (int)ValorTotal/3;
        Andre = (int)ValorTotal/3;
        Felipe = ValorTotal - Carlos - Andre;
        System.out.println("Carlos pagara a conta de R$:" +Carlos);
        System.out.println("Andre pagara a conta de R$:" +Andre);
        System.out.println("Felipe pagara a conta de R$:" +Felipe);
    }
}
