/*Fazer um algoritmo que converta uma determinada quantia dada em Reais para
uma das seguintes moedas de acordo com a opção do usuário:
• E – Euro 			R$ 4,617;
• L – Libra Esterlina		R$ 4,816;
• D – Dólar 			R$ 3,871;
• I – Iene 			R$ 2,818.
 */
import java.util.Scanner;
public class Lista4Att8 {
    public static void main(String[] args) {
        double Euro ,Libra,Dolar,Iene,Real;
        String opcao;
        Euro = 4.61;
        Libra = 4.81;
        Dolar = 3.87;
        Iene = 2.81;
        Scanner ler = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("CONVERSOR DE MOEDAS");
        System.out.println("-------------------------------");
        System.out.println("Digite o valor em Real: ");
        Real = ler.nextDouble();
        System.out.println("\t e – Euro R$ 4,617");
        System.out.println("\t l – Libra Esterlina R$ 4,816");
        System.out.println("\t d – Dólar R$ 3,871;");
        System.out.println("\t i – Iene  R$ 2,818.");
        System.out.print("DIGITE SUA OPÇÃO: ");
        opcao = ler.next();
        switch (opcao) {
            case "l":
                System.out.println("Vocẽ escolheu a converção de Real Para Libra");
                System.out.println("A quantida de Libra é: "+Real / Libra);
                break;

            case "d":
                System.out.println("Vocẽ escolheu a converção de Real Para DOLAR");
                System.out.println("A quantida de Dolar é: "+Real / Dolar);
                break;

            case "i":
                System.out.println("Vocẽ escolheu a converção de Real Para IENE");
                System.out.println("A quantida de Iene é: "+Real / Iene);
                break;

            case "e":
                System.out.println("Vocẽ escolheu a converção de Real Para EURO");
                System.out.println("A quantida de Euros é: "+Real / Euro);
                break;
            default:{
                System.out.println("Opção invalida !");
            }
        }

    }
}
