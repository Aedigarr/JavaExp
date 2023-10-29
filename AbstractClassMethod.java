abstract class Shape {

    public abstract void draw();

    public void display() {
        System.out.println("Displaying shape.");
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Drawing Circle.");
    }
}


public class AbstractClassMethod {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();
        circle.display();
    }
}
