// Product class
class Burger {
    private String bun;
    private String patty;
    private boolean cheese;
    private boolean lettuce;
    private boolean mayo;

    // private constructor (only Builder can build it)
    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.mayo = builder.mayo;
    }

    @Override
    public String toString() {
        return "Burger with " + bun + ", " + patty +
               (cheese ? ", cheese" : "") +
               (lettuce ? ", lettuce" : "") +
               (mayo ? ", mayo" : "");
    }

    // Builder Class
    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private boolean cheese;
        private boolean lettuce;
        private boolean mayo;

        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this; // return builder for chaining
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder addLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder addMayo(boolean mayo) {
            this.mayo = mayo;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

// Client code
public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Simple burger
        Burger burger1 = new Burger.BurgerBuilder()
                .setBun("Sesame Bun")
                .setPatty("Chicken Patty")
                .addCheese(true)
                .build();

        System.out.println(burger1);

        // Custom burger
        Burger burger2 = new Burger.BurgerBuilder()
                .setBun("Whole Wheat Bun")
                .setPatty("Veggie Patty")
                .addLettuce(true)
                .addMayo(true)
                .build();

        System.out.println(burger2);
    }
}
