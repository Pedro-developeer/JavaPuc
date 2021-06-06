/*Faça um programa para ler dois valores inteiros, uma para a variável A e outro para a variável B,
 e para efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B
 e variável B passe a possuir o valor da variável
A. OBS: Não utilize uma variável auxiliar.
 */
public class Lista1Att5 {
    public static void main(String[] args) {
  int A = 23;
  int B = 33;
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("O valor invertido de A"+A);
        System.out.println("O valor invertido de B "+B);
    }
}
