/*Fazer um algoritmo que dado os lados de um triângulo A, B e C. Dizer se os lados
dados

 formam um triângulo: retângulo
(A2=B2+C2), obtusângulo (A2 >B2+C2) ou acutângulo (A2<B2+C2). */
import java.util.Scanner;
public class Lista4Att3 {
    public static void main(String[] args) {
        double LadoA,LadoB,LadoC;            //entrada de variaveis
        Scanner ler = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.print("Informe o lado de A: ");   //informando lado A
        LadoA = ler.nextDouble();
        System.out.print("Informe o Lado B: ");     //informando lado  B
        LadoB = ler.nextDouble();
        System.out.print("Informe lado C: ");      //informando lado  c
        LadoC = ler.nextDouble();
        System.out.println("-------------------------------------------------");

        if(Math.pow(LadoA,2)==Math.pow(LadoB,2)+Math.pow(LadoC,2)){
            System.out.println("Esse é um Triangulo retangulo!");
        }
        else if(Math.pow(LadoA,2) > Math.pow(LadoB,2) + Math.pow(LadoC,2)){
            System.out.println("Esse é um triangulo obtusângulo");
        }
        else if (Math.pow(LadoA,2) < Math.pow(LadoB,2) + Math.pow(LadoC,2)){
            System.out.println("Esse é um triangulo acutângulo");
        }
    }
}
