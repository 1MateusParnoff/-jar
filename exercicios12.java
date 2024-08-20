import java.util.Scanner;

public class exercicios12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu salario: ");
        double salario = scanner.nextDouble();

        System.out.println("Anos de serviços: ");
        double tempo_servico = scanner.nextDouble();

        double reajuste;
        double bonus;



        if(salario <= 500) {
            reajuste = 0.25;
            System.out.println("Ajuste de 25% do salario: ");
        } else if (salario <= 1000) {
            reajuste = 0.20;
            System.out.println("Ajuste de 20% do salario: ");
        } else if (salario <= 1500) {
            reajuste = 0.15;
        System.out.println("Ajuste de 15% do salario: ");
        } else if (salario <= 2000) {
            reajuste = 0.10;
         System.out.println("Ajuste de 10% do salario: ");
        } else {
            reajuste = 0.00;
            System.out.println("Sem reajuste");
        }

        if(tempo_servico < 1) {
            System.out.println("Sem Bônus");
        } else if (tempo_servico >= 1 && 3 == tempo_servico) {
            System.out.println("R$ 100 de Bônus");
        } else if (tempo_servico >= 4 && 6 == tempo_servico) {
        System.out.println("R$ 200 de Bônus");
        } else if (tempo_servico >= 7 && 10 == tempo_servico) {
         System.out.println("R$ 300 de Bônus");
        } else {
            System.out.println("R$ 500 de Bônus");
        }

        double conta = salario * reajuste;
        System.out.println("Ajuste: " + conta);


    }
}
