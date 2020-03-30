package task1;

abstract class Shape {
    protected DrawingServices services;
    abstract void draw();

    public void registerDrawingServices(DrawingServices services) {
        this.services = services;
    }
}
