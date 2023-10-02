package br.com.eduardofettermann.exercicios.solucoes.lista3.exercicio01lista3;

import br.com.eduardofettermann.exercicios.model.Solucao;

public class Exercicio01Lista3 implements Solucao {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 01 (Conta Bancária)
                Crie uma classe ContaBancaria com os atributos:
                                
                nome (nome do titular da conta)
                cpf (número de CPF do titular)
                identificadorConta (número de identificação da conta)
                banco (nome do banco)
                endereco (endereço do titular)
                saldo (saldo disponível na conta)
                horarioAtual (um atributo para armazenar o horário atual)
                Implemente os seguintes métodos na classe:
                                
                saque(double valor): Realiza um saque da conta, desde que o saldo seja suficiente. Caso contrário, exibe uma mensagem de erro.
                                
                deposito(double valor): Realiza um depósito na conta, atualizando o saldo.
                                
                pix(double valor): Realiza uma transferência PIX, verificando o saldo e o horário atual. Caso contrário, exibe uma mensagem de erro.
                                
                transferencia(ContaBancaria destino, double valor): Realiza uma transferência para outra conta bancária, verificando se o horário atual está dentro do intervalo permitido (8hrs às 19hrs) e se o saldo é suficiente. Caso contrário, exibe uma mensagem de erro.
                                
                verificarSaldo(): Exibe o saldo atual da conta.
                                
                verificarHorario(): Exibe o horário atual.
                                
                verificarInformacoes(): Exibe todas as informações da conta bancária, como nome, CPF, saldo, etc.
                                
                Tarefas adicionais:
                Implemente uma validação no método cpf para garantir que o CPF seja um número válido.
                                
                Adicione um histórico de transações na conta bancária, registrando todas as operações de saque, depósito, PIX e transferência. Crie um método para exibir o histórico de transações.
                                
                Crie um construtor para a classe que permita inicializar os atributos iniciais da conta bancária.
                                
                Implemente um método alterarEndereco(String novoEndereco) para atualizar o endereço do titular da conta.
                                
                Adicione uma taxa de manutenção mensal à conta bancária, que seja deduzida automaticamente do saldo no primeiro dia de cada mês.
                                
                Crie um método calcularJuros(double taxa) que calcule juros sobre o saldo da conta e os adicione mensalmente.
                                
                Implemente um método fecharConta() que encerre a conta, zerando o saldo e não permitindo mais operações.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        ContaBancaria conta = new ContaBancaria("Eduardo","86021193065",123456,"AgiBank",2000);
        ContaBancaria conta2 = new ContaBancaria("Laís","82345657",562123,"Nubank",2000);
        conta.saca(20);
        conta.deposita(300);
        conta.pix(200);
        conta.transferencia(conta2, 200);
        conta.verificarSaldo();
        conta.verificaHorarioAtual();
        conta.verificarInformacoesDaConta();
        resolveNovamente();
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
