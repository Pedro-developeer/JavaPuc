/*Fazer um programa que calcule a função 𝑓(𝑥) = 2𝑥2 − 3,
 sendo que o valor de 𝑥 deve ser fornecido pelo usuário. O programa deve mostrar o valor de 𝑓( 𝑥).
 */

import java.util.Scanner;
public class Lista2Att1 {
    public static void main(String[] args) {
        double funçao, x;
        Scanner ler = new Scanner(System.in);
        System.out.println("Imforme o valor de x ");
        x = ler.nextDouble();
        funçao = 2 * Math.pow(x, 2) - 3;
        System.out.println("A função f(" +x+")=" + funçao);
    }
}
