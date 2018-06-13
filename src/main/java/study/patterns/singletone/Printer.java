package study.patterns.singletone;

public class Printer {

    private static volatile Printer instance;

    private Printer() {
    }

    public static Printer getInstance() {
        if (instance == null) synchronized (Printer.class) {
            instance = new Printer();
        }
        return instance;
    }

    public void print() {
        System.out.println("printing..");
    }

}
