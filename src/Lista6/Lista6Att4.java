package Lista6;
/*04 - Fazer um algoritmo que calcule e escreva o valor de S no seguinte somatório:
        1              2               4	 8		 16384
        S = ----------  -  ---------- + ----------  -  ---------- + ....... + ----------
        225           196	 169          144		     1
        */
public class Lista6Att4 {
    public static void main(String[] args) {
        int denominador,diminuendo;
        float numero,soma;
        denominador = 225;
        diminuendo = 15;
        numero = 1;
        soma = 0;
        while (denominador >=1){
            if (denominador% 2 == 0)
                soma = soma - numero / denominador;
            else
                soma = soma + numero / denominador;
            numero = numero * 2;
            diminuendo--;
            denominador = (int)Math.pow(diminuendo,2);
        }
        System.out.println("A soma é = "+soma);
    }
}