package eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util;

public class OperatesWithoutMessage {
    public double sum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double difference(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }

    public double product(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public double quotient(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: O divisor não pode ser 0");
        }
        double quocient = num1 / num2;
        return quocient;
    }

    public double potencia(double base, int expoent) {
        double result = Math.pow(base, expoent);
        return result;
    }

    public double squaredRootOf(double radicando) {
        double result = Math.sqrt(radicando);
        return result;
    }

    public double returnPartOfNumber(double number, double percent) {
        double partOfNumber = (number * percent) / 100;
        return partOfNumber;
    }

}
