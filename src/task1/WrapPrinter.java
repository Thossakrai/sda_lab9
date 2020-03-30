package task1;

public class WrapPrinter extends DrawingServices {

    Printer printer;

    WrapPrinter() {
        printer = Printer.getPrinter();
    }

    @Override
    void drawLine(int x1, int y1, int x2, int y2) {
        printer.print_line(x1, y1, x2, y2);
    }

    @Override
    void drawCircle(int x, int y, int r) {
        printer.print_circle(x, y, r);
    }

    @Override
    void drawPixel(int x, int y) {
        printer.print_pixel(x, y);
    }
}
