public class Main {

    // ----- Product Interface -----
    interface IceCream {
        void serve();
    }

    // ----- Concrete Products -----
    static class ChocolateIceCream implements IceCream {
        public void serve() {
            System.out.println("Serving Chocolate Ice Cream 🍫");
        }
    }

    static class VanillaIceCream implements IceCream {
        public void serve() {
            System.out.println("Serving Vanilla Ice Cream 🍦");
        }
    }

    static class StrawberryIceCream implements IceCream {
        public void serve() {
            System.out.println("Serving Strawberry Ice Cream 🍓");
        }
    }

    // ----- Factory Class -----
    static class IceCreamFactory {
        public static IceCream makeIceCream(String type) {
            switch (type.toLowerCase()) {
                case "chocolate":
                    return new ChocolateIceCream();
                case "vanilla":
                    return new VanillaIceCream();
                case "strawberry":
                    return new StrawberryIceCream();
                default:
                    throw new IllegalArgumentException("Unknown ice cream type: " + type);
            }
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        IceCream ice1 = IceCreamFactory.makeIceCream("chocolate");
        IceCream ice2 = IceCreamFactory.makeIceCream("vanilla");
        IceCream ice3 = IceCreamFactory.makeIceCream("strawberry");

        ice1.serve();
        ice2.serve();
        ice3.serve();
    }
}
