package br.com.eduardofettermann.exercicios.solucoes.aula07.solucao06aula07.model;

public class BankAccount {
    private double balance;

    public void withdraw(double value) throws InsufficientBalanceException {
        if (isInvalidTransfer(getBalance(), value)) {
            throw new InsufficientBalanceException("Valor de saque maior que saldo na conta!");
        }
        balance -= value;
        System.out.printf("\nSaque realizado! Seu saldo agora é de R$%.2f", getBalance());
    }

    private boolean isInvalidTransfer(double balance, double value) {
        return value > balance;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
}
