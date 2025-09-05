package Prototype;

// File: PrototypePatternDemo.java

// Step 1: Create an interface that supports cloning
interface Prototype extends Cloneable {
    Prototype clone();
}

// Step 2: Concrete class implementing Prototype
class Shape implements Prototype {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    @Override
    public Prototype clone() {
        return new Shape(this.type); // simple copy
    }

    public void draw() {
        System.out.println("Drawing a " + type);
    }
}

// Step 3: Client code
public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create original object
        Shape circle = new Shape("Circle");
        circle.draw();

        // Clone object
        Shape clonedCircle = (Shape) circle.clone();
        clonedCircle.draw();

        // Check if they are different objects
        System.out.println("circle == clonedCircle ? " + (circle == clonedCircle));
    }
}
