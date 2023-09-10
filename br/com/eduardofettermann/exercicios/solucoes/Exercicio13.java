package br.com.eduardofettermann.exercicios.solucoes;
import br.com.eduardofettermann.exercicios.model.Exercicio;

//Exercicio 13
//        Escreva um programa que calcule o fatorial de um número inteiro não negativo
//        fornecido pelo usuário. O fatorial de um número N é o produto de todos os inteiros
//        de 1 até N.

public class Exercicio13 implements Exercicio {

    @Override
    public void resolve() {
        System.out.println("""
                - Exercicio 13
                Escreva um programa que calcule o fatorial de um número inteiro não negativo
                fornecido pelo usuário. O fatorial de um número N é o produto de todos os inteiros
                de 1 até N.
                Solução:
                                """);

        System.out.println("Digite um número não negativo que mostrarei o seu fatorial!");
        int numero = scanner.nextInt();
        int fatorial = numero;
        for (int i = 1; i < numero; i++) {
            fatorial *= (numero - i);
        }
        System.out.println("O fatorial de " + numero + " é igual a " + fatorial);

        menu.exibeMenuFinal();
    }
}
