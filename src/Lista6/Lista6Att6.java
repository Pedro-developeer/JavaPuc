package Lista6;
public class Lista6Att6 {
    public static void main(String[] args) {
        double fatorial = 1 ;

        double a = 0 , b = 0 ;

        double divisao = 0 , numerador = 0 , resultado = 0 ;

        for(int j = 1 , i = 0; j <= 50 ; j++, i++) {

            numerador = numerador + numerador +1 ;
            fatorial = fatorial * j ;
            divisao = fatorial/numerador ;

            if(i%2==0) {
                a = a + divisao ;

            }else
            if(i%2!=0) {

                b = b - divisao ;
            }

        }
        resultado = a + b ;

        System.out.println("resultado : "+resultado);
        System.out.println("valor somado em todos os loop : "+a);
        System.out.println("valor subtraído em todos os loop : "+b);
        System.out.println("denominador do último loop : "+numerador);
        System.out.println("fatorial do último loop : "+fatorial);
        System.out.println("divisao do último loop :"+divisao);

    }
}