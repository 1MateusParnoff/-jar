import java.util.Scanner;

public class exercicios10 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua idade?");

        int idade = ler.nextInt();

        int cnh_AB = 18;
        int cnh_D = 21;

        if (idade >= cnh_AB) {
                System.out.println("Parabens você pode realizar as prova para CNH AB"); 
            } else if (idade >= cnh_D) {
            System.out.println("Parabens você pode realizar as prova para CNH D "); 
            } else {
                System.out.println("Infelizmente você não pode realizar nenhuma das prova "); 

        }
    }
}