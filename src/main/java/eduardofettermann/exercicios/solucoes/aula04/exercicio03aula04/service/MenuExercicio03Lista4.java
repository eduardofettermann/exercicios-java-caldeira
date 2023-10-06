package eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.service;

import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.ContaCorrente;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.ContaPoupanca;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.SeguroDeVida;
import eduardofettermann.exercicios.model.Soluction;

import java.util.ArrayList;
import java.util.List;

public class MenuExercicio03Lista4 {
    List<String> calculaveis = new ArrayList<String>();
    List<Double> impostos = new ArrayList<Double>();
    List<Double> saldosBrutos = new ArrayList<Double>();
    List<Double> saldosLiquidos = new ArrayList<Double>();

    public void exibeMenuInicial() {
        System.out.println("Este programa calculará qual seu saldo total e seu total de impostos!");
        int resposta = exibeMenuDeContas();
        switch (resposta) {
            case (1) -> exibeMenuContaCorrente();
            case (2) -> exibeMenuContaPoupanca();
            case (3) -> exibeMenuSeguroDeVida();
        }
    }

    public void exibeMenuContinuaSomando(){
        int resposta = exibeMenuDeContas();
        switch (resposta) {
            case (1) -> exibeMenuContaCorrente();
            case (2) -> exibeMenuContaPoupanca();
            case (3) -> exibeMenuSeguroDeVida();
        }
    }

    public int exibeMenuDeContas() {
        System.out.println("""
                Digite a opção que você deseja adicionar ao cálculo:
                                
                1 - Conta Corrente      2 - Conta Poupança
                3 - Seguro de Vida
                """);
        int resposta = Soluction.scanner.nextInt();
        return resposta;
    }

    public void exibeMenuContaCorrente() {
        System.out.println("Digite o saldo de sua conta:");
        double saldo = Soluction.scanner.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(saldo);
        adicionaNasArrays("Conta Corrente",
                contaCorrente.retornaSaldoBruto(),
                contaCorrente.retornaTributos(),
                contaCorrente.retornaSaldoLiquido());
        exibePerguntaFinal();
    }

    public void exibeMenuContaPoupanca() {
        System.out.println("Digite o saldo de sua conta:");
        double saldo = Soluction.scanner.nextDouble();
        ContaPoupanca contaPoupanca = new ContaPoupanca(saldo);
        adicionaNasArrays("Conta Poupança",
                contaPoupanca.retornaSaldoBruto(),
                contaPoupanca.retornaTributos(),
                contaPoupanca.retornaSaldoLiquido());
        exibePerguntaFinal();
    }

    public void exibeMenuSeguroDeVida() {
        System.out.println("Digite o saldo de sua conta:");
        double saldo = Soluction.scanner.nextDouble();
        SeguroDeVida seguroDeVida = new SeguroDeVida(saldo);
        adicionaNasArrays("Seguro de Vida",
                seguroDeVida.retornaSaldoBruto(),
                seguroDeVida.retornaTributos(),
                seguroDeVida.retornaSaldoLiquido());
        exibePerguntaFinal();
    }

    public void exibeTodasContas() {
        for (int j = 0; j < calculaveis.size(); j++) {
            System.out.printf("""
                    %s
                    Saldo Bruto: %.2f
                    Impostos: %.2f
                    Saldo líquido: %.2f
                                  
                    """, calculaveis.get(j),saldosBrutos.get(j), impostos.get(j), saldosLiquidos.get(j));
        }

        double totalImpostos = 0;
        double totalBruto = 0;
        double totalLiquido = 0;
        for (int j = 0; j < impostos.size(); j++) {
            totalImpostos += impostos.get(j);
            totalBruto += saldosBrutos.get(j);
            totalLiquido += saldosLiquidos.get(j);
        }

        System.out.printf("""
                    Saldo bruto total: %.2f
                    Impostos totais: %.2f
                    Saldo Líquido total: %.2f
                    """,totalBruto,totalImpostos,totalLiquido);
    }

    public void adicionaNasArrays(String nome, double saldoBruto, double imposto, double saldoLiquido) {
        calculaveis.add(nome);
        impostos.add(imposto);
        saldosLiquidos.add(saldoLiquido);
        saldosBrutos.add(saldoBruto);
    }

    public void exibePerguntaFinal() {
        System.out.println("""
                Você deseja adicionar mais alguma conta ao cálculo?
                1 - Sim
                    
                0 - Não, imprimir resultado
                """);
        int resposta = Soluction.scanner.nextInt();
        switch (resposta) {
            case (0) -> exibeTodasContas();
            case (1) -> exibeMenuContinuaSomando();
        }
    }
}

