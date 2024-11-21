package ulbraap2.com;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 2019, 4);
        System.out.println(carro.informacoesVeiculo());

        Moto moto = new Moto("Honda", "CG 160 Titan", 2018, 160);
        System.out.println(moto.informacoesVeiculo());

    }
}