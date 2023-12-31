package eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public double retornaTributos() {
        return (this.getSaldo() / 100);
    }

    @Override
    public double retornaSaldoLiquido() {
        return (this.getSaldo() - this.retornaTributos());
    }

    @Override
    public double retornaSaldoBruto() {
        return this.getSaldo();
    }
}
