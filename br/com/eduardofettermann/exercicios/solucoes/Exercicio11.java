package br.com.eduardofettermann.exercicios.solucoes;

import br.com.eduardofettermann.exercicios.model.Exercicio;

//Exercicio 11
//        Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u)
//        estão presentes. Exiba o número de vogais na tela.

public class Exercicio11 implements Exercicio {
    private int contadorDeVogais = 0;

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 11 
                Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u)
                estão presentes. Exiba o número de vogais na tela.
                Solução:
                                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite uma String que será exibido quantas vogais tem nela");
        String stringDigitada = scanner.nextLine();
        for (int i = 0; i < stringDigitada.length(); i++) {
            char caractereAtual = stringDigitada.toLowerCase().charAt(i);
            if (caractereAtual == 97 || caractereAtual == 101 || caractereAtual == 105 ||
                    caractereAtual == 111 || caractereAtual == 117) {
                contadorDeVogais++;
            }
        }
        System.out.println("A String passada tem " + contadorDeVogais + " vogais!");

        menu.exibeMenuFinal();
    }
}
