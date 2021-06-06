/*
ax + by = c
dx + ey = f
Pode ser resolvido utilizando-se as seguintes fórmulas:
          ce-bf                          af-cd
X = -------------             y = --------------
          ae-bd                         ae-bd
Faça um programa para ler os coeficientes (a,b,c,d,e,f) das equações e calcular e exibir os valores de x e y.
 */
 import java.util.Scanner;
public class Lista1Att3 {
    public static void main(String[] args) {
        System.out.println();
        float  a,b,c,d,e,f,x,y;
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe o valor de a: ");
        a = leitor.nextFloat();
        System.out.println("Informe o valor de b: ");
        b = leitor.nextFloat();
        System.out.println("Informe o valor de c: ");
        c = leitor.nextFloat();
        System.out.println("Informe o valor de d: ");
        d = leitor.nextFloat();
        System.out.println("Informe o valor de e: ");
        e = leitor.nextFloat();
        System.out.println("Informe o valor de f: ");
        f = leitor.nextFloat();
        x =( (c*e) - (b*f) ) / ( (a*e) - (b*d) );
        y =( (a*f) - (c*d) ) / ( (a*e) - (b*d) );
        System.out.println( ("X= "+x+" e Y= "+y));

    }
}
