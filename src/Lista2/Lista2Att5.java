import java.util.Scanner;
public class Lista2Att5 {
    public static void main(String[] args) {
        double SalarioInicial,SalarioAumento,SalarioFinalImposto;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o salario:");
        SalarioInicial= ler.nextDouble();
        SalarioAumento = SalarioInicial*1.15;
        SalarioFinalImposto = SalarioAumento *0.92;

        System.out.println("O Seu salario inicial foi R$ "+SalarioInicial+" com aumento de 15% sei salario passou a ser de "+SalarioAumento);
        System.out.println("Com descontos de impostos agora seu salario é de : "+SalarioFinalImposto);


    }
}
