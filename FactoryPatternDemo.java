// Product interface
interface Toy {
    void play();
}

// Concrete Products
class Car implements Toy {
    public void play() { System.out.println("Playing with a car!"); }
}

class Teddy implements Toy {
    public void play() { System.out.println("Hugging the teddy!"); }
}

// Factory
class ToyFactory {
    static Toy getToy(String type) {
        if (type.equalsIgnoreCase("car")) return new Car();
        else if (type.equalsIgnoreCase("teddy")) return new Teddy();
        return null;
    }
}

// Client
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Toy toy1 = ToyFactory.getToy("car");
        toy1.play();

        Toy toy2 = ToyFactory.getToy("teddy");
        toy2.play();
    }
}
