package Lista6;
/* Para evitar erros de digitação de seqüências numéricas de importância fundamental,
como a matrícula de um aluno, o número de conta bancária, o CPF do imposto de renda, etc,
geralmente se adiciona ao número um dígito verificador. Por exemplo, o número de matrícula
811057 é usado como 811057-3, onde 3 é o dígito verificador, calculado da seguinte maneira:
Cada algarismo do número é multiplicado por um peso começando de 2 e crescendo de 1, da direita
para a esquerda: 8*7, 1*6 , 1*5 , 0*4 , 5*3 , 7*2;
Somando-se as parcelas obtidas: 8*7 + 1*6 + 1*5 + 0*4 + 5*3 + 7*2
     56 + 6 + 5 + 0 + 15 + 14 = 96;
Calcula-se o resto da divisão desta por 11: 96 dividido por 11 dá resto 8 (96 = 8*11+8);
Subtrai-se de 11 o resto obtido: 11 – 8 = 3;
Se o valor encontrado for 10 ou 11, o dígito verificador será 0; nos outros casos, o dígito
 verificador é o próprio valor encontrado.
Fazer um algoritmo que leia o CPF de uma pessoa, o CPF e composto de 11 dígitos sendo os 9
 primeiros os de identificação e os dois últimos os dígitos de verificação, calcule e escreva
 se o CPF digitado é válido ou não.

 */
import java.util.Scanner;
public class Lista6Att14 {
    public static void main(String[] args) {
        int valor, resultado1, resto1, resultado2, resto2, resultado3, resto3, resultado4, resto4, resultado5, resto5, resultado6;
        int c1, c2, c3, c4, c5, c6, soma, divisao, digito;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a matricula: ");
        valor = ler.nextInt();
        resultado1 = valor / 100000;
        resto1 = valor % 100000;
        resultado2 = resto1 / 10000;
        resto2 = resto1 % 10000;
        resultado3 = resto2 / 1000;
        resto3 = resto2 % 1000;
        resultado4 = resto3 / 100;
        resto4 = resto3 % 100;
        resultado5 = resto4 / 10;
        resto5 = resto4 % 10;
        resultado6 = resto5;

        c6 = resultado6 * 2;
        c5 = resultado5 * 3;
        c4 = resultado4 * 4;
        c3 = resultado3 * 5;
        c2 = resultado2 * 6;
        c1 = resultado1 * 7;
        soma = c1+c2+c3+c4+c5+c6;
        divisao = soma/11;
        digito = 11 - divisao;

        System.out.print(valor);
        if(digito == 10 || digito == 11)
            System.out.print("-0");
        else
            System.out.print("-" + digito);

    }
}
