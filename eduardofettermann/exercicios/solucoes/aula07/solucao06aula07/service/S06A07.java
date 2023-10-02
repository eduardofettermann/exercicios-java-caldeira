package eduardofettermann.exercicios.solucoes.aula07.solucao06aula07.service;

import eduardofettermann.exercicios.model.Solucao;
import eduardofettermann.exercicios.solucoes.aula07.solucao06aula07.model.BankAccount;
import eduardofettermann.exercicios.solucoes.aula07.solucao06aula07.model.InsufficientBalanceException;

public class S06A07 implements Solucao {
    BankAccount account = new BankAccount(50);

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 06 - Tratamento de Erros com Exceções Personalizadas (Exception)
                Crie uma exceção personalizada chamada SaldoInsuficienteException que herde de Exception.
                Crie uma classe ContaBancaria que represente uma conta com um saldo inicial. Escreva um método sacar(double valor)
                na classe ContaBancaria que lance a exceção SaldoInsuficienteException se o saldo for insuficiente para a retirada.
                Em um programa principal, trate essa exceção e forneça uma mensagem de erro adequada.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        showMenu();
    }

    private void showMenu() {
        System.out.println("""
                                
                Digite que você deseja realizar:
                1 - Sacar
                2 - Ver saldo
                        
                0 - Sair
                """);
        switch (scanner.nextInt()) {
            case (1) -> doAWithdraw();
            case (2) -> showBalance();
            case (0) -> menu.showEndMenu();
        }

    }

    private void doAWithdraw() {
        try {
            System.out.println("Digite o valor que deseja sacar:");
            double value = scanner.nextDouble();
            account.withdraw(value);
            showMenu();
        } catch (InsufficientBalanceException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
            doAWithdraw();
        }
    }

    private void showBalance() {
        System.out.printf("O seu saldo atual é R$%.2f\n", account.getBalance());
        showMenu();
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
