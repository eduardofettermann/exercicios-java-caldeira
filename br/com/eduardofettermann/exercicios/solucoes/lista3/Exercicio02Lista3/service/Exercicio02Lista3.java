package br.com.eduardofettermann.exercicios.solucoes.lista3.Exercicio02Lista3.service;

import br.com.eduardofettermann.exercicios.model.Exercicio;
import br.com.eduardofettermann.exercicios.solucoes.lista3.Exercicio02Lista3.menu.MenuCirculo;

public class Exercicio02Lista3 implements Exercicio {

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 02 - Círculo
                Crie uma classe chamada Circulo com os seguintes atributos:
                                
                raio (representando o raio do círculo)
                Implemente os seguintes métodos na classe:
                                
                calcularArea(): Este método deve calcular a área do círculo com base no raio e retornar o resultado.
                                
                calcularCircunferencia(): Este método deve calcular a circunferência do círculo com base no raio e retornar o resultado.
                                
                Crie objetos da classe Circulo e utilize os métodos para calcular e exibir os resultados.
                                
                Tarefas adicionais:
                Implemente um método definirRaio(double novoRaio) que permita alterar o raio do círculo.
                                
                Adicione validações nos métodos para garantir que o raio seja sempre um valor positivo.
                                
                Crie um construtor para a classe que permita inicializar o raio ao criar um objeto.
                                
                Implemente um método toString() que retorne uma representação em texto do círculo, incluindo o raio, a área e a circunferência.
                                
                Adicione um método para verificar se dois círculos são iguais, ou seja, se têm o mesmo raio.
                                
                Crie um método para calcular o diâmetro do círculo.
                                
                Implemente um método para calcular a área sombreada entre dois círculos concêntricos de diferentes raios.
                                
                Adicione a capacidade de criar um círculo a partir de um ponto no plano cartesiano (coordenadas x, y) e um raio.
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        MenuCirculo menuCirculo = new MenuCirculo();
        menuCirculo.exibeMenuNovoCirculo();
        resolveNovamente();
    }


    @Override
    public void resolveNovamente() {
        Exercicio.super.resolveNovamente();
    }
}
