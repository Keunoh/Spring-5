package book.spring5.qualifier;

import org.springframework.stereotype.Component;

@Component
public class LaserPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("print with laser");
    }
}
