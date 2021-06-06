/* Dona Joaninha é muito esquecida e sempre paga suas contas depois da data do vencimento.
Ela gostaria de ter um programa que lhe poupasse do trabalho de calcular o valor da multa e dos
 juros quando fosse pagar uma conta. Resolva o problema de dona Joaninha: faça um programa que
  recebe o valor da conta, o número de dias em atraso e o valor da multa e dos juros por dia de
  atraso. O programa deverá calcular o valor a ser pago. O programa deverá exibir a seguinte saída:

Valor da conta: ________
Dias em atraso:________
Total da multa: ________
Total de juros: ________
Total a pagar: _________ */
import java.util.Scanner;
public class Lista1Att6 {
    public static void main(String[] args) {
        double conta,atraso,multa,juros,pagar,resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da conta: ");
        conta = ler.nextDouble();
        System.out.println("Informe os dias de atraso: ");
        atraso = ler.nextDouble();
        System.out.println("Informe o total da multa: ");
        multa = ler.nextDouble();
        System.out.println("Informe o valor do juros por dia: ");
        juros = ler.nextDouble();
        resultado= (juros * atraso);
        System.out.println("O valor da conta é "+conta+"");
        System.out.println("Os dias de atrasos: "+atraso+"");
        System.out.println("O valor da multa é: "+multa+"");
        System.out.println("O Total de juros foi: "+resultado+"");
        System.out.println("O tatal da conta a pagar: "+ (conta+multa+resultado));


    }
}
