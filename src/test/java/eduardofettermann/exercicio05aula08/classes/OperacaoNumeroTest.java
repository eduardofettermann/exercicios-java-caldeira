package eduardofettermann.exercicio05aula08.classes;

import eduardofettermann.exercicios.solucoes.aula08.exercicio05aula08.util.OperacaoNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacaoNumeroTest {
    private static final OperacaoNumero OPERACAO_NUMERO = new OperacaoNumero();

    @Test
    void verificaSeRetornaASomaDosNumeros() {
        // Arrange
        int[] numeros = {2, 2, 10};
        int retornoEsperado = 14;
        // Act
        int retornoMetodo = OPERACAO_NUMERO.somarNumeros(numeros);
        // Assert
        Assertions.assertEquals(retornoEsperado, retornoMetodo);
    }

    @Test
    void verificaSeRetornaSeONumeroPassadoForPar() {
        // Arrange
        int numeroPar = 4;
        int numeroImpar = 3;
        // Act
        boolean deveRetornarTrue = OPERACAO_NUMERO.ehPar(numeroPar);
        boolean deveRetornarFalse = OPERACAO_NUMERO.ehPar(numeroImpar);
        // Assert
        Assertions.assertTrue(deveRetornarTrue);
        Assertions.assertFalse(deveRetornarFalse);
    }

    @Test
    void verificaSeRetornaONumeroFatorialDoNumeroPassado() {
        // Arrange
        int numeroPassado = 5;
        int retornoEsperado = 120; // !5 = 120
        // Act
        int retornoMetodo = OPERACAO_NUMERO.calcularFatorial(numeroPassado);
        // Arrange
        Assertions.assertEquals(retornoEsperado, retornoMetodo);
    }

    @Test
    void verificaSeNumeroNegativoRetornaUmaException() {
        // Arrange
        int numeroNegativo = -8;
        Class<IllegalArgumentException> exceptionEsperada = IllegalArgumentException.class;
        // Act
        OPERACAO_NUMERO.calcularFatorial(numeroNegativo); // -> deve retornar IllegalArgumentException
        // Arrange
        Assertions.assertThrows(exceptionEsperada, () -> OPERACAO_NUMERO.calcularFatorial(numeroNegativo));
    }

    @Test
    void verificaSeRetornaSeAStringForUmPalindromo() {
        // Arrange
        String palindromo = "RenNer";
        String naoPalindromo = "Agi, eu te quero!";
        // Act
        boolean deveRetornarTrue = OPERACAO_NUMERO.ehPalindromo(palindromo);
        boolean deveRetornarFalse = OPERACAO_NUMERO.ehPalindromo(naoPalindromo);
        // Assert
        Assertions.assertTrue(deveRetornarTrue);
        Assertions.assertFalse(deveRetornarFalse);
    }

    @Test
    void verificaSeRetornaNEsimoTermoPassadoDaFibonacci() {
        // Arrange
        int numeroPassado = 8;
        int retornoEsperado = 21;
        // Act
        int retornoMetodo = OPERACAO_NUMERO.calcularFibonacci(numeroPassado);
        // Assert
        Assertions.assertEquals(retornoEsperado, retornoMetodo);
    }

    @Test
    void verificaSeNumeroNegativoRetornaExceptionFibonacci() {
        // Arrange
        int numeroNegativo = -10;
        Class<IllegalArgumentException> exceptionEsperada = IllegalArgumentException.class;
        // Act
        OPERACAO_NUMERO.calcularFibonacci(numeroNegativo); // -> deve retornar IllegalArgumentException
        // Assert
        Assertions.assertThrows(exceptionEsperada, () -> OPERACAO_NUMERO.calcularFibonacci(numeroNegativo));
    }
}