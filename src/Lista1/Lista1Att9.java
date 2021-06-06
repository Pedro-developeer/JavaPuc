import java.util.Scanner;

public
class Lista1Att9 {
    public static
    void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double ValorPrincipal,TaxaDeLucro,NumeroDeMeses,LucroGerado,SaldoTotalGerado;

        System.out.println("Digite o valor do investimento para simular o seu lucro: ");
        ValorPrincipal=ler.nextDouble();
        System.out.println("Informe a Taxa de lucro : ");
        TaxaDeLucro=ler.nextDouble();
        System.out.println("informe a quantia de meses: ");
        NumeroDeMeses=ler.nextDouble();
        TaxaDeLucro= TaxaDeLucro/100;
        LucroGerado=(ValorPrincipal*TaxaDeLucro)*NumeroDeMeses;
        SaldoTotalGerado=ValorPrincipal+LucroGerado;



        System.out.println("Voce investiu "+ValorPrincipal+ "durante "+NumeroDeMeses+"meses e o lucro gerado durante esses meses foi de "+LucroGerado+"e o Saldo de sua conta + lucro gerado é de "+SaldoTotalGerado );






    }
}