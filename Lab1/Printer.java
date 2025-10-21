package Lab1;

public class Printer extends Thread {
    private final DocumentQueue queue;
    private int iterationsNumber = 10;

    public Printer(String printerName, DocumentQueue queue) {
        super("PrinterThread-" + printerName);
        this.queue = queue;
    }

    public Printer(String printerName, DocumentQueue queue, int iter) {
        super("PrinterThread-" + printerName);
        this.queue = queue;
        this.iterationsNumber = iter;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < iterationsNumber; i++) {
                Document doc = queue.take();
                System.out.printf("[%s] почав друк %s. У черзі = %d%n",
                        getName(), doc, queue.getSize());
                Thread.sleep(1000);
                System.out.printf("[%s] завершив друк %s",
                        getName(), doc);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void setIterationsNumber(int iterationsNumber) {
        this.iterationsNumber = iterationsNumber;
    }

    public int getIterationsNumber() {
        return iterationsNumber;
    }
}
