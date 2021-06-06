/*No curso de Programação, a  nota final de um estudante é  calculada a partir de seu  desempenho  em  três avaliações:
 um exame intermediário que vale 30% da nota final, um trabalho prático que corresponde a 20%
da  nota  final e um exame  final que  completa os 50%  restantes.  Faça um programa para ler o  nome
de  um aluno e suas notas nas três avaliações. O programa deve calcular sua nota final e exibir
a seguinte frase:
O aluno _________ teve nota final _________. */
import java.util.Scanner;
public class Lista1Att7 {
    public static void main(String[] args) {
        double n1,n2,n3,avaliacao1,avaliacao2,avaliacao3,media;
        String nome = "Pedro Henrique Santos";
        Scanner ler = new Scanner(System.in);
        System.out.println("Nota do exame N1: ");
        n1= ler.nextDouble();
        System.out.println("Nota do trabalho N2: ");
        n2= ler.nextDouble();
        System.out.println("Nota final: ");
        n3= ler.nextDouble();
        avaliacao1= n1*0.30;
        avaliacao2= n2*0.20;
        avaliacao3= n3*0.50;
        media = (avaliacao1+avaliacao2+avaliacao3);
        System.out.println("o aluno "+nome+", Obteve a media "+media);
    }
}
