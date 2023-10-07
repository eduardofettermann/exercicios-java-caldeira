package eduardofettermann.exercicios.solucoes.aula02;

import eduardofettermann.exercicios.model.Soluction;

public class S05A02 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 05
                Escreva um programa que separa a string em duas metades e imprime a primeira parte.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
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
        questionIfResolvesAgain();
    }
}
