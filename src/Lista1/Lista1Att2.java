/*No colégio, “Minha Escolinha”,  a nota bimestral de um aluno em uma disciplina é a média ponderada das notas  parciais. A primeira  nota parcial tem peso 2 e a segunda nota parcial tem peso 3. Faça  um  programa para obter o nome e as notas de um aluno em uma determinada disciplina  e calcular sua média. O programa deverá exibir a seguinte frase:
        O aluno _________ obteve média _________ */
import java.util.Scanner;
public class Lista1Att2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextInt();
        double B = leitor.nextInt();
        double media;
        media = (A * 2 + B * 3) /5;

        System.out.println("A media é: " +media);
    }
}
