package Lista6;
/*
05 - Fazer um algoritmo que calcule e escreva a soma dos 20 primeiros termos da série:
                100           99             98	97
       S = ---------- + ---------- + ---------- + ---------- + .......
                  0!             1!	           2!            3!
 */
public class Lista6Att5 {
    public static void main(String[] args) {
        int fatorial = 0 ; fatorial = 1 ;

        double divisao , numerador = 100 , resultado = 0 ;

        for(int i = 1 ; i <= 5 ; i++) {


            divisao = numerador/fatorial ;
            resultado = resultado + divisao ;
            numerador-- ;


            fatorial = fatorial * i ;


        }System.out.println(resultado);
    }
}