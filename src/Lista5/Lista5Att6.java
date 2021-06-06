package Lista5;
import java.util.Scanner;
/* Uma agência  bancária possui  vários tipos  de investimentos com
rendimentos mensais, conforme  a tabela abaixo:
Valor Míni  Descrição Rentabilidade Mensal
	_______________________________________________________
R$ 100,00  			Poupança  			0,5%
R$ 1000,00 		 Fundos de Renda Fixa 	1,0%
R$ 2500,00  			CDBs  			1,5%
	_______________________________________________________

 */
public class Lista5Att6 {
    public static void main(String[] args) {
        double poupanca,RendaFixa,CDBs,valor;
        poupanca =0;
        RendaFixa = 0;
        CDBs = 0;
        String Repita = "Continue";
        Scanner ler = new Scanner(System.in);
        while (Repita.equals("Continue")||Repita.equals("continue")) {
            System.out.println("======================== LISTA DE INVESTIMENTOS ============================');\n" +
                    "\n" +
                    "          VALOR MÍNIMO        |      DESCRIÇÃO             RENTABILIDADE MENSAL ');\n" +
                    "          R$100,00            |      POUPANÇA              0,5%  \n" +
                    "          R$1000,00           |      RENDA FIXA            1%  \n" +
                    "          $2500,00            |      CDBs                  1,5%  \n" +
                    "\n" +
                    "('============================================================================= ');");
            System.out.print("Digite o valor que pretende investir R$:");
            valor = ler.nextInt();

            if (valor < 100) {
                System.out.println("Valor muito baixo, tem que ser maior do que R$100,00");
            } else {
                poupanca = valor * 0.005;
                RendaFixa = valor * 0.01;
                CDBs = valor * 0.015;

                if (valor < 1000) {
                    System.out.println("Seu rendimento em poupança será de R$: " + poupanca);
                } else if (valor < 2500) {
                    System.out.println("Seu rendimento em poupança será de R$: " + poupanca);
                    System.out.println("Seu rendimento em Renda Fixa sera de R$:" + RendaFixa);
                } else {
                    System.out.println("Seu rendimento na poupança será de R$: " + poupanca);
                    System.out.println("Seu rendimento em Renda Fixa sera de R$:" + RendaFixa);
                    System.out.println("Seu rendimento em CDBs R$ " + CDBs);
                }
                System.out.println("Se dejesar continuar o programa digite 'continue' ou digite 0");
                Repita = ler.next();
            }
        }
    }
}
