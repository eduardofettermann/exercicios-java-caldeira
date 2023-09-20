package br.com.eduardofettermann.exercicios.solucoes.lista3.Exercicio01Lista3;

import java.time.LocalTime;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int idDaConta;
    private String banco;
    private double saldo = 200;
    private LocalTime horarioAtual = LocalTime.now().withNano(0);
    private LocalTime inicioTransferencias = LocalTime.of(8,0,0);
    private LocalTime finalTransferencias = LocalTime.of(19,0,0);

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

    public LocalTime getHorarioAtual() {
        return horarioAtual;
    }

    public void saca(double valor){
        if(getSaldo() < valor){
            System.out.println("\nVocê não tem saldo suficiente!\n");
        } else{
            setSaldo(saldo -= valor);
            System.out.printf("\nSaque realizado \nO seu saldo atual é %.2f\n",getSaldo());
        }
    }

    public void deposita(double valor){
            setSaldo(saldo += valor);
            System.out.printf("\nDepósito realizado \nO seu saldo atual é %.2f\n",getSaldo());
    }

    public void pix(double valor){
        if(getSaldo() < valor){
            System.out.println("\nVocê não tem saldo suficiente!\n");
        } else{
            setSaldo(saldo -= valor);
            System.out.printf("\nPix realizado \nO seu saldo atual é %.2f\n",getSaldo());
        }
    }

    public void transferencia(ContaBancaria destino, double valor){ // 8 as 19

        if(valor <= getSaldo() && getHorarioAtual().isAfter(inicioTransferencias) && getHorarioAtual().isBefore(finalTransferencias)){
            System.out.printf("\nTransferência realizada\nO seu saldo atual é %.2f\n",getSaldo());
        } else if(valor > getSaldo()){
            System.out.println("\nVocê não tem saldo suficiente!\n");
        } else if (getHorarioAtual().isAfter(finalTransferencias) || getHorarioAtual().isBefore(inicioTransferencias)) {
            System.out.println("\nVocê só pode realizar transferências das 08:00 as 19:00\n");
        }
    }

    public void verificarSaldo(){
        System.out.printf("\nO seu saldo atual é %.2f\n",getSaldo());
    }

    public void verificarInformacoesDaConta(){
        System.out.println("ContaBancaria{" + "\n" +
                "nome = " + getNome() + "\n" +
                ",cpf = " + getCpf() + "\n" +
                ",idDaConta = " + getIdDaConta() + "\n" +
                ",banco = " + getBanco() + "\n" +
                ",saldo = " + getSaldo() + "\n" +
                '}');
    }

    public void verificaHorarioAtual(){
        System.out.println("\nO horário atual é " + getHorarioAtual() + "\n");
    }

    public ContaBancaria(String nome, String cpf, int idDaConta, String banco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idDaConta = idDaConta;
        this.banco = banco;
        this.saldo = saldo;
    }
}
