package eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.model;

public class Carro extends Veiculo {
    @Override
    public void calcularCustoviagem(int distancia) {
        double custo = distancia * 0.20;
        System.out.printf("O custo da viagem será de R$%.2f\n",custo);
    }
}
