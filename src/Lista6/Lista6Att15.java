package Lista6;

import java.util.Scanner;
public class Lista6Att15 {
    public static void main(String[] args) {
        int numero,peso,peso_Maior,peso_Menor,numero_Maior,numero_Menor,quantidade;
        Scanner ler = new Scanner(System.in);
        peso_Maior = 0;
        peso_Menor = 1000;
        numero_Maior = 0;
        numero_Menor = 0;
        quantidade = 1;
        while (quantidade <= 4){
            System.out.print("Entre com número de etiqueta do boi: ");
            numero = ler.nextInt();
            System.out.print("Entre com peso do boi: ");
            peso = ler.nextInt();
            if (peso_Maior <=peso){
                peso_Menor = peso;
                numero_Maior = numero;
            }if (peso_Menor>=peso){
                peso_Menor = peso;
                numero_Menor = numero;
            }
            quantidade++;
        }
        System.out.println("O Boi numero "+numero_Menor+ " tem o peso "+peso_Menor);
        System.out.println("O Boi numero "+numero_Maior+ " tem o peso "+peso_Maior);
    }
}
