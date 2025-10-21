package Lab1;

import java.util.LinkedList;

public class DocumentQueue {
    private final LinkedList<Document> queue = new LinkedList<>();

    public synchronized void add(Document doc) {
        queue.addLast(doc);
        notifyAll(); // розбудити принтери
    }

    public synchronized Document take() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("The queue is empty");
            wait(); // чекати, поки з’явиться документ
        }
        return queue.removeFirst();
    }

    public synchronized int getSize() {
        return queue.size();
    }
}
