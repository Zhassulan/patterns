package study.patterns.singletone.singletone;

public class Printer {

    private static volatile Printer instance;

    public Printer() {
    }

    public static synchronized Printer getInstance() {
        if (instance == null) synchronized (Printer.class) {
            instance = new Printer();
        }
        return instance;
    }

    public void print() {
        System.out.println("printing..");
    }

}
