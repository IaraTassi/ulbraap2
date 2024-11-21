import org.junit.jupiter.api.Test;
import ulbraap2.com.Moto;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoTest {
    @Test
    void deveTestarInformacoesDaMoto() {
        // Arrange
        Moto moto = new Moto("Honda", "CG 160 Titan", 2018, 160);

        // Act
        String resultado = moto.informacoesVeiculo();

        // Assert
        assertEquals("Moto - Marca: Honda, Modelo: CG 160 Titan, Ano: 2018, Cilindrada: 160", resultado);
    }

    @Test
    void deveTestarAlteracaoDaCilindradaDaMoto() {
        // Arrange
        Moto moto = new Moto("Yamaha", "Fazer 250", 2021, 250);

        // Act
        moto.setCilindrada(300);
        int cilindradaAtual = moto.getCilindrada();

        // Assert
        assertEquals(300, cilindradaAtual);
    }

    @Test
    void deveTestarAlteracaoDeAtributosHerdados() {
        // Arrange
        Moto moto = new Moto("Suzuki", "Intruder", 2015, 125);

        // Act
        moto.marca = "Kawasaki";
        moto.modelo = "Ninja";
        moto.setAno(2020);

        // Assert
        assertEquals("Kawasaki", moto.marca);
        assertEquals("Ninja", moto.modelo);
        assertEquals(2020, moto.getAno());
    }

    @Test
    void deveTestarAnoInvalidoNaMoto() {
        // Arrange
        Moto moto = new Moto("Honda", "CG 160", 2018, 160);

        // Act
        moto.setAno(-1);

        // Assert
        assertEquals(-1, moto.getAno(), "Ano inválido deveria ser registrado, mas pode necessitar de validação futura");
    }

    @Test
    void deveTestarInformacoesDaMotoComValoresLimite() {
        // Arrange
        Moto moto = new Moto("Yamaha", "R1", 1900, 1000);

        // Act
        String resultado = moto.informacoesVeiculo();

        // Assert
        assertEquals("Moto - Marca: Yamaha, Modelo: R1, Ano: 1900, Cilindrada: 1000", resultado);
    }

    @Test
    void deveTestarConstrutorDaMoto() {
        // Arrange & Act
        Moto moto = new Moto("Ducati", "Panigale", 2022, 1100);

        // Assert
        assertEquals("Ducati", moto.marca);
        assertEquals("Panigale", moto.modelo);
        assertEquals(2022, moto.getAno());
        assertEquals(1100, moto.getCilindrada());
    }

    @Test
    void deveTestarCilindradaComValoresExtremos() {
        // Arrange
        Moto moto = new Moto("Triumph", "Tiger", 2022, 1200);

        // Act
        moto.setCilindrada(0);
        int cilindradaZero = moto.getCilindrada();

        moto.setCilindrada(10000);
        int cilindradaAlta = moto.getCilindrada();

        // Assert
        assertEquals(0, cilindradaZero);
        assertEquals(10000, cilindradaAlta);
    }

    @Test
    void deveTestarConsistenciaDoMetodoInformacoesVeiculoAposAlteracoes() {
        // Arrange
        Moto moto = new Moto("Kawasaki", "Z650", 2019, 650);

        // Act
        moto.marca = "BMW";
        moto.modelo = "F 850 GS";
        moto.setAno(2021);
        moto.setCilindrada(850);

        String resultado = moto.informacoesVeiculo();

        // Assert
        assertEquals("Moto - Marca: BMW, Modelo: F 850 GS, Ano: 2021, Cilindrada: 850", resultado);
    }

}
