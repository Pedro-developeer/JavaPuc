import java.util.Scanner;
public class Lista2Att4 {
    public static void main(String[] args) {
        int lata350ml,garrafa600ml,garrafa2l;
        double quantLata350,quantGarrafa600,total;
        Scanner ler = new Scanner(System.in);
        System.out.println("****FABRICA DE REFRIGERANTE GOIÂNINHO****  ");
        System.out.println(" Digite a quantidade de lata de 350 ml:");
        lata350ml = ler.nextInt();
        System.out.println("Digite a quantidade de garrafa 600 ml:");
        garrafa600ml = ler.nextInt();
        System.out.println("Digite a quantidade de garrafa de 2L:");
        garrafa2l = ler.nextInt();
        quantLata350= lata350ml * 350./1000;
        quantGarrafa600 = garrafa600ml * 600/1000;
        total = quantLata350 + quantGarrafa600 + 2 * garrafa2l;
        System.out.println("\n A quantidade de litros comprados é ="+total+ "Litros ");
    }

}
