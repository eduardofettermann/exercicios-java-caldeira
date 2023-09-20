package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.service;

import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

import static br.com.eduardofettermann.exercicios.model.Exercicio.scanner;

public class MenuExercicio03Lista4 {
    int i = 0;
    List<String> calculaveis = new ArrayList<String>();
    List<Double> impostos = new ArrayList<Double>();
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
        i++;
        System.out.println("Digite o saldo de sua conta:");
        double saldo = scanner.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(saldo);
        calculaveis.add("Conta Corrente " + i);
        impostos.add(contaCorrente.retornaTributos());
        saldosLiquidos.add(contaCorrente.getSaldo());
    }

    public void exibeTodasInformacoes() {
        for (int j = 0; j < calculaveis.size(); j++) {
            System.out.printf("""
                    %s
                    Impostos: %.2f
                    Saldo líquido: %.2f
                    """,calculaveis.get(j), impostos.get(j), saldosLiquidos.get(j));
        }
        double totalImpostos;
        double totalLiquido;
        impostos.forEach(i -> totalImpostos += i);
        saldosLiquidos.forEach(s -> totalLiquido += s);
    }
}

