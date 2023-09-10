package br.com.eduardofettermann.exercicios.solucoes;
import br.com.eduardofettermann.exercicios.model.Exercicio;

//Exercicio 08
//        Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções,
//        perguntando se a pessoa é Gestante, Idosa, Deficiente ou Nenhuma das alternativas. Se ela for Deficiente,
//        Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."

public class Exercicio08 implements Exercicio {

    @Override
    public void resolve() {
        System.out.println("""
                - Exercicio 08 
                Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções,
                perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD,
                Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito.
                Solução:
                                """);
        System.out.println("""
                Digite a opção melhor correspondende a você:
                1 - Gestante
                2 - Idosa
                3 - PCD
                4 - Nenhuma das alternativas
                """);
        int opcaoDigitada = scanner.nextInt();
        if (opcaoDigitada == 4) {
            System.out.println("Você não tem direito a fila prioritária!");
        } else {
            System.out.println("Você tem direito a fila prioritária!");
        }
        menu.exibeMenuFinal();
    }
}
