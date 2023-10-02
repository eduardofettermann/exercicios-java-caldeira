package br.com.eduardofettermann.exercicios.solucoes.lista2;

import br.com.eduardofettermann.exercicios.model.Solucao;

public class Exercicio05Lista2 implements Solucao {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 05
                Escreva um programa que separa a string em duas metades e imprime a primeira parte.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite algo:");
        scanner.nextLine();
        String str = scanner.nextLine();
        int contadorCaracteresString = str.length();
        double metadeCaracteres = ((double) contadorCaracteresString / 2);
        int metadeStringArredondadoPraMais = (int) Math.ceil(metadeCaracteres);
        int metadeStringArredondadoPraMenos = (int) Math.floor(metadeCaracteres);

        String respostaMaior = str.substring(0, metadeStringArredondadoPraMais);
        String respostaMenor = str.substring(0, metadeStringArredondadoPraMenos);

        System.out.println("""
                Qual parte da string você quer que tenha mais caracteres?
                1 - A primeira (Que será exibida)
                0 - A segunda
                                
                """);
        int resposta = scanner.nextInt();
        switch (resposta) {
            case (1) -> System.out.println(respostaMaior);
            case (0) -> System.out.println(respostaMenor);
        }
        resolveNovamente();
    }
}
