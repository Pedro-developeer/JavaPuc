/*1 –  Faça um programa que receba como entrada o nome e o salário de um funcionário de uma empresa e que calcule  o  novo  valor  do  salário  do  funcionário  levando  em  conta  que  esse  teve  um  aumento  de  25%.  O programa deve exibir na saída a seguinte frase
O funcionário ________ teve um aumento de R$ _______ e passará a receber um salário de  R$ ________ */
public class Lista1Att1 {
    public static void main(String[] args) {
        double salario = 3212;
        String fucionario = "Pedro Henrique Santos de Brito";
        salario = salario +(salario *0.25);
        System.out.println("O seu salario anterior era de R$3212 ");
        System.out.println("O fucionario "+fucionario+" teve um aumento de R$803,00 e passara receber um salario de"+salario+" ");
    }
}
