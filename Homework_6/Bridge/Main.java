package Homework_6.Bridge;

public class Main {
    public static void main(String[] args) {
        DrawingAPI drawingAPI = new DrawingAPI1();
        Circle circle = new Circle(drawingAPI);
        circle.draw();
    }

}
