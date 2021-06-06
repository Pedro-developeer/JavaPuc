package Lista6;
import java.util.Scanner;
public class Lista6Att7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero=1 , limite=1;
        System.out.println("digite o valor limite: ");
        limite=ler.nextInt();
        while (numero<=limite){
            if(numero%2==0)
                System.out.println("Numero par da sequencia: "+numero);
            numero++;
        }
    }
}