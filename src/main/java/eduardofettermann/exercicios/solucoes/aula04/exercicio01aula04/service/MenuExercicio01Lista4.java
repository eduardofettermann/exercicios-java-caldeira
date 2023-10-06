package eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.service;

import eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.model.Carro;
import eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.model.Moto;
import eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.model.Veiculo;

import static eduardofettermann.exercicios.model.Solucao.menu;
import static eduardofettermann.exercicios.model.Solucao.scanner;

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
            case (0) -> menu.showLesson04();
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
