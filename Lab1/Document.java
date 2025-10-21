package Lab1;
public class Document {
    private static int nextId = 1;
    private static synchronized int getNextId() {
        return nextId++;
    }

    private final int id;
    private final String owner;

    public Document(String owner) {
        this.id = getNextId();
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return String.format("Document_%d by %s", id, owner);
    }
}
