package BridgePattern;

// File: BridgePatternDemo.java

// Step 1: Implementor interface
interface Color {
    void applyColor();
}

// Step 2: Concrete Implementors
class RedColor implements Color {
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}

class BlueColor implements Color {
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}

// Step 3: Abstraction
abstract class Shape {
    protected Color color;

    // Bridge: Abstraction HAS a Implementor
    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Step 4: Refined Abstraction
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Circle -> ");
        color.applyColor();
    }
}

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Square -> ");
        color.applyColor();
    }
}

// Step 5: Client code
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();
        blueSquare.draw();
    }
}
