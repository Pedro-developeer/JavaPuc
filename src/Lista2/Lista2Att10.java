/*Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um programa para ler o preço
do litro da gasolina e o valor do pagamento, calcular e mostrar quantos litros ele conseguirá colocar
no tanque.
 */
import java.util.Scanner;
public class Lista2Att10 {
    public static void main(String[] args) {
        float Tanque, ValorDaGasolina, ValorTotal;
        Scanner ler = new Scanner(System.in);
        System.out.println("Posto Shell");
        System.out.println("Digite o valor da Gasolina: ");
        ValorDaGasolina = ler.nextFloat();
        System.out.println("Quantos reais de gasolina você quer colocar: ");
        ValorTotal = ler.nextFloat();
        Tanque = ValorTotal/ValorDaGasolina;
        System.out.println("Voce comprou" +Tanque+ "L de gasolina");

    }
}
