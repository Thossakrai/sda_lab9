package task1;


public class Demo {
    public static void main(String[] args) {
        WrapScreen screenService = new WrapScreen();
        WrapPrinter printerService = new WrapPrinter();
        WrapXMLWriter xmlWriterService = new WrapXMLWriter();
        Rectangle rectangle = new Rectangle(1, 1, 5, 5);
        Circle circle = new Circle(4, 7, 20);
        Polygon polygon = new Polygon(1, 1, 2, 2, 3, 3, 4, 4);
        rectangle.registerDrawingServices(screenService);
        circle.registerDrawingServices(printerService);
        polygon.registerDrawingServices(xmlWriterService);
        rectangle.draw();
        circle.draw();
        polygon.draw();
    }
}
