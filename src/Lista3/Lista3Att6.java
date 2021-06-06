/*O Futebol Clube do  Recife deseja aumentar o salário de seus jogadores.
O ajuste salarial deve obedecer à seguinte tabela:

____________________________________________________________
Até  R$ 900,00 			 		 aumento de 20%
Acima de R$ 900,00 até R$ 1.300,00 		 aumento de 15%
Acima de R$ 1.3 00,00 até R$ 1.800,00 		 aumento de 10%
acima de 1.800,00  				 aumento de 5%
____________________________________________________________

Faça um programa  ler o  nome de um jogador e  seu salário atual e  calcular o  seu aumento e seu novo
salário. O programa deverá exibir a seguinte frase:
O jogador ___________ terá aumento de R$ __________ e passará a receber R$____________. */
import java.util.Scanner;
public class Lista3Att6 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Futebol Clube Recife");
        String nome;
        double Salario;
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite seu salario atual: ");
        Salario = ler.nextDouble();

        if (Salario<=900) {
            System.out.println("O jogador "+nome+ " terá aumento de R$"+Salario*0.20+ " e passará a receber R$"+Salario*1.20);
        }
        else if (Salario<=1300){
            System.out.println("O jogador "+nome+ " terá aumento de R$"+Salario*0.15+ " e passará a receber R$"+Salario*1.15);
        }
        else if (Salario<=1800){
            System.out.println("O jogador "+nome+ " terá aumento de R$"+Salario*0.10+ " e passará a receber R$"+Salario*1.10);
        }
        else {
            System.out.println("O jogador "+nome+ " terá aumento de R$"+Salario*0.05+ " e passará a receber R$"+Salario*1.05);
        }


    }
}
