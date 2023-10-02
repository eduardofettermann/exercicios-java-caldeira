package br.com.eduardofettermann.exercicios.solucoes.lista1;

import br.com.eduardofettermann.exercicios.model.Solucao;

//Exercicio 07
//        Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele
//        e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.

public class Exercicio07Lista1 implements Solucao {

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 07 
                Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele
                e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.
                Solução:
                            """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Qual seu salário?");
        double salario = (int) scanner.nextDouble();
        if (idade >= 18 & salario > 2000) {
            System.out.println("Você pode comprar um automovel");
        } else {
            System.out.println("Você não pode comprar um automovel");
        }
        resolveNovamente();
    }
}
