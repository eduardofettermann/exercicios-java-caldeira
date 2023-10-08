package eduardofettermann.exercicio03aula08.classes;

import eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @DisplayName("Verifica se o retorno é a soma dos parâmetros")
    @Test
    void somarNumeros() {
        //Arrange
        Calculator calculator = new Calculator();
        //Act
        double soma = calculator.sum(2, 6);
        // Assert
        Assertions.assertEquals(8, soma);
    }

    @DisplayName("Verifica se o retorno é a diferença dos parâmetros")
    @Test
    void subtrairNumeros() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double subtracao = calculator.difference(10, 7);
        // Assert
        Assertions.assertEquals(3, subtracao);
    }

    @DisplayName("Verifica se o retorno é o produto dos parâmetros")
    @Test
    void multiplicarNumeros() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double produto = calculator.product(3, 4);
        // Assert
        Assertions.assertEquals(12, produto);
    }

    @DisplayName("Verifica se o retorno é o quociente dos parâmetros")
    @Test
    void dividirNumero() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double quociente = calculator.quotient(10, 2);
        // Assert
        Assertions.assertEquals(5, quociente);
    }
    @DisplayName("Verifica se o retorno é a raiz quadrada do número passado")
    @Test
    void verificaSeRetornaARaizQuadradaDoParametro(){
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double raizQuadrada = calculator.squaredRootOf(64);
        // Assert
        Assertions.assertEquals(8,raizQuadrada);
    }

    @DisplayName("Verifica se o retorno é o resultado da potência do número passado como base")
    @Test
    void verificaSeRetornaAPotenciaDaBase(){
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        double potencia = calculator.potencia(3,2);
        // Assert
        Assertions.assertEquals(9,potencia);
    }
}