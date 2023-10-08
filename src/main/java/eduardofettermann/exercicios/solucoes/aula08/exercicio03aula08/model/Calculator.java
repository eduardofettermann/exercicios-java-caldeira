package eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model;

public class Calculator {

    public double sum(double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }

    public double difference(double number1, double number2) {
        double difference = number1 - number2;
        return difference;
    }

    public double product(int number1, int number2) {
        double product = number1 * number2;
        return product;
    }

    public double quotient(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Erro: O divisor não pode ser 0");
        }

        double quocient = (double) number1 / number2;
        return quocient;
    }

    public void potencia(int base, int expoent) {
        double potencia = Math.pow(base, expoent);
        System.out.printf("\n %d * %d = %.2f", base, base, potencia);
    }

    public void squaredRootOf(int radicando) {
        double raizQuadrada = Math.sqrt(radicando);
        System.out.printf("\n raiz quadrada de %d = %.2f", radicando, raizQuadrada);
    }
}
