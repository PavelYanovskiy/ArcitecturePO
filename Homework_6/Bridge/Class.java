package Homework_6.Bridge;

// Абстракция
interface Shape {
    void draw();
}

// Реализация
interface DrawingAPI {
    void drawShape();
}

// Конкретная абстракция
class Circle implements Shape {
    private final DrawingAPI drawingAPI;

    public Circle(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        drawingAPI.drawShape();
    }
}

// Конкретная реализация
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawShape() {
        System.out.println("Drawing a shape using Drawing API 1");
    }
}
