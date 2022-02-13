package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class NotePad {
    private ArrayList<String> notes;

    public NotePad(ArrayList<String> notes) {
        this.notes = notes;
    }

    public void addNote(ArrayList<String> notes, Scanner scanner) throws RuntimeException {
        System.out.println("Введите задачу для планирования, либо введите \"back\" для возврата в меню");
        String note = scanner.nextLine();
        if (note.equals("back")) {
            return;
        }
        String index;
        while (true) try {
            System.out.println("Выберите позицию задачи в списке, либо введите \"start\" или \"end\" чтобы поместить" +
                    " задачу в начало или в конец списка соответственно");
            index = scanner.nextLine();
            if (index.equals("start")) {
                notes.add(0, note);
            } else if (index.equals("end") || index.equals("")) {
                notes.add(note);
            } else {
                notes.add(Integer.parseInt(index) - 1, note);
            }
            break;
        } catch (RuntimeException e) {
            System.out.println("Неправильный формат ввода");
        }
    }

    public void printNotes(ArrayList<String> notes) {
        System.out.println("Список задач:");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i));
        }
        System.out.println();
    }

    public void removeNote(ArrayList<String> notes, Scanner scanner) throws RuntimeException {
        while (true) try {
            System.out.println("Выберите номер задачи, чтобы удалить ее из списка, либо введите \"back\" для возврата в меню");
            String index = scanner.nextLine();
            if (index.equals("back")) {
                break;
            }
            if (notes.isEmpty()) {
                System.out.println("Задачи с таким номером не существует");
                break;
            }
            notes.remove(Integer.parseInt(index) - 1);
            break;
        } catch (RuntimeException e) {
            System.out.println("Неправильный формат ввода");
        }
    }
}

