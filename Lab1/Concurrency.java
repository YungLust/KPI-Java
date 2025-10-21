package Lab1;

public class Concurrency{
    public static void main(String[] args) {
        DocumentQueue queue = new DocumentQueue();

        // producers
        User u1 = new User("Rutra", queue);
        User u2 = new User("Artur", queue);

        // consumers
        Printer p1 = new Printer("Nikon D700", queue);
        Printer p2 = new Printer("Epson P130", queue);

        // запуск потоків
        p1.start();
        p2.start();
        u2.start();
    }
}
