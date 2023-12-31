package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Soluction;

//    Exercicio 06
//    Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//    I - Se for menor de 16 anos, avisar que não pode votar;
//    II - Se tiver 16 ou 17, avisar que o voto é facultativo;
//    III - Se tiver mais de 65, avisar que também é facultativo o voto;
//    IV - De 18 até 65, é obrigatório votar.

public class S06A01 implements Soluction {

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 06
                Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
                I - Se for menor de 16 anos, avisar que não pode votar;
                II - Se tiver 16 ou 17, avisar que o voto é facultativo;
                III - Se tiver mais de 65, avisar que também é facultativo o voto;
                IV - De 18 até 65, é obrigatório votar.
                Solução:
                            """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Digite sua idade:");
        int idadeDigitada = scanner.nextInt();
        if (idadeDigitada < 16) {
            System.out.println("Você não pode votar!");
        } else if (idadeDigitada == 16 || idadeDigitada == 17 || idadeDigitada > 65) {
            System.out.println("Seu voto é facultativo!");
        } else if (idadeDigitada >= 18 & idadeDigitada <= 65) {
            System.out.println("Seu voto é obrigatório!");
        }
        questionIfResolvesAgain();
    }
}
