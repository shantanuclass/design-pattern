// Prototype interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Concrete Prototype
class Drawing implements Prototype {
    private String type;

    public Drawing(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println("This is a " + type + " drawing.");
    }

    @Override
    public Prototype clone() {
        return new Drawing(this.type); // shallow copy
    }
}

// Client
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Prototype d1 = new Drawing("Landscape");
        ((Drawing) d1).show();

        // clone the object
        Prototype d2 = d1.clone();
        ((Drawing) d2).show();

        // clone again
        Prototype d3 = d1.clone();
        ((Drawing) d3).show();
    }
}
