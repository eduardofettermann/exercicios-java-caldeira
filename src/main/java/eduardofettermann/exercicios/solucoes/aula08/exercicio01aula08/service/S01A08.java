package eduardofettermann.exercicios.solucoes.aula08.exercicio01aula08.service;

import eduardofettermann.exercicios.model.Soluction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S01A08 implements Soluction {
    private final List<String> stringsList = new ArrayList<>();
    private Map<String, Long> stringsAndItsOcurrencesMap;
    private Stream<Map.Entry<String, Long>> fiveStringsWithMostOcurrences;
    private String biggestString = "";

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 01 - Maven + Streams
                Crie um projeto Java utilizando o Maven que contenha uma lista de strings. Em seguida, utilize Streams
                para realizar as seguintes operações:
                                
                a) Conte o número total de strings na lista.
                b) Encontre a string mais longa presente na lista.
                c) Conte quantas vezes uma string aparece na lista e exiba a contagem para as 5 strings mais frequentes.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        printMenuQuestion();
    }

    private void printMenuQuestion() {
        System.out.println("""
                                
                Digite o que você deseja realizar:
                                
                1 - Adicionar strings exemplos na lista
                2 - Exibir a lista de strings
                3 - Inserir uma string digitada na lista
                4 - Retornar o número total de strings na lista
                5 - Mostrar a string mais longa presente na lista (e a quantidade de caracteres)
                6 - Imprimir quantas vezes uma string aparece na lista
                7 - Exibir as 5 strings mais frequentes e a contagem das mesmas
                                
                0 - Sair
                """);
        switch (scanner.nextInt()) {
            case (0) -> menu.showEndMenu();
            case (1) -> {
                addSomeStringsAtList();
                printMenuQuestion();
            }
            case (2) -> {
                printAllStrings();
                printMenuQuestion();
            }
            case (3) -> {
                requestAStringAndAddItAtList();
                printMenuQuestion();
            }
            case (4) -> {
                printLengthOfList();
                printMenuQuestion();
            }
            case (5) -> {
                printBiggerString();
                printMenuQuestion();
            }
            case (6) -> {
                printHowManyTimesOcurrencesOfString();
                printMenuQuestion();
            }
            case (7) -> {
                printFiveStringsMostOcurrences();
                printMenuQuestion();
            }
            default -> printMenuQuestion();
        }
    }


    private void printHowManyTimesOcurrencesOfString() {
        scanner.nextLine();
        System.out.println("Digite a string que deseja procurar");
        String string = scanner.nextLine();
        long ocurrencesString = stringsList.stream().filter(s -> s.equalsIgnoreCase(string)).count();
        System.out.printf("\n%s - %d vezes encontrado!", string, ocurrencesString);
    }

    private void addStringAtList(String string) {
        stringsList.add(string);
    }

    private void printBiggerString() {
        reloadBiggestString();
        System.out.printf("Maior string: %s (%d caracteres)", biggestString, biggestString.length());
    }

    private void reloadBiggestString() {
        stringsList.forEach(s -> {
            if (s.length() >= biggestString.length()) {
                biggestString = s;
            }
        });
    }

    private void transformStringsToMaps() {
        stringsAndItsOcurrencesMap = stringsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private void printFiveStringsMostOcurrences() {
        transformStringsToMaps();
        refreshFiveStringsMostOcurrences();
        fiveStringsWithMostOcurrences.forEach(s -> System.out.printf("\n%s - %d vezes encontrado", s.getKey(), s.getValue()));
    }

    private void refreshFiveStringsMostOcurrences() {
        fiveStringsWithMostOcurrences = stringsAndItsOcurrencesMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(5);
    }

    private void requestAStringAndAddItAtList() {
        System.out.println("Digite a string que deseja adicionar a lista:");
        scanner.nextLine();
        String string = scanner.next();
        addStringAtList(string);
    }

    private void printAllStrings() {
        System.out.println(stringsList);
    }

    private int returnLengthOfList() {
        return stringsList.size();
    }

    private void printLengthOfList() {
        System.out.println("O total de strings na lista é " + returnLengthOfList());
    }

    private void addSomeStringsAtList() {
        System.out.println("Adicionando strings na lista de Strings...");
        addStringAtList("Agi");
        addStringAtList("Sicredi");
        addStringAtList("Meta");
        addStringAtList("Ubots");
        addStringAtList("Ilegra");
        addStringAtList("Sunopaim");
        addStringAtList("GX2");
        addStringAtList("Zenvia");
        addStringAtList("Agi");
        addStringAtList("Instituto Caldeira");
        addStringAtList("Instituto Caldeira");
        addStringAtList("Instituto Caldeira");
        System.out.println("Strings adicionadas na lista de Strings!");
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
