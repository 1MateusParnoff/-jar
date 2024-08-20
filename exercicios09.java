import java.util.Scanner;

public class exercicios09{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

            System.out.println("Qual seu nome?");

        String nome = ler.next();

            System.out.println("Quanto você recebe de salario ? ");

        double valor_mes = ler.nextInt();

        double valor_dia = valor_mes / 22;

        double valor_hora = valor_dia / 8;

        double hora_extra = valor_hora / 2;
        
        double valor_semana = valor_mes / 4;


            System.out.println(" Por mes " + nome + " recebe " + valor_mes + " por semana " + valor_semana + " por dia " + valor_dia + " por hora " + valor_hora + " e por hora extra " + hora_extra + " ");
    }
}