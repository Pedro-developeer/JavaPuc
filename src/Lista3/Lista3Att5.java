import java.util.Scanner;
public class Lista3Att5 {
    public static void main(String[] args) {
        float media;
        String nome;
        System.out.println("-----------------------------");
        System.out.println("Entre numa faculdade pela media");
        Scanner ler = new Scanner (System.in);
        System.out.print("Qual é seu nome ? ");
        nome = ler.nextLine();
        System.out.print("Informe sua media: ");
        media = ler.nextInt();
        if (media>=9){
            System.out.print("Parabéns " +nome+ "! Você e altamente recomendado para entrar na instituição!");
        }
        else if (media>=8){
            System.out.println("Parabéns" +nome+ "!Voce fortemenete recomendado para entrar na instituição!");
        }
        else if(media>=7) {
            System.out.println("Parabéns" + nome + "!Voce é recomendado para entrar na instituição!");
        }
        else {
            System.out.println("Infelizmente "+nome+" vocẽ não foi recomendado para entrar na instituição");
        }

    }
}
