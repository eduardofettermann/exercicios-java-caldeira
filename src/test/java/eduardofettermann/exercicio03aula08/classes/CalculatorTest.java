package eduardofettermann.exercicio03aula08.classes;

import eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void somarNumeros() {
        //Arrange
        Calculator calculator = new Calculator();

        //Act
        double soma = calculator.sum(2, 6);

        // Assert
        Assertions.assertEquals(8, soma);
    }
}