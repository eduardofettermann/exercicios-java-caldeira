package eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.service;

import eduardofettermann.exercicios.model.Soluction;

public class S04A08 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 04 - Calculadora de Hipoteca
                Neste exercício, você deve expandir a aplicação da calculadora desenvolvida anteriormente para incluir
                uma funcionalidade adicional, que é uma calculadora de hipoteca.
                A calculadora de hipoteca permite que os usuários calculem os pagamentos mensais de uma hipoteca com base nos seguintes parâmetros:
                                                
                Valor do Empréstimo (principal): o valor total do empréstimo hipotecário.
                Taxa de Juros Anual: a taxa de juros anual aplicada ao empréstimo, em porcentagem.
                Prazo em anos: o número de anos para pagar o empréstimo.
                                
                Obviamente tem que implementar o teste unitário...
                
                Solução:
                """);
    }

    @Override
    public void resolves() {

    }
    // TODO: Classe Calculadora Hipoteca com Metodo(Valor,Taxa de juros anual, Prazo de anos)




    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
