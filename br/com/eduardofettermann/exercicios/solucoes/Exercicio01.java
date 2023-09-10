package br.com.eduardofettermann.exercicios.solucoes;
import br.com.eduardofettermann.exercicios.model.Exercicio;

//Exercicio 01
//        Crie um programa que leia seu nome e imprima na tela.

public class Exercicio01 implements Exercicio {
    @Override
    public void resolve() {
        System.out.println("""
                - Exercicio 01 
                Crie um programa que leia seu nome e imprima na tela.
                Solução:
                """);
        System.out.println("Digite seu nome;");
        String nomeDigitado = scanner.nextLine();
        System.out.println(nomeDigitado);

        menu.exibeMenuFinal();
    }
}
