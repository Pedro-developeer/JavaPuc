package Lista6;
import java.util.Scanner;
public class Lista6Att10 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int n,i,d,e,prod=1;
        System.out.println("Digite o valor de n: ");
        n = ler.nextInt();
        i =0;
        while(prod < n){
            i = i +1;
            prod = i * (i + 1) * ( i + 2);
        }if (prod == n){
            d = i + 1;
            e = i + 2;
            System.out.println("Triangular = "+n+"*"+i+"*"+d+"*"+e);
        }else
            System.out.println("Não é triangular");

    }

}
