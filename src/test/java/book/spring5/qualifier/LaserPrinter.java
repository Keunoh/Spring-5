package book.spring5.qualifier;

public class LaserPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("print with laser");
    }
}
