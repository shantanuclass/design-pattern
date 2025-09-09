import java.util.*;

// Component
interface Toy {
    void show();
}

// Leaf
class Car implements Toy {
    public void show() {
        System.out.println("This is a Car Toy");
    }
}

class Doll implements Toy {
    public void show() {
        System.out.println("This is a Doll Toy");
    }
}

// Composite
class ToyBox implements Toy {
    List<Toy> toys = new ArrayList<>();
    
    void add(Toy t) { toys.add(t); }
    
    public void show() {
        for (Toy t : toys) {
            t.show();
        }
    }
}

// Client
public class CompositeDemo {
    public static void main(String[] args) {
        // Create individual toys (Leaf)
        Toy car = new Car();
        Toy doll = new Doll();

        // Create toy box and add toys (Composite)
        ToyBox box = new ToyBox();
        box.add(car);
        box.add(doll);

        // Nested box
        ToyBox bigBox = new ToyBox();
        bigBox.add(box);
        bigBox.add(new Car());

        // Show all
        bigBox.show();
    }
}
