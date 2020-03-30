package task1;

public class WrapXMLWriter extends DrawingServices {
    XMLWriter xmlWriter;

    WrapXMLWriter() {
        xmlWriter = XMLWriter.getXmlWriter();
    }

    @Override
    void drawLine(int x1, int y1, int x2, int y2) {
        xmlWriter.write_line(x1, y1, x2, y2);
    }

    @Override
    void drawCircle(int x, int y, int r) {
        xmlWriter.write_circle(x, y, r);
    }

    @Override
    void drawPixel(int x, int y) {
        xmlWriter.write_pixel(x, y);
    }
}
