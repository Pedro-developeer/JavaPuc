/* Faça u m programa para ler dois números inteiros M e N e determinar se M é divisível por N. */
import java.util.Scanner;
public class Lista3Att1 {
    public static void main(String[] args) {
        int m,n,x,y;
        System.out.println("---------------------------------------");
        System.out.print("Informe numero de M: ");
        Scanner ler = new Scanner(System.in);
        m = ler.nextInt();
        System.out.print("Informe o numero de N: ");
        n = ler.nextInt();
        System.out.println("----------------------------------------");
        x = m/n;
        y = m%n;
        if (y==0)

            System.out.println("O numero " +m+ " é divisivel por "+n);
        else{
            System.out.println("O numero  "+m+"  não é divisivel por "+n);
        }
        System.out.println("O resultado do quociete da divisão é: "+x);
        System.out.println("O resto é:" +y);
        System.out.println("-------------------------------------------");
    }
}
