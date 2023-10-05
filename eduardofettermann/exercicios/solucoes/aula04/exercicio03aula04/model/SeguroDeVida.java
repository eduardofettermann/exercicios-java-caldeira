package eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model;

public class SeguroDeVida implements Tributavel {
    private double saldo;

    @Override
    public double retornaTributos() {
        return 42;
    }

    public double retornaSaldoLiquido() {
        return (this.saldo - retornaTributos());
    }

    @Override
    public double retornaSaldoBruto() {
        return this.getSaldo();
    }

    public SeguroDeVida(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
