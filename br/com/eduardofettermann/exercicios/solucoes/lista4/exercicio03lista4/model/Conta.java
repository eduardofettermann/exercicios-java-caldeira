package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model;

import java.time.LocalTime;

public class Conta {
    private double saldo = 200;

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

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}