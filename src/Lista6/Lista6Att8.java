package Lista6;
import java.util.Scanner;
public class Lista6Att8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, limite;
        numero = 1;
        float soma = 0;
        System.out.print("Digite o valor limite: ");
        limite = ler.nextInt();
        while (numero <= limite){
            soma = soma + numero;
            numero++;
        }
        System.out.println("A soma é ="+soma);
    }
}
