package eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.service;

import eduardofettermann.exercicios.model.Solucao;
import eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.model.Contact;
import eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.model.ZoneCompare;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class S03A06 implements Solucao {
    Map<Contact, String> contactsTreeMap = new TreeMap<>();

    ZoneCompare zoneCompare = new ZoneCompare();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 03 - TreeMap com agenda
                Crie um programa Java que utilize uma estrutura de dados do tipo TreeMap para criar uma agenda telefônica.
                Agenda deve conter: número de telefone, nome, endereço e local da cidade (norte, sul, centro, leste e oeste).
                Associe nomes a números de telefone e, em seguida, imprima a lista de contatos em ordem alfabética e imprima
                os contatos com base na localidade.
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
                \n
                Digite a ação que você deseja realizar
                1 - Adicionar um contato
                2 - Exibir a agenda de contatos
                3 - Exibir a agenda de contatos com base na zona
                4 - Adicionar contatos exemplos na lista
                                
                0 - Sair
                """);
        int digitado = scanner.nextInt();
        switch (digitado) {
            case (1) -> addContactToContactsList();
            case (2) -> showContactsList();
            case (3) -> showContactsPerZone();
            case (4) -> addSomeContactsToContactsList();
            case (0) -> menu.showEndMenu();
            default -> showMenu();
        }
    }

    private void addContactToContactsList() {
        scanner.nextLine();
        System.out.println("Digite o nome do contato:");
        String name = scanner.nextLine();
        System.out.println("Digite o numero do contato:");
        String number = scanner.nextLine();
        System.out.println("Digite o a região do contato (Sul/Norte/Centro/Leste/Oeste:");
        String zone = scanner.nextLine();
        contactsTreeMap.put(new Contact(name, number, zone), name);
        showContactsList();
    }

    private void addSomeContactsToContactsList() {
        contactsTreeMap.put(new Contact("Java", "(53) 3833-4113", "Oeste"), "Java");
        contactsTreeMap.put(new Contact("C++", "(54) 3654-7530", "Sul"), "C++");
        contactsTreeMap.put(new Contact("JavaScript", "(53) 2477-3568", "Oeste"), "JavaScript");
        contactsTreeMap.put(new Contact("Spring", "(54) 2016-7069", "Centro"), "Spring");
        contactsTreeMap.put(new Contact("Python", "(55) 2426-4555", "Leste"), "Python");
        contactsTreeMap.put(new Contact("Kotlin", "(53) 2405-8670", "Norte"), "Kotlin");
        showContactsList();
    }

    private void showContactsList() {
        System.out.println("\nContatos(ordem alfabetica):");

        System.out.println("Nome(Zona) - Número");
        contactsTreeMap.forEach((contact, name) -> System.out.printf("%s\n", contact));
        showMenu();
    }

    private void showContactsPerZone() {
        Stream<Contact> contactsPerZone = contactsTreeMap.keySet().stream()
                .sorted((contact1, contact2) -> zoneCompare.compare(contact1, contact2));
        System.out.println("Nome(Zona) - Número");
        System.out.println("\nContatos(ordem por zona):");
        contactsPerZone.forEach((contact) -> System.out.printf("%s\n", contact));
        showMenu();
    }


    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}