package Lista6;

import java.util.Scanner;

public class Lista6Att11 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int n1,n2,suma=0,i;

        System.out.println("Digite um número :");
        n1= ler.nextInt();
        System.out.println("Digite outro número :");
        n2= ler.nextInt();

        for(i=1; i<=n1; i++)
        {
            suma = suma + n2;
        }
        System.out.println("A multiplicação de  "+n1+" e "+n2+" = "+suma);
        ler.close();
    }
}
