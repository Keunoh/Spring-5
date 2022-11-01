package book.spring5.qualifier;

public class PinPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("print with pin");
    }
}
