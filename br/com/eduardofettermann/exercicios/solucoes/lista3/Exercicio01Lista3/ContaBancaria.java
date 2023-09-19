package br.com.eduardofettermann.exercicios.solucoes.lista3.Exercicio01Lista3;

import java.time.LocalDateTime;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int idDaConta;
    private String banco;
    private double saldo;
    private LocalDateTime localDateTime;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdDaConta() {
        return idDaConta;
    }

    public String getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void saca(double valor){
        if(getSaldo() < valor){
            System.out.println("Você não tem saldo suficiente!");
        } else{
            setSaldo(saldo -= valor);
            System.out.printf("Saque realizado \n O seu saldo atual é %f.2f",getSaldo());
        }
    }

    public void deposita(double valor){
            setSaldo(saldo += valor);
            System.out.printf("Saque realizado \n O seu saldo atual é %f.2f",getSaldo());
    }

}
