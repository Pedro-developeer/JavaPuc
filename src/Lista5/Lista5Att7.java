package Lista5;
import java.util.Scanner;
public class Lista5Att7 {
    public static void main(String[] args) {
        int numero, maior, menor;
        maior =0;
        menor = 0;
        String repetir = "s";
        Scanner ler = new Scanner(System.in);
        while (repetir.equals("s") || repetir.equals("S")) { //Comando de repetição para continuar o programa
            do {
                System.out.print("Digite um número: ");// Inserindo um numero do tipó inteiro
                numero = ler.nextInt();
                System.out.println("Quer continuar ?[S/N]");//
                repetir = ler.next();
                if(numero==0){
                    System.out.println("Por favor insira um numero diferente de zero! "); // quando o usario digitar o numero zero
                }
                if (numero > maior) // Maior do que zero pois o numero já foi definido zero linha 6
                    maior = numero; //Aí o numero será maior
                if (numero <= menor && numero != 0 || menor <= 0 ) menor = numero;
            }
            while (numero == 0) ;
        }
        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);
    }
}