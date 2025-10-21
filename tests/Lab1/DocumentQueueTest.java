package Tests.Lab1;

import Lab1.Document;
import Lab1.DocumentQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentQueueTest {

    @Test
    void add() throws InterruptedException {
        DocumentQueue queue = new DocumentQueue();
        Document doc = new Document("Alice");

        queue.add(doc);

        assertEquals(1, queue.getSize(), "When adding doc size is 1");
    }

    @Test
    void take() throws InterruptedException {
        DocumentQueue queue = new DocumentQueue();
        Document doc1 = new Document("Alice");
        Document doc2 = new Document("Bob");

        queue.add(doc1);
        queue.add(doc2);

        Document taken1 = queue.take();
        Document taken2 = queue.take();

        assertSame(doc1, taken1, "the first taken document must be doc1");
        assertSame(doc2, taken2, "the first taken document must be doc2");
    }

    @Test
    void getSize() throws InterruptedException {
        DocumentQueue queue = new DocumentQueue();

        assertEquals(0, queue.getSize(), "Newly created queue is size 0");

        queue.add(new Document("Rutra"));
        queue.add(new Document("Artur"));

        assertEquals(2, queue.getSize(), "Queue size should be 2 after adding 2 docs");
    }
}
