package eduardofettermann.exercicios.solucoes.aula05.exercicio06aula05.service;

import eduardofettermann.exercicios.model.Solucao;
import eduardofettermann.exercicios.solucoes.aula05.exercicio06aula05.model.Reserva;

import java.util.LinkedList;

public class S06A05 implements Solucao {
    LinkedList<Reserva> reservas = new LinkedList<>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 06 - Uso de List e LinkedList
                Descrição: Crie um programa Java que represente um sistema de reservas de passagens de avião.
                O programa deve permitir que os usuários reservem passagens, cancelem reservas e exibam a lista de
                reservas. Use uma LinkedList para representar as reservas de passagens. Reserva deve ser uma classe do
                seu código com os atributos: nome, local, cpf de quem reservou, data de entrada e data de saída,
                e métodos que você julgue necessários.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        exibeMenu();
    }

    public void exibeMenu() {
        System.out.println("""
                                
                Digite o que você deseja realizar
                1 - Exibir lista de reservas
                2 - Reservar passagem
                3 - Cancelar reserva
                                
                0 - Sair
                                
                """);
        switch (retornaInteiroDigitado()) {
            case (1) -> executaAcao(1);
            case (2) -> executaAcao(2);
            case (3) -> executaAcao(3);
        }
    }

    public int retornaInteiroDigitado() {
        return scanner.nextInt();
    }

    public void executaAcao(int inteiroDigitado) {
        switch (inteiroDigitado) {
            case (1) -> exibeReservasMenu();
            case (2) -> adicionaReserva();
            case (3) -> cancelaReserva();
            case (0) -> menu.showEndMenu();
        }
    }

    public void exibeReservasMenu() {
        exibeReservas();
        exibeMenu();
    }

    public void adicionaReserva() {
        scanner.nextLine();
        System.out.println("Digite o nome do passageiro:");
        String nome = scanner.nextLine();
        System.out.println("Digite o cpf:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o local:");
        String local = scanner.nextLine();
        System.out.println("Digite a data de entrada:");
        String dataDeEntrada = scanner.nextLine();
        System.out.println("Digite a data de saída:");
        String dataDesaida = scanner.nextLine();
        Reserva reserva = new Reserva(nome, cpf, local, dataDeEntrada, dataDesaida);
        reservas.addLast(reserva);
        System.out.printf("""
                                
                Passagem reservada:
                Nome: %s
                CPF: %s
                Local: %s
                Data de entrada: %s
                Data de saída: %s
                                
                """, reserva.nome(), reserva.cpf(), reserva.local(), reserva.dataDeEntrada(), reserva.dataDeSaida());
        exibeMenu();
    }

    public void cancelaReserva() {
        exibeReservas();
        System.out.println("Digite o número da reserva que você deseja cancelar:");
        int digitado = retornaInteiroDigitado();
        reservas.remove((digitado - 1));
        System.out.println("Reserva cancelada!");
        exibeMenu();
    }

    public void exibeReservas() {
        System.out.println("Reservas:");
        reservas.forEach(r -> System.out.println((reservas.indexOf(r) + 1) + " - " + r.nome() + " - " + r.local() + " (" + r.dataDeEntrada() + " - " + r.dataDeSaida() + ")"));
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
