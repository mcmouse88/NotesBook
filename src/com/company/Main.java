package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> notes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        NotePad notePad = new NotePad(notes);
        while (true) {
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            switch (input) {
                case "1":
                    notePad.addNote(notes, scanner);
                    break;
                case "2":
                    notePad.printNotes(notes);
                    break;
                case "3":
                    notePad.removeNote(notes, scanner);
                    break;
                default:
                    System.out.println("Такого действия не существует");
            }
        }
    }

    public static void printMenu() {
        System.out.println(
                "Выберите действие" + "\n" +
                        "1. Добавить задачу" + "\n" +
                        "2. Вывести список задач" + "\n" +
                        "3. Удалить задачу" + "\n" +
                        "0. Выход"
        );
    }
}
