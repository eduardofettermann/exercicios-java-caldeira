package eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util;

public class MortgageCalculator {
    private static final OperatesWithoutMessage CALCULATOR = new OperatesWithoutMessage();
    private static final int UMA_ANO_EM_MESES = 12;


    public double calculaPagamentoMensalDaHipoteca(double valorTotal, double porcentagemDaTaxaDeJuros, double prazoEmAnos) {
        double juros = CALCULATOR.returnPartOfNumber(valorTotal, porcentagemDaTaxaDeJuros);
        double valorTotalComJuros = CALCULATOR.sum(valorTotal,juros);
        double prazoEmMeses = CALCULATOR.product(prazoEmAnos, UMA_ANO_EM_MESES);
        double pagamentoMensal = CALCULATOR.quotient(valorTotalComJuros, prazoEmMeses);
        return pagamentoMensal;
    }


}
