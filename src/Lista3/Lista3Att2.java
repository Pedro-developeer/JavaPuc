/* A  nota  de  um  aluno  em  uma  disciplina  é  a  média  ponderada  das  notas  de  suas  duas
avaliações  parciais.  A  primeira avaliação parcial tem peso 2  e a segunda avaliação parcial
tem peso  3. Se a média do aluno  for maior ou igual a sete, o aluno está  aprovado. Se a  média
do aluno for menor  que três, o  aluno está reprovado . Se a média do aluno for menor que  sete e
 maior  ou  igual  a  três,  o  aluno  irá  para  a  recuperação.  Faça  um  programa  para  c
 alcular  a  média  de  u m  aluno  em  uma determinada disciplina e informar o seu estado
 final. O programa deverá exibir a seguinte frase:
 O aluno ______________ obteve média ____________ e está  __________________.
 */
import java.util.Scanner;
public class Lista3Att2 {
    public static void main(String[] args) {
        float avaliacao1,avaliacao2,media;
        String nome;
        System.out.println("-----------------------------");
        System.out.println("Media ponderada");
        System.out.print("Informe o nome do usuariuo: ");
        Scanner ler = new Scanner (System.in);
        nome = ler.nextLine();
        System.out.print("Informe a nota da primeira avaiação parcial: ");
        avaliacao1 = ler.nextFloat();
        System.out.print("Inform a nota da segunda avaliação parcial: ");
        avaliacao2 = ler.nextFloat();

        media = ((avaliacao1 * 2) + (avaliacao2 * 3 ))/ 5;

        if (media>=7) {
            System.out.println("O aluno "+nome+"obete a media " +media+" esta APROVADO! ");
        }
        else if (media<3) {
            System.out.println("O aluno "+nome+" obeteve a media " +media+" esta REPROVADO estude mais ! ");
        }
        else{
            System.out.println("O aluno "+nome+" obeteve a media " +media+" esta RECUPERAÇÃO! ");
        }
    }
}
