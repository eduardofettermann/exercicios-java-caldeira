package eduardofettermann.exercicios.solucoes.aula04.exercicio03lista4.model;

public class Conta {
    private double saldo;
    public void saca(double valor) {
        if (getSaldo() < valor) {
            System.out.println("\nVocê não tem saldo suficiente!\n");
        } else {
            setSaldo(saldo -= valor);
            System.out.printf("\nSaque realizado \nO seu saldo atual é %.2f\n", getSaldo());
        }
    }

    public void deposita(double valor) {
        setSaldo(saldo += valor);
        System.out.printf("\nDepósito realizado \nO seu saldo atual é %.2f\n", getSaldo());
    }

    public void obterSaldo() {
        System.out.printf("\nO seu saldo atual é %.2f\n", getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Conta(double saldo) {
        this.saldo = saldo;
    }
}