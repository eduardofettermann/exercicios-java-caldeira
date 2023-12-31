package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Soluction;

//Exercicio 05
//        Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
//        depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
//        e a quantidade de segundos que faltam para a meia-noite.

public class S05A01 implements Soluction {
    private final int MEIA_NOITE_EM_SEGUNDOS = 86400;

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 05 
                Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
                depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
                e a quantidade de segundos que faltam para a meia-noite.
                Solução:
                        """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Informe as horas,depois minutos e depois segundos!");
        System.out.println("Digite a hora:");
        int hora = scanner.nextInt();
        System.out.println("Digite o minuto:");
        int minuto = scanner.nextInt();
        System.out.println("Digite o segundo:");
        int segundo = scanner.nextInt();
        int horasEmSegundos = hora * 3600;
        int minutosEmSegundos = minuto * 60;
        int horaAtualEmSegundos = horasEmSegundos + minutosEmSegundos + segundo;
        int segundosParaMeiaNoite = MEIA_NOITE_EM_SEGUNDOS - horaAtualEmSegundos;
        System.out.println("Se passaram " + horaAtualEmSegundos + " segundos desde 00:00 e faltam " + segundosParaMeiaNoite + " segundos para meia-noite.");
        questionIfResolvesAgain();
    }
}