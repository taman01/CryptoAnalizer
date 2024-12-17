package ru.javarush.tomanov.cryptoanalizer;

import ru.javarush.tomanov.cryptoanalizer.controller.MainController;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        //build console app
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        MainController mainController = new MainController();
        ConsoleApp application = new ConsoleApp(mainController, menu);
        //run console app
        application.run(args);
    }
}