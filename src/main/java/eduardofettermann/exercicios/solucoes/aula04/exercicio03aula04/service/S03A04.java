package eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.service;

import eduardofettermann.exercicios.model.Solucao;

public class S03A04 implements Solucao {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 03   - Sistema de Tributação para Contas e Bens Financeiros (desafio: Interface + Herança + Polimorfismo)
                                
                Nosso banco está empenhado em aplicar tributações aos bens financeiros de nossos clientes, e para alcançar esse objetivo, estamos criando um sistema que gerenciará essa tarefa. Aqui estão as etapas do exercício:
                             
                3.1 Criação da Interface Tributavel: Primeiramente, crie uma interface chamada Tributavel que contenha o método calculaTributos(), responsável por calcular e retornar um valor em formato double.
                             
                3.2 Tributação de Diferentes Bens Financeiros: Alguns bens são tributáveis, enquanto outros não o são. Para exemplificar:
                             
                Conta Poupança não é tributável, portanto, seu método calculaTributos() retornará 0.
                Conta Corrente é tributável, com uma taxa de 1% sobre o saldo da conta. Seguro de Vida tem uma tributação fixa de 42 reais.
                3.3 Hierarquia de Classes de Contas Financeiras: As classes ContaCorrente e ContaPoupanca herdarão de uma classe-base chamada Conta. A classe Conta conterá um saldo e os métodos sacar(double), depositar(double) e obterSaldo(), que retornarão o saldo da conta.
                             
                3.4 Teste do Sistema de Tributação: Crie uma classe chamada TestaTributavel com um método main para testar o exemplo. Neste método, você pode instanciar diferentes objetos que implementam a interface Tributavel (como contas correntes e seguros de vida) e calcular seus tributos.
                             
                3.5 Gerenciador de Imposto de Renda: Além disso, desenvolva uma classe GerenciadorDeImpostoDeRenda que receberá todos os objetos tributáveis de uma pessoa e somará seus valores tributários. Essa classe conterá um atributo para calcular a soma total dos tributos e um método adicionar(Tributavel) que aceita objetos tributáveis como parâmetro e adiciona seus tributos ao total.
                             
                Lembre-se de que somente objetos que implementam a interface Tributavel podem ser passados para o método adicionar, excluindo qualquer tipo de conta que não seja tributável.
                             
                Tip: Você pode reaproveitar o código da aula passada nesse exercício;
                                
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        MenuExercicio03Lista4 menu = new MenuExercicio03Lista4();
        menu.exibeMenuInicial();
        resolveNovamente();
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
