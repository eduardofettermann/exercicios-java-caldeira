package eduardofettermann.exercicio04aula08.classes;

import eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util.MortgageCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MortgageCalculatorTest {
    @Test
    void verificaSeRetornaTaxaMensalDaHipoteca() {
        // Arrange
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        // Act
        // 1440 -> total com juros, 1440 / 18(1,5 ano) -> 80
        double valorMensal = mortgageCalculator.calculaPagamentoMensalDaHipoteca(1200, 20, 1.5);
        // Assert
        Assertions.assertEquals(80, valorMensal);
    }


}
