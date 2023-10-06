package eduardofettermann.exercicios.solucoes.aula02;

import eduardofettermann.exercicios.model.Soluction;

public class S07A02 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 07
                Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar. Leônidas pede para
                que seus soldados tentem adivinhar quantos inimigos irão combater. O usuário deve digitar seu palpite e se o número
                for menor do que 300.000, Leônidas deve dizer Um pouco mais!, caso o número dito pelo usuário seja menor, ele dirá
                Um pouco menos!".
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        double doubleAleatorio = Math.random() * 300;
        int numeroSorteado = (int) doubleAleatorio;
        System.out.println("Guerreiro, digite quantos inimigos você acha que iramos combater, e eu direi se está perto ou não");
        for (int i = 1; i <= 11; i++) {
            int chute = scanner.nextInt();
            if (chute < numeroSorteado && i <= 10) {
                System.out.printf("Um pouco mais! %d/10 tentativas \n ", i);
            } else if (chute > numeroSorteado) {
                System.out.printf("Um pouco menos! %d/10 tentativas \n ", i);
            } else if (numeroSorteado == 1 && chute == 1) {
                System.out.printf("Parabéns guerreiro! você acertou, iremos batalhar com apenas %d guerreiro! \n \n", numeroSorteado);
                questionIfResolvesAgain();
            } else if (chute == numeroSorteado) {
                System.out.printf("Parabéns guerreiro! você acertou, iremos batalhar com %d guerreiros! \n \n", numeroSorteado);
                questionIfResolvesAgain();
            }
        }
        if (numeroSorteado == 1) {
            System.out.printf("Tentativas esgotadas guerreiro! Combateremos com apenas %d guerreiro \n \n", numeroSorteado);
            questionIfResolvesAgain();
        } else {
            System.out.printf("Tentativas esgotadas guerreiro! Combateremos com %d guerreiros \n \n", numeroSorteado);
            questionIfResolvesAgain();
        }
    }
}
