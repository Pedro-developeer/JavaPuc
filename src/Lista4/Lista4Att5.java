/* 5 - Desenvolver um algoritmo com as opções de calcular e imprimir o volume
 e a área da superfície de um cone reto, de um cilindro ou de uma esfera.
 O algoritmo deverá ler a opção da figura desejada (cone/cilindro /esfera)
 e de acordo com a opção escolhida calcular e escrever o volume e a área da
 superfície da figura pedida.
 */
import java.util.Scanner;
public class Lista4Att5 {
    public static void main(String[] args) {
    Double raio,volume,altura,area;
    int tipogeometrico;
        Scanner ler = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.println("\t AREA E VOLUME DE UM CILINDRO,ESFERA E CONE         |");
        System.out.println("\t ESCOLHA UMAS DAS OPÇÕES ABAIXO                     |");
        System.out.println("\t Tipo 1: CONE RETO                                  |");
        System.out.println("\t Tipo 2: CILINDRO                                   |");
        System.out.println("\t Tipo 3: ESFERA                                     |");
        System.out.println("--------------------------------------------------------");
        System.out.print("Escolha qual tipo :");
        tipogeometrico = ler.nextInt();
        switch (tipogeometrico) {
            case 1:
                System.out.println("Você escolheu CONE RETO!");
                System.out.print("Informe o raio do cone reto :");
                raio = ler.nextDouble();
                System.out.print("Informe a altura: ");
                altura = ler.nextDouble();

                volume = ((3.14 * Math.pow(raio,2) * altura))/3; //Volume do Cone reto
                area = ((3.14 * raio )* Math.sqrt(Math.pow(raio,2)+ Math.pow(altura,2)));  // Area do cone reto

                System.out.println("O volume do Cone reto è "+volume+ " a area do cone reto é "+area);
                break;

            case 2:
                System.out.println("Voce escolheu CILINDRO!");
                System.out.print("Informe o raio do cilindro: ");
                raio = ler.nextDouble();
                System.out.print("Informe a altura do cilindro: ");
                altura = ler.nextDouble();

                volume = (3.14 * Math.pow(raio,2) * altura);
                area = (2  * 3.14 * raio * altura);
                System.out.println(" O volume do cilinsro é "+volume+", a area do cilindro é "+area);
                break;

            case 3:
                System.out.println("Voce escolheu ESFERA!");
                System.out.print("Informe o raio da esfera: ");
                raio = ler.nextDouble();

                volume = ((4/3) * 3.14 * Math.pow(raio,3));
                area = (4 * 3.14 * raio);
                System.out.println("O volume da esfera é "+volume+ " a area da esfrea é "+area);
                break;
            default:{
                System.out.println("Opção invalida! ");
            }
        }

    }
}
