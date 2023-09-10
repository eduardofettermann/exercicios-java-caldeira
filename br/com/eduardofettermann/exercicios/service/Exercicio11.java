package br.com.eduardofettermann.exercicios.service;
import java.util.Scanner;

//Exercicio 11
//        Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u)
//        estão presentes. Exiba o número de vogais na tela.

public class Exercicio11 {
    private Scanner scanner = new Scanner(System.in);
    private int contadorDeVogais = 0;

    public void contaVogais(){
        System.out.println("Digite uma String que será exibido quantas vogais tem nela");
        String stringDigitada = scanner.nextLine();
        for (int i = 0; i < stringDigitada.length(); i++) {
            char caractereAtual = stringDigitada.toLowerCase().charAt(i);
            if(caractereAtual == 97 || caractereAtual == 101 || caractereAtual == 105 ||
                    caractereAtual == 111 || caractereAtual == 117){
                contadorDeVogais++;
            }
        }
        System.out.println("A String passada tem " + contadorDeVogais + " vogais!");
    }
}
