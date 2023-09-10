package br.com.eduardofettermann.exercicios.solucoes;
import br.com.eduardofettermann.exercicios.model.Exercicio;

//Exercicio 09
//        Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
//        em seguida, calcule e exiba a idade.

public class Exercicio09 implements Exercicio {
    private int anoAtual = 2023;

    @Override
    public void resolve() {
        System.out.println("""
                - Exercicio 09 
                Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
                em seguida, calcule e exiba a idade.
                Solução:
                """);
        System.out.println("Digite seu ano de nascimento:");
        int anoDigitado = scanner.nextInt();
        int idade = anoAtual - anoDigitado;
        System.out.println("Sua idade é " + idade + " anos!");

        menu.exibeMenuFinal();
    }
}
