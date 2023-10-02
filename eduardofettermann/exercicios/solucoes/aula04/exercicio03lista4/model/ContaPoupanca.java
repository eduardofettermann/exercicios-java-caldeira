package eduardofettermann.exercicios.solucoes.aula04.exercicio03lista4.model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public double retornaTributos() {
        return 0;
    }

    public double retornaSaldoLiquido() {
        return (getSaldo() - retornaTributos());
    }

    public double retornaSaldoBruto() {
        return super.getSaldo();
    }
}
