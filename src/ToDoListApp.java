import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {
    private static List<String> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static void showMenu() {
        System.out.println("\n--- To-Do List ---");
        System.out.println("1. Dodaj zadanie");
        System.out.println("2. Wyświetl zadania");
        System.out.println("3. Usuń zadanie");
        System.out.println("4. Oznacz zadanie jako ukończone");
        System.out.println("0. Wyjdź");
        System.out.print("Wybierz opcję: ");
    }

    static void addTask() {
        System.out.print("Wpisz treść zadania: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Dodano zadanie.");
    }

    static void showTasks() {
        System.out.println("\nTwoje zadania:");
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    static void removeTask() {
        showTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Podaj numer zadania do usunięcia: ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Zadanie zostało usunięte.");
            } else {
                System.out.println("Nieprawidłowy numer zadania.");
            }
        }
    }

    static void markTaskComplete() {
        showTasks();
        if (!tasks.isEmpty()) {
            System.out.print("Podaj numer zadania do oznaczenia jako ukończone: ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < tasks.size()) {
                String task = tasks.get(index) + " (Ukończone)";
                tasks.set(index, task);
                System.out.println("Zadanie oznaczone jako ukończone.");
            } else {
                System.out.println("Nieprawidłowy numer zadania.");
            }
        }
    }
}
