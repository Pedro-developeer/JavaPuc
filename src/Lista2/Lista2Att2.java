/*
    2. Sejam 𝑓 (𝑥) = 2𝑥2 + 3𝑥,   𝑔 (𝑥) =   3𝑥2 + 4  e   ℎ (𝑥) = 1/𝑥 .
Faça um programa que leia o valor de 𝑥, calcule e mostre os resultados das seguintes funções:
        a. 𝑓 (𝑥) + 𝑔(𝑥)
        b. 𝑓 (𝑥) ∗ ℎ(𝑥)
        c. 𝑓(𝑔 (𝑥) )
 */
import java.util.Scanner;

public class Lista2Att2 {

    public static void main(String[] args) {
        double x,fx,gx,hx,a,b,c;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o valor de X");
        x = ler.nextDouble();
        fx=2*Math.pow(x,2)+3*x;
        gx=Math.sqrt(3*Math.pow(x,2)+4);
        hx=1/x;
        a=fx+gx;
        b=fx+hx;
        c=2*Math.pow(gx,2)+gx;
        System.out.println("a função ="+a);
        System.out.println("a função ="+b);
        System.out.println("a função ="+c);

    }

}
