package Lab1;

import java.util.LinkedList;

public class UnsynchronizedDocumentQueue extends DocumentQueue{
    private final LinkedList<Document> queue = new LinkedList<>();

    public void add(Document doc) {
        queue.addLast(doc);
    }

    public Document take() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
        return queue.removeFirst();
    }

    public int size() {
        return queue.size();
    }
}
