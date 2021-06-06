package Lista5;

import java.util.Scanner;
public class Lista5Att8 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String sexo;
        float alturaM, MaisAltoM, MaisAltoF, BaixoAlturaM = 0, BaixoAlturaF = 0, alturaF = 0, alturaMediaM = 0, alturaMediaF = 0;
        float i = 1, masculinoContador = 0, femininoContador = 0; //definindo variaveis
        MaisAltoM = 0;

        MaisAltoF = 0;

        for (i = 1; i <= 50; i++) { //Incrementado de pessoas
            System.out.println("digite M para Masculino ou F para feminino: "); //Entrando com dado se é masculino ou feminino
            sexo = ler.next();                                                 //lendo dado


            if (sexo.equals("m") || sexo.equals("M")) { //Inserindo M ou m para masculino
                masculinoContador++;                    //Incrementado Masculino
                System.out.println("Entre com a altura da pessoa: ");  //entrando com dado da altura
                alturaM = ler.nextFloat();                         //lendo a altura
                alturaMediaM = (float) (masculinoContador / alturaM ); //entrando com media altura masculino
                if (alturaM > MaisAltoM) { //Condição para mais alto
                    MaisAltoM = alturaM;   //Definindo quem é o mais alto
                    if (alturaM <= BaixoAlturaM && BaixoAlturaM != 0 || BaixoAlturaM <= 0 ){ BaixoAlturaM = alturaM; //Condição para menor homem que seja diferente de zero
                        {
                            BaixoAlturaM = alturaM; //Homem baixo atribuido
                        }
                    }
                }
            }

            if (sexo.equals("f")|| sexo.equals("F")) { //Entrando com sexo da pessoa tanto faz F ou f
                femininoContador++;                    //Incrementado femininp
                System.out.println("Entre com a altura da pessoa: "); //altura feminina
                alturaF = ler.nextFloat();                            //lendo a altura feminina
                alturaMediaF = femininoContador / alturaF;            //media da altura das mulheres
                if (alturaF > MaisAltoF) {                        //A mais alta das mulheres
                    MaisAltoF = alturaF;                          //Lendo qual é a mais alta das mulheres
                    if (alturaF <= BaixoAlturaF && BaixoAlturaF != 0 || BaixoAlturaF <= 0 ){ BaixoAlturaF = alturaF; //Condição para ler qual e mais baixas das mulhres ese valor não pode ser zero
                        {
                            BaixoAlturaM = alturaF; // mulher mais baixa foi atribuida
                        }
                    }
                }
            }

        }
        System.out.println("A altura média dos Homens: " + alturaMediaM); //Saida
        System.out.println("A altura média dos Mulheres: " + alturaMediaF);//Saida
        System.out.println("A maior altura dentre os homens é: " + MaisAltoM);//Saida
        System.out.println("A maior altura dentre as mulheres é: " + MaisAltoF);//Saida
        System.out.println("O mais baixo dos homens é:" + BaixoAlturaM);//Saida
        System.out.println("O mais baixo das Mulheres é:" + BaixoAlturaF);//Saida
    }
}