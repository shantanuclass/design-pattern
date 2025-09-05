package AbstractFactory;

// File: AbstractFactoryPatternDemo.java

// Step 1: Create interfaces
interface Shape {
    void draw();
}

interface Color {
    void fill();
}

// Step 2: Implement concrete Shape classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Implement concrete Color classes
class Red implements Color {
    public void fill() {
        System.out.println("Filling with Red color");
    }
}

class Blue implements Color {
    public void fill() {
        System.out.println("Filling with Blue color");
    }
}

// Step 4: Create abstract factory
abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);
}

// Step 5: Create ShapeFactory
class ShapeFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }

    Color getColor(String colorType) {
        return null; // ShapeFactory doesn’t handle colors
    }
}

// Step 6: Create ColorFactory
class ColorFactory extends AbstractFactory {
    Shape getShape(String shapeType) {
        return null; // ColorFactory doesn’t handle shapes
    }

    Color getColor(String colorType) {
        if (colorType == null)
            return null;
        if (colorType.equalsIgnoreCase("RED"))
            return new Red();
        if (colorType.equalsIgnoreCase("BLUE"))
            return new Blue();
        return null;
    }
}

// Step 7: Factory producer to get factories
class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}

// Step 8: Client code
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Get Shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Get Color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
    }
}
