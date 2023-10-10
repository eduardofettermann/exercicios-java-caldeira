package eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util;


public class OperatesWithMessage {
    public double sum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, sum);
        return sum;
    }

    public double difference(double num1, double num2) {
        double difference = num1 - num2;
        System.out.printf("\n%.2f - %.2f = %.2f", num1, num2, difference);
        return difference;
    }

    public double product(double num1, double num2) {
        double product = num1 * num2;
        System.out.printf("\n%.2f * %.2f = %.2f", num1, num2, product);
        return product;
    }

    public double quotient(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: O divisor não pode ser 0");
        }
        double quocient = num1 / num2;
        System.out.printf("\n%.2f / %.2f = %.2f", num1, num2, quocient);
        return quocient;
    }

    public double potencia(double base, int expoent) {
        double result = Math.pow(base, expoent);
        System.out.printf("\n%.2f^%d = %.2f", base, expoent, result);
        return result;
    }

    public double squaredRootOf(double radicando) {
        double result = Math.sqrt(radicando);
        System.out.printf("\n√%.2f = %.2f", radicando, result);
        return result;
    }
}
