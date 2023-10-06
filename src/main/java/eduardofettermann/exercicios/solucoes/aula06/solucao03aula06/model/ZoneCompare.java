package eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.model;

import java.util.Comparator;

public class ZoneCompare implements Comparator<Contact> {
    @Override
    public int compare(Contact contact1, Contact contact2) {
        return contact1.getZone().compareToIgnoreCase(contact2.getZone());
    }
}
