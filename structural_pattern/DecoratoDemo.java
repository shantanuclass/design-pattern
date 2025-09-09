// Component
interface IceCream {
    String make();
}

// Concrete Component
class Vanilla implements IceCream {
    public String make() {
        return "Vanilla";
    }
}

// Decorator
class IceCreamDecorator implements IceCream {
    protected IceCream iceCream;
    IceCreamDecorator(IceCream i) { this.iceCream = i; }
    public String make() {
        return iceCream.make();
    }
}

// Concrete Decorators
class ChocoTopping extends IceCreamDecorator {
    ChocoTopping(IceCream i) { super(i); }
    public String make() {
        return super.make() + " + Choco";
    }
}

class NutsTopping extends IceCreamDecorator {
    NutsTopping(IceCream i) { super(i); }
    public String make() {
        return super.make() + " + Nuts";
    }
}

// Client
public class DecoratorDemo {
    public static void main(String[] args) {
        IceCream plain = new Vanilla();
        System.out.println(plain.make());

        IceCream choco = new ChocoTopping(new Vanilla());
        System.out.println(choco.make());

        IceCream fullyLoaded = new NutsTopping(new ChocoTopping(new Vanilla()));
        System.out.println(fullyLoaded.make());
    }
}
