/*
    2. Sejam π (π₯) = 2π₯2 + 3π₯,   π (π₯) =   3π₯2 + 4  e   β (π₯) = 1/π₯ .
FaΓ§a um programa que leia o valor de π₯, calcule e mostre os resultados das seguintes funΓ§Γ΅es:
        a. π (π₯) + π(π₯)
        b. π (π₯) β β(π₯)
        c. π(π (π₯) )
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
        System.out.println("a funΓ§Γ£o ="+a);
        System.out.println("a funΓ§Γ£o ="+b);
        System.out.println("a funΓ§Γ£o ="+c);

    }

}
