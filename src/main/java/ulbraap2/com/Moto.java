package ulbraap2.com;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return String.format("Moto - Marca: %s, Modelo: %s, Ano: %d, Cilindrada: %d", marca, modelo, getAno(), cilindrada);
    }
}
