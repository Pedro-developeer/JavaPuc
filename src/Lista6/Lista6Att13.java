package Lista6;

import java.util.Scanner;

public class Lista6Att13 {
    public static void main(String[] args) {
        int N1, N2, Comparar = 1, Quociente = 0, Resto = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite N1: ");
        N1 =ler.nextInt();

        System.out.println("Digite N2: ");
        N2 =ler.nextInt();

        Comparar = N2;
        Resto = N1;

        while (Comparar<=N1){
            Quociente++;
            Resto = N1-Comparar;
            Comparar=Comparar+N2;
        }
        System.out.println(+N1+" , " +N2);
        System.out.println("O quociente é ="+Quociente);
        System.out.println("O resto é : "+Resto);
    }
}