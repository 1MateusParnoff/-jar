public class exercicios08 {
    public static void main(String[] args) {

        String nome = "Mateus";
        double notaA =  5;
        double notaT = 6;

        int media = 7;
        
        double calculo = (notaT + notaA) / 2;

        if(calculo >= media) {
            System.out.println("" + nome + " está aprovado com média " + calculo + " e não precisa de exame" );
        } else {
            System.out.println("" + nome + " está reprovado com média " + calculo + " e precisa de exame");
        }
    }
}