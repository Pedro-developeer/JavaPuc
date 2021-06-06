/* 10 - A Companhia de Pulverização Faz Tudo Ltda. utiliza aviões para pulverizar lavouras.
 Os custos de pulverização dependem do tipo de praga e da área contratada conforme o esquema:

Tipo 1: pulverização contra ervas daninhas,  R$ 5,00 por acre;
Tipo 2: pulverização  contra gafanhotos, R$ 10,00 por acre;
Tipo 3: pulverização contra broca, R$ 15,00 por acre;
Tipo 4: pulverização contra tudo acima, R$ 25,00

	Se  a  área  a  ser  pulverizada  é  maior  que  300  acres,  o  fazendeiro  recebe  um
	 desconto  de  5%.  Em adição, qualquer fazendeiro  cujo custo  total, sem desconto, ultrapasse
	 R$  1.750,00 recebe  um desconto de 10% sobre o valor que ultrapassar os R$ 1.750,00. Se ambos
	 os descontos  se aplicam, aquele relacionado a área é calculado em primeiro lugar.

	Preparar um programa que leia as seguintes informações:
		Nome do fazendeiro;
		Tipo de pulverização (de 1 a 4);
		Área a ser pulverizada.
O programa deve ainda calcular o custo final da pulverização e escrever
O fazendeiro, ____________ (nome do fazendeiro)________ , pagará pelo serviço de pulverização
de R$____________.
 */
import java.util.Scanner;
public class Lista3Att10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String Nome;
        int TipoPulverizacao;
        double acres1,valor1,valor_desc1,acre2,valor2,valor_desc2,acre3,valor3,valor_desc3,valor_desc4;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t Pulverização Faz Tudo Ltda                                       |");
        System.out.println("\t Tipo 1: pulverização contra ervas daninhas,  R$ 5,00 por acre;   |");
        System.out.println("\t Tipo 2: pulverização  contra gafanhotos, R$ 10,00 por acre:      |");
        System.out.println("\t Tipo 3: pulverização contra broca, R$ 15,00 por acre;            |");
        System.out.println("\t Tipo 4: pulverização contra tudo acima, R$ 25,00                 |");
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Digite seu nome: ");
        Nome = ler.nextLine();
        System.out.println("Escolha o tipo de pulverização: ");
        TipoPulverizacao = ler.nextInt();

        switch (TipoPulverizacao){
            case 1:
                System.out.println("Pulverização contra ervas daninhas");
                System.out.print("Digite o valor do acre: ");
                acres1 = ler.nextDouble();
                valor1 = acres1 * 5 ;
                if( acres1 > 300) {
                    valor1 = valor1 - ( valor1 / 20 ) ;
                }

                if(valor1 > 1750) {
                        valor_desc1 = valor1 - 1750 ;
                        valor_desc1 = valor_desc1 / 10 ;
                        valor1 = valor1 - valor_desc1 ;
                }
                System.out.println("O fazendeiro "+Nome+ " pagará pelo serviço de " + "pulverização no valor de "+valor1+ " R$") ;
                break ;

            case 2 : System.out.println("Pulverização  contra gafanhotos, R$ 10,00 por acre:");
                System.out.print("Digite o valor do acre :");
                acre2 = ler.nextDouble();
                valor2 = acre2 * 10 ;

                if( acre2 > 300) {

                    valor2 = valor2 - ( valor2 / 20 ) ;

                }

                if(valor2 > 1750) {

                    valor_desc2 = valor2 - 1750 ;
                    valor_desc2 = valor_desc2 / 10 ;
                    valor2 = valor2 - valor_desc2 ;

                }
                System.out.println("O fazendeiro "+Nome+ " pagará pelo serviço de "+ "pulverização no valor de "+valor2+ " R$");
                break ;

            case 3 : System.out.println("Pulverização contra broca, R$ 15,00 por acre");
                System.out.print("Digite o valor do acre :");
                acre3 = ler.nextDouble();
                valor3 = acre3 * 15 ;


                if( acre3 > 300) {

                    valor3 = valor3 - ( valor3 / 20 ) ;

                }

                if(valor3 > 1750) {

                    valor_desc3 = valor3 - 1750 ;

                    valor_desc3 = valor_desc3 / 10 ;

                    valor3 = valor3 - valor_desc3 ;

                }
                System.out.println("O fazendeiro "+Nome+ " pagará pelo serviço de " + "pulverização no valor de "+valor3+ " R$");
                break ;

            case 4 : System.out.println("pulverização contra tudo");
                System.out.println("Digite o valor do acre :");
                double acre4 = ler.nextDouble();
                double valor4 = acre4 * 25 ;

                if( acre4 > 300) {

                    valor4 = valor4 - ( valor4 / 20 ) ;
                }

                if(valor4 > 1750) {

                    valor_desc4 = valor4 - 1750 ;
                    valor_desc4 = valor_desc4 / 10 ;
                    valor4 = valor4 - valor_desc4 ;
                }
                System.out.println("O fazendeiro "+Nome+ " pagará pelo serviço de " + "pulverização no valor de "+valor4+ " R$");
                break ;
        }

    }
}
