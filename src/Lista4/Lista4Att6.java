import java.util.Scanner;

/* Escreva um algoritmo que descubra se um ano lido é bissexto.
Um ano é bissexto se ele for múltiplo de 4, exceto quando ele formúltiplo de 100.
Os anos múltiplos de 100 somente são bissextos quando são múltiplos de 400, usado a
 partir de 1752 (por exemplo 1800 não é bissexto, mas 2000 é).
 */
public class Lista4Att6 {
    public static void main(String[] args) {
        int ano;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o ano :");
        ano = ler.nextInt();
        if ( (ano % 400 == 0) || ( (ano % 4 == 0) && (ano % 100 != 0) ) ){
            System.out.println("O ano " + ano + " é bissexto!");
        }
        else{
            System.out.println("O ano "+ano+" não é bissexto");
        }

    }
}
