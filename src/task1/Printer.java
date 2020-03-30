package task1;

import java.text.MessageFormat;

public class Printer {
    private static Printer printer;
    
    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }
    
    public void print_line(int x1, int y1, int x2, int y2) {
        Object[] params = new Object[]{x1, y1, x2, y2};
        String message = MessageFormat.format("Print a line from ({0}, {1}) to ({2}, {3})", params);
        System.out.println(message);
    }

    void print_pixel(int x, int y) {
        Object[] params = new Object[]{x, y};
        String message = MessageFormat.format("Print a pixel at ({0}, {1})", params);
        System.out.println(message);
    }

    void print_circle(int x, int y, int r) {
        Object[] params = new Object[]{x, y, r};
        String message = MessageFormat.format("Print a circle at ({0}, {1}) with radius {2}", params);
        System.out.println(message);
    }
}
