public class Main {
    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            ToDoListApp.showMenu();
            String choice = ToDoListApp.scanner.nextLine();
            switch (choice) {
                case "1":
                    ToDoListApp.addTask();
                    break;
                case "2":
                    ToDoListApp.showTasks();
                    break;
                case "3":
                    ToDoListApp.removeTask();
                    break;
                case "4":
                    ToDoListApp.markTaskComplete();
                    break;
                case "0":
                    running = false;
                    System.out.println("Zamykanie aplikacji. Do zobaczenia!");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
            }
        }
    }
}