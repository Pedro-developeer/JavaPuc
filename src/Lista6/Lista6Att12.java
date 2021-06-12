package Lista6;
import java.util.Scanner;
public class Lista6Att12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero,contador,resultado;
        resultado = 0;
        System.out.print("Digite um número");
        numero = ler.nextInt();
        for(contador = 2; contador<= numero /2; contador++){
            if(numero % contador == 0){
                resultado++;
            }
        }
        if(resultado == 0){
            System.out.print(+numero+" é um número primo");
        }else
            System.out.print(+numero+" não é múmero primo");
    }

}
