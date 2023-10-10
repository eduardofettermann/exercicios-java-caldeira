package eduardofettermann.exercicio04aula08.classes;

import eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util.OperatesWithoutMessage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperatesWithoutMessageTest {
    private OperatesWithoutMessage operatesWithoutMessage = new OperatesWithoutMessage();

    @Test
    void verificaSeRetornaFracaoDoNumero() {
        // Arrange
        double valorTotal = 1200;
        double porcentagemDeJuros = 20;
        // Act
        double juros = operatesWithoutMessage.returnPartOfNumber(valorTotal, porcentagemDeJuros);
        // Assert
        Assertions.assertEquals(240, juros);
    }

    @Test
    void verificaSeRetornaSoma() {
        // Arrange
        double valorTotal = 1200;
        double juros = 240;
        // Act
        double valorTotalComJuros = operatesWithoutMessage.sum(valorTotal, juros);
        // Assert
        Assertions.assertEquals(1440, valorTotalComJuros);
    }

    @Test
    void verificaSeRetornaProduto() {
        // Arrange
        double prazoEmAnos = 1;
        double umAnoEmMeses = 12;
        // Act
        double prazoEmMeses = operatesWithoutMessage.product(prazoEmAnos, umAnoEmMeses);
        // Assert
        Assertions.assertEquals(12, prazoEmMeses);
    }

    @Test
    void verificaSeRetornaQuociente() {
        // Arrange
        double valorTotalComJuros = 1440;
        double prazoEmMeses = 12;
        // Act
        double pagamentoMensal = operatesWithoutMessage.quotient(valorTotalComJuros, prazoEmMeses);
        // Assert
        Assertions.assertEquals(120, pagamentoMensal);
    }
}
