package eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.model;

public class Moto extends Veiculo{
    @Override
    public void calcularCustoviagem(int distancia) {
        double custo = distancia * 0.15;
        System.out.printf("O custo da viagem será de R$%.2f\n",custo);
    }
}
