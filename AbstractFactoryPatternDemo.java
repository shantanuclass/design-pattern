// Abstract Products
interface Ride { void enjoy(); }
interface Food { void eat(); }

// Concrete Products - Disney
class DisneyRide implements Ride { public void enjoy() { System.out.println("Disney ride!"); } }
class DisneyFood implements Food { public void eat() { System.out.println("Eating Disney food!"); } }

// Concrete Products - Marvel
class MarvelRide implements Ride { public void enjoy() { System.out.println("Marvel ride!"); } }
class MarvelFood implements Food { public void eat() { System.out.println("Eating Marvel food!"); } }

// Abstract Factory
interface ThemeFactory {
    Ride createRide();
    Food createFood();
}

// Concrete Factories
class DisneyFactory implements ThemeFactory {
    public Ride createRide() { return new DisneyRide(); }
    public Food createFood() { return new DisneyFood(); }
}

class MarvelFactory implements ThemeFactory {
    public Ride createRide() { return new MarvelRide(); }
    public Food createFood() { return new MarvelFood(); }
}

// Client
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ThemeFactory disney = new DisneyFactory();
        disney.createRide().enjoy();
        disney.createFood().eat();

        ThemeFactory marvel = new MarvelFactory();
        marvel.createRide().enjoy();
        marvel.createFood().eat();
    }
}
