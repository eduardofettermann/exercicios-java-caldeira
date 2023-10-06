package eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.model;

public class Contact implements Comparable<Contact> {
    private String name;
    private String number;
    private String zone;


    public Contact(String name, String number, String zone) {
        this.name = name;
        this.number = number;
        this.zone = zone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    @Override
    public String toString() {
        return String.format("%s(%s) - %s", this.getName(), this.getZone(), this.getNumber());
    }

    @Override
    public int compareTo(Contact o) {
        return this.getName().compareTo(o.getName());
    }
}
