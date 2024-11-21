package ulbraap2.com;

public class Carro extends Veiculo {
    public  int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String informacoesVeiculo() {
        return String.format("Carro - Marca: %s, Modelo: %s, Ano: %d, Número de Portas: %d.", marca, modelo, getAno(), numeroDePortas);
    }
}
