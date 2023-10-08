package eduardofettermann.exercicios.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    private static final Menu MENU = new Menu();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        MENU.showStartMenu();
    }
}