public class Main {

    // ----- Product -----
    static class Burger {
        private boolean cheese;
        private boolean lettuce;
        private boolean doublePatty;
        private boolean mayo;
        private boolean onions;

        // Private constructor
        private Burger(Builder builder) {
            this.cheese = builder.cheese;
            this.lettuce = builder.lettuce;
            this.doublePatty = builder.doublePatty;
            this.mayo = builder.mayo;
            this.onions = builder.onions;
        }

        public void show() {
            System.out.println("Your Burger:");
            System.out.println("Cheese: " + cheese);
            System.out.println("Lettuce: " + lettuce);
            System.out.println("Double Patty: " + doublePatty);
            System.out.println("Mayo: " + mayo);
            System.out.println("Onions: " + onions);
        }

        // ----- Builder Class -----
        static class Builder {
            private boolean cheese;
            private boolean lettuce;
            private boolean doublePatty;
            private boolean mayo;
            private boolean onions = true; // default: onions ON

            public Builder addCheese() {
                this.cheese = true;
                return this;
            }

            public Builder addLettuce() {
                this.lettuce = true;
                return this;
            }

            public Builder addDoublePatty() {
                this.doublePatty = true;
                return this;
            }

            public Builder addMayo() {
                this.mayo = true;
                return this;
            }

            public Builder removeOnions() {
                this.onions = false;
                return this;
            }

            public Burger build() {
                return new Burger(this);
            }
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Custom Burger
        Burger myBurger = new Burger.Builder()
                .addCheese()
                .addLettuce()
                .addDoublePatty()
                .addMayo()
                .removeOnions()
                .build();

        myBurger.show();

        System.out.println();

        // Another Burger (different customization)
        Burger vegBurger = new Burger.Builder()
                .addLettuce()
                .addCheese()
                .build();

        vegBurger.show();
    }
}
