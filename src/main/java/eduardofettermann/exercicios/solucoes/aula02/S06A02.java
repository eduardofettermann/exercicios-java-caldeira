package eduardofettermann.exercicios.solucoes.aula02;

import eduardofettermann.exercicios.model.Soluction;

public class S06A02 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 06
                Escreva um programa que receba uma string do usuário e imprima ela ao contrário
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Digite algo que retornarei ao contrário!");
        scanner.nextLine();
        String str = scanner.nextLine();


        String strInversa = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            String charAtual = str.substring(i, i + 1);
            strInversa += charAtual;
        }
        System.out.println(strInversa);
        System.out.println("\n");
        questionIfResolvesAgain();
    }
}




