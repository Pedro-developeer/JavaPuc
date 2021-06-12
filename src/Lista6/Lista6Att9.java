package Lista6;
/* Fazer um algoritmo que calcule o volume de uma esfera em função do raio R.
O raio deverá variar de 0 a 20 cm de 0,5 em 0,5cm.
                              4
       Volume  = ----------  * 𝜋 * R3
                              3

 */
import java.util.Scanner;
public class Lista6Att9 {
    public static void main(String[] args) {
        double Volume,Pi,Raio;
        Scanner ler = new Scanner(System.in);
        Pi = 3.1415;
        System.out.print("Insira o raio da esfera: ");
        Raio = ler.nextInt();
        Volume = (4.0/3) * Pi * Math.pow(Raio,3);
        System.out.println("O volume dessa esfera é "+Volume+ "³");
    }
}
