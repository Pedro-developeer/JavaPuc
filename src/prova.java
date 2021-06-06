
import java.sql.SQLOutput;
import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nome;
        int matricula;
        double n1,n2,np1,np2,nt,np,ma;       //Declarando Variaveis

        System.out.println("MEDIA");

        System.out.print("Informe seu nome: "); //Informando nome de usuario
        nome= ler.nextLine();

        System.out.print("Informe sua Matricula: "); //informando Matricula
        matricula= ler.nextInt();
        if((matricula>=100000)&&(matricula<=999999)) //Condicional
            System.out.println("Matricula valida"); // Aprovado

        else                                        //Condicional
            System.out.println("Matricula invalida! Por favor insira uma matricula de 6 digitos ");


        System.out.print("informe sua nota 1 obtida na preleção: ");  //informando nota 1
        n1= ler.nextDouble();
        System.out.print("informe sua nota 2 obtida na preleção: "); //informando nota 2
        n2= ler.nextDouble();
        System.out.print("informe sua nota 1 obtida no laboratorio: "); //informando nota 1 lab
        np1= ler.nextDouble();
        System.out.print("informe sua nota 2 obtida no laboratorio: ");//informando nota 2 lab
        np2= ler.nextDouble();

        nt=(n1+n2)/2;                           // calculo exposto pelo exercicio
        np=(np1+np2)/2;                         // calculo exposto pelo exercicio

        ma=Math.sqrt(nt*np);
        if(ma<4.9) {             //
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("O aluno " +nome+ "  da matricula " + matricula + " teve sua média de:" + ma + " e esta REPROVADO");
            System.out.println("TABELA DE NOTAS: ");
            System.out.println("notas obtidas na preleção: " + n1 + "," + n2 + " media entre n1 e n2: "+nt);
            System.out.println("notas obtidas no Laboratorio: " + np1 + "," + np2 + " media entre np1 e np2:"+nt);
            System.out.println("----------------------------------------------------------------------------------------");
        }


        else{
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("O aluno " + nome + "da matricula " + matricula + " teve sua média de: " + ma + " e esta APROVADO!");
            System.out.println("TABELA DE NOTAS: ");
            System.out.println("notas obtidas na preleção: " + n1 + "," + n2);
            System.out.println("notas obtidas no Laboratorio: " + np1 + "," + np2);
            System.out.println("--------------------------------------------------------------------------------------");
        }





    }
}