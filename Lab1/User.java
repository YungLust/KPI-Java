package Lab1;

public class User extends Thread {
    private final DocumentQueue queue;
    private final String username;
    private int iterationsNumber = 10;

    public User(String username, DocumentQueue queue) {
        super("UserThread-" + username);
        this.username = username;
        this.queue = queue;
    }

    public User(String username, DocumentQueue queue, int iterationsNumber) {
        super("UserThread-" + username);
        this.username = username;
        this.queue = queue;
        this.iterationsNumber = iterationsNumber;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < iterationsNumber; i++) {
                Document doc = new Document(username);
                queue.add(doc);
                System.out.printf("[%s] додав %s. У черзі = %d%n",
                        getName(), doc, queue.getSize());
                Thread.sleep(1000); // пауза
            }
        } catch (InterruptedException e) {
            System.out.printf("[%s] завершив роботу.%n", getName());
        }
    }
}
