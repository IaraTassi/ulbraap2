import org.junit.jupiter.api.Test;
import ulbraap2.com.Carro;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {
    @Test
    void deveTestarInformacoesDoCarro() {
        // Arrange
        Carro carro = new Carro("Honda", "Civic", 2019, 4);

        // Act
        String resultado = carro.informacoesVeiculo();

        // Assert
        assertEquals("Carro - Marca: Honda, Modelo: Civic, Ano: 2019, Número de Portas: 4.", resultado);
    }

    @Test
    void deveTestarAlteracaoDoAnoDoCarro() {
        // Arrange
        Carro carro = new Carro("Ford", "Mustang", 2020, 2);

        // Act
        carro.setAno(2021);
        int anoAtual = carro.getAno();

        // Assert
        assertEquals(2021, anoAtual);
    }

    @Test
    void deveTestarAlteracaoDeTodosOsAtributosDoCarro() {
        // Arrange
        Carro carro = new Carro("Chevrolet", "Onix", 2020, 4);

        // Act
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2023);
        carro.numeroDePortas = 5;

        // Assert
        assertEquals("Toyota", carro.marca);
        assertEquals("Corolla", carro.modelo);
        assertEquals(2023, carro.getAno());
        assertEquals(5, carro.numeroDePortas);
    }

    @Test
    void deveTestarAlteracaoDeAtributosHerdados() {
        // Arrange
        Carro carro = new Carro("Fiat", "Uno", 2015, 4);

        // Act
        carro.marca = "Peugeot";
        carro.modelo = "208";
        carro.setAno(2022);

        // Assert
        assertEquals("Peugeot", carro.marca);
        assertEquals("208", carro.modelo);
        assertEquals(2022, carro.getAno());
    }

    @Test
    void deveTestarConsistenciaAposAlteracoes() {
        // Arrange
        Carro carro = new Carro("Volkswagen", "Gol", 2018, 4);

        // Act
        carro.marca = "Renault";
        carro.modelo = "Sandero";
        carro.setAno(2021);
        carro.numeroDePortas = 5;

        String resultado = carro.informacoesVeiculo();

        // Assert
        assertEquals("Carro - Marca: Renault, Modelo: Sandero, Ano: 2021, Número de Portas: 5.", resultado);
    }

    @Test
    void deveTestarAnoInvalidoNoCarro() {
        // Arrange
        Carro carro = new Carro("Chevrolet", "Cruze", 2019, 4);

        // Act
        carro.setAno(-1);

        // Assert
        assertEquals(-1, carro.getAno(), "Ano inválido deveria ser registrado, mas pode necessitar de validação futura");
    }

    @Test
    void deveTestarNumeroDePortasInvalido() {
        // Arrange
        Carro carro = new Carro("Hyundai", "HB20", 2020, 4);

        // Act
        carro.numeroDePortas = -1;

        // Assert
        assertEquals(-1, carro.numeroDePortas, "Número de portas inválido deveria ser aceito, mas necessita de validação futura.");
    }

    @Test
    void deveTestarConstrutorDoCarro() {
        // Arrange & Act
        Carro carro = new Carro("BMW", "X5", 2021, 4);

        // Assert
        assertEquals("BMW", carro.marca);
        assertEquals("X5", carro.modelo);
        assertEquals(2021, carro.getAno());
        assertEquals(4, carro.numeroDePortas);
    }

    @Test
    void deveTestarAlteracaoDoNumeroDePortas() {
        // Arrange
        Carro carro = new Carro("Audi", "A3", 2022, 2);

        // Act
        carro.numeroDePortas = 5;
        int numeroDePortasAtual = carro.numeroDePortas;

        // Assert
        assertEquals(5, numeroDePortasAtual);
    }

    @Test
    void deveTestarValoresMaximosEMinimos() {
        // Arrange
        Carro carro = new Carro("Ford", "F-150", 2022, 2);

        // Act
        carro.setAno(1900);  // Ano muito antigo
        carro.numeroDePortas = 0;  // Número de portas inválido

        // Assert
        assertEquals(1900, carro.getAno());
        assertEquals(0, carro.numeroDePortas);  // Precisaria de validação de valor mínimo em produção
    }

}
