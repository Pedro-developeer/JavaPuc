package Lista6;

public class Lista6Att16 {
    public static void main(String[] args) {
        double Tokyo = 55000, Aparecida=1500, Ano=0;
        int Meses = 1;

        while (Aparecida<=Tokyo){
            Meses++;
            Aparecida = Aparecida + Aparecida * 0.0089;
            Tokyo = Tokyo + Tokyo * 0.005;
        }
        Ano = Meses/12;

        System.out.println("Aparecida levara "+Ano+" anos para alcançar Tokio");
    }
}