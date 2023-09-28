package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio01lista4.service;

import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio01lista4.model.Carro;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio01lista4.model.Moto;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio01lista4.model.Veiculo;

import static br.com.eduardofettermann.exercicios.model.Solucao.menu;
import static br.com.eduardofettermann.exercicios.model.Solucao.scanner;

public class MenuExercicio01Lista4 {
    public void exibeMenuIncial() {
        System.out.println("""
                Qual seu veículo?
                1 - Carro   2 - Moto
                                
                0 - Voltar
                """);
        int resposta = scanner.nextInt();
        switch (resposta){
            case (1) -> exibeMenuCarro();
            case (2) -> exibeMenuMoto();
            case (0) -> menu.exibeMenuLista4();
        }

    }

    public void perguntaDistanciaViagem() {
        System.out.println("\nDigite distância da viagem (Apenas inteiros!) :\n");
    }

    public void exibeMenuCarro() {
        Veiculo carro = new Carro();
        perguntaDistanciaViagem();
        int distanciaDaViagem = scanner.nextInt();
        carro.calcularCustoviagem(distanciaDaViagem);
    }

    public void exibeMenuMoto() {
        Veiculo moto = new Moto();
        perguntaDistanciaViagem();
        int distanciaDaViagem = scanner.nextInt();
        moto.calcularCustoviagem(distanciaDaViagem);
    }
}
