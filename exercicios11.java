class Carro {

    String Gasolina;
    int Aro;
    String Cor;
    int motor;

    void exibir() {

    System.out.println("Combustivel: " + Gasolina);
    System.out.println("Aro: " + Aro);
    System.out.println("Cor: " + Cor);

    }
}

public class exercicios11 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.Gasolina = "Flex";
        carro1.Aro = 13;
        carro1.Cor = "Cinza";
        carro1.motor = 2;

        System.out.println("Carro: ");
        carro1.exibir();





    }
}



