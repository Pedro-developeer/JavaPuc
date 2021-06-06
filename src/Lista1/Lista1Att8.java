/* Sabe-se que  para iluminar  de  maneira  correta os  cômodos de uma  casa, para   cada  m2, deve-se
  utilizar 18W de potência. Faça um programa que receba as duas dimensões de um cômodo (em metros),
   calcule a sua área (em m2) e a potência de iluminação que deverá ser utilizada. */
import java.util.Scanner;
public class Lista1Att8 {
    public static void main(String[] args) {
        double altura,largura,comprimento,area,potencia;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a largura: ");
        largura = ler.nextDouble();
        System.out.println("Informe a comprimento: ");
        comprimento = ler.nextDouble();
        area = largura*comprimento;
        potencia = area/18;
        System.out.println("A iluminação deve ter uma potencia "+potencia+" watts");
        System.out.println("O tamnho do comodo é " +area+ "m²");
    }
}
