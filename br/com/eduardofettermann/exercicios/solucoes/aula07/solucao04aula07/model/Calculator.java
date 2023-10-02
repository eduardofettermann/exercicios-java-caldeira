package br.com.eduardofettermann.exercicios.solucoes.aula07.solucao04aula07.model;

public class Calculator implements Calculable {

    public void calculates(Operation operation, int num1, int num2) {
        switch (operation) {
            case ADICAO -> sum(num1, num2);
            case SUBTRACAO -> difference(num1, num2);
            case MULTIPLICACAO -> product(num1, num2);
            case DIVISAO -> quotient(num1, num2);
        }
    }

    @Override
    public void sum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.printf("\n %d + %d = %d", number1, number2, sum);
    }

    @Override
    public void difference(int number1, int number2) {
        int difference = number1 - number2;
        System.out.printf("\n %d - %d = %d", number1, number2, difference);
    }

    @Override
    public void product(int number1, int number2) {
        double product = number1 * number2;
        System.out.printf("\n %d . %d = %.2f", number1, number2, product);
    }

    @Override
    public void quotient(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Erro: O divisor não pode ser 0");
        }

        double quocient = (double) number1 / number2;
        System.out.printf("\n %d / %d = %.2f", number1, number2, quocient);
    }
}
