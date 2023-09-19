package br.com.eduardofettermann.exercicios.solucoes.lista4;

import br.com.eduardofettermann.exercicios.model.Exercicio;

public class Exercicio01Lista4 implements Exercicio {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 01 - Veículo
                
                1.1 Crie uma classe abstrata chamada Veiculo com os seguintes atributos e métodos:
                                
                Atributos:
                                
                marca (String)
                modelo (String)
                ano (int)
                Métodos abstratos:
                                
                calcularCustoViagem(int distancia): Este método deve ser abstrato e calcular o custo de uma viagem com bas e na distância fornecida.
                1.2 Crie duas classes concretas que herdem de Veiculo: Carro e Moto. Implemente o método calcularCustoViagem(int distancia) em cada uma dessas classes:
                                
                Carro deve ter um custo fixo de R$0.20 por quilômetro.
                Moto deve ter um custo fixo de R$0.15 por quilômetro.
                Solução:
                """);
    }

    @Override
    public void resolve() {

    }

    @Override
    public void resolveNovamente() {
        Exercicio.super.resolveNovamente();
    }
}
