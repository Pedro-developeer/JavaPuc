package Lista6;
public class lISTA6Att3 {
    public static void main(String[] args) {
        int num = 1000;
        double den,soma;
        den = 1;
        soma = 0;
        while (den<=50){
            if(num%2==0)
                soma = soma + num / den;
            else
                soma = soma - num / den;
                num = num - 3;
                den++;
        }
        System.out.println("A soma da sequencia = "+soma);
    }
}
