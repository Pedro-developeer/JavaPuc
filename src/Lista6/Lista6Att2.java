package Lista6;
/*02 - Fazer um algoritmo que calcule e escreva a seguinte soma: 𝑆
              37*38       36*37      35*34		 1*2
       S = ---------- + ---------- + ---------- + .......... + ----------
                1       	        2	           3                           37

 */
public class Lista6Att2 {
    public static void main(String[] args) {
        double numero,den,soma,A,B;
        numero = 37;
        den = 1;
        soma = 0;
        A = 37;
        B = 38;
        while (den <= 37){
            numero = A * B;
            soma = soma + numero / den;
            A--;
            B--;
            den++;
        }
        System.out.println("A soma da sequencia é = "+soma);
    }
}