package task1;

public class Rectangle extends Shape {
    private int x1, x2, y1, y2;

    Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        services.drawLine(x1, y1, x2, y2);
    }
}
