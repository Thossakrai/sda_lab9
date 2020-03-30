package task1;

public class Circle  extends Shape {
    private int x, y, r;

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    void draw() {
        services.drawCircle(x, y, r);
    }
}
