package Lista6;
/*
6ª Lista de Exercícios – Estrutura de Repetição
01 - Fazer um algoritmo que calcule e escreva o valor de S:
               1         3        5        7                     99
       S = ----- + ----- + ----- + ----- + .......... + -----
                1        2        3        4                      50
 */
public class Lista6Att1 {
    public static void main(String[] args) {

        double numero =1, denominador=1, soma=0;
        while(denominador<=2){
            soma=(soma+numero)/denominador;
            numero=numero+2;
            denominador++;
        }
        System.out.println("A soma da sequencia é: "+soma);
    }
}