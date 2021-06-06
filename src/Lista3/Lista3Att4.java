/*Faça um programa para calcular as raízes reais de uma equação do 2º
 grau (AX2+BX+C=0).


Dica:   = B2 – 4AC
Se <  0, não existe raiz real.
Se  = 0, X1=X2= -B/A
Se  > 0 ,

         -B +                           -B -
X1 = ------------            X2 = ------------
            2A                                2A
            */

import java.util.Scanner;
public class Lista3Att4 {
    public static void main(String[] args) {
    double x1,x2,delta;
    int a,b,c;
        Scanner ler = new Scanner (System.in);
        System.out.println("Esquação de 2 garu");
        System.out.print("Informe valor de A: ");
        a = ler.nextInt();
        System.out.print("Informe o valor de B: ");
        b =  ler.nextInt();
        System.out.print("Informe o valor de C: ");
        c = ler.nextInt();

        delta = (Math.pow(b,2))-4*a*(a*c);
        System.out.println("O valor de delta é "+delta);
         if (delta>0){
             System.out.println("Não existe raizes reais");
         }
         else if (delta==0){
             x1=-b/(2*a);
             x2 = x1;
             System.out.println("A raiz de X1 é "+x1);
         }
         else {
             x1=(+b+Math.sqrt(delta))/(2*a);
             x2=(-b+Math.sqrt(delta))/(2*a);
             System.out.println("O valor de X1 é "+x1);
             System.out.println("O valor de X2 é "+x2);
         }

    }
}
