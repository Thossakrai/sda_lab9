package task1;

public class WrapScreen extends DrawingServices {
    Screen screen;

    WrapScreen() {
        screen = Screen.getScreen();
    }

    @Override
    void drawLine(int x1, int y1, int x2, int y2) {
        screen.draw_line(x1, y2, x2, y2);
    }

    @Override
    void drawCircle(int x, int y, int r) {
        screen.draw_circle(x, y, r);
    }

    @Override
    void drawPixel(int x, int y) {
        screen.draw_pixel(x, y);
    }
}

