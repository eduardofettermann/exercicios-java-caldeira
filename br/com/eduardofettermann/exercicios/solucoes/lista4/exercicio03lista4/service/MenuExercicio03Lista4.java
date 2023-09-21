package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.service;

import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.ContaCorrente;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.ContaPoupanca;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.SeguroDeVida;

import java.util.ArrayList;
import java.util.List;

import static br.com.eduardofettermann.exercicios.model.Exercicio.scanner;

public class MenuExercicio03Lista4 {
    List<String> calculaveis = new ArrayList<String>();
    List<Double> impostos = new ArrayList<Double>();
    List<Double> saldosBrutos = new ArrayList<Double>();
    List<Double> saldosLiquidos = new ArrayList<Double>();

    public void exibeMenuInicial() {
        System.out.println("Este programa calculará qual seu saldo total e seu total de impostos!");
        exibeMenuDeContas();
    }

    public void exibeMenuDeContas() {
        System.out.println("""
                Digite a opção que você deseja adicionar ao cálculo:
                                
                1 - Conta Corrente      2 - Conta Poupança
                3 - Seguro de Vida
                """);
    }

    public void MenuContaCorrente() {
        System.out.println("Digite o saldo de sua conta:");
        double saldo = scanner.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(saldo);
        adicionaNasArrays("Conta Corrente",contaCorrente.retornaTributos(),contaCorrente.getSaldo());
    }

    public void MenuContaPoupanca() {
        System.out.println("Digite o saldo de sua conta:");
        double saldo = scanner.nextDouble();
        ContaPoupanca contaPoupanca = new ContaPoupanca(saldo);
        adicionaNasArrays("Conta Poupança",contaPoupanca.retornaTributos(),contaPoupanca.getSaldo());
    }
    public void MenuSeguroDeVida() {
        System.out.println("Digite o saldo de sua conta:");
        double saldo = scanner.nextDouble();
        SeguroDeVida seguroDeVida = new SeguroDeVida(saldo);
        adicionaNasArrays("Seguro de Vida",seguroDeVida.retornaTributos(),seguroDeVida.getSaldo());
    }

    public void exibeTodasContas() {
        for (int j = 0; j < calculaveis.size(); j++) {
            System.out.printf("""
                    %s
                    Impostos: %.2f
                    Saldo líquido: %.2f
                    
                    """,calculaveis.get(j), impostos.get(j), saldosBrutos.get(j));
        }
        double totalImpostos = 0;
        double totalBruto = 0;
        double totalLiquido = 0;
        for (int j = 0; j < impostos.size(); j++) {
            totalImpostos+= impostos.get(j);
            totalBruto+= saldosBrutos.get(j);
            totalLiquido+= saldosBrutos.get(j) - impostos.get(j);
        }
    }

    public void adicionaNasArrays(String nome, double imposto, double saldoLiquido){
        calculaveis.add(nome);
        impostos.add(imposto);
        saldosBrutos.add(saldoLiquido);
    }
}

