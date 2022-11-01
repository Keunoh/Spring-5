package book.spring5.qualifier;

public class BoxImpl implements Box {

    private final Printer printer;

    public BoxImpl(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void open() {
        System.out.println("printer is... " + this.printer);
    }
}
