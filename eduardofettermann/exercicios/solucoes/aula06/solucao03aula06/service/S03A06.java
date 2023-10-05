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
        addSomeContactsToContactsList();
        showContactsList();
        showContactsPerZone();

    }


    private void addSomeContactsToContactsList() {
        contactsTreeMap.put(new Contact("Laís", "41", "Oeste"), "Laís");
        contactsTreeMap.put(new Contact("Eduardo", "51", "Sul"), "Eduardo");
        contactsTreeMap.put(new Contact("Zamit", "11", "Oeste"), "Zamit");

    }

    private void showContactsList() {
        System.out.println("\nContatos por ordem alfabetica:");
        contactsTreeMap.forEach((contact, name) -> System.out.printf("\n%s", contact));
    }

    private void showContactsPerZone() {
        Stream<Contact> contactsPerZone = contactsTreeMap.keySet().stream().sorted((o1, o2) -> zoneCompare.compare(o1, o2));
        System.out.println("\n\nContatos por zona:");
        contactsPerZone.forEach((contact) -> System.out.printf("\n%s", contact));
    }


    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }

    public static void main(String[] args) {
        new S03A06().resolve();
    }
}
