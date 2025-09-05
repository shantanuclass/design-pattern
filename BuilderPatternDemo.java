package Builder;

// File: BuilderPatternDemo.java

// Product class
class Car {
    private String engine;
    private int wheels;
    private String color;

    // Private constructor (only builder can access)
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    public void showDetails() {
        System.out.println("Car with Engine: " + engine +
                ", Wheels: " + wheels +
                ", Color: " + color);
    }

    // Static nested Builder class
    public static class CarBuilder {
        private String engine;
        private int wheels;
        private String color;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this; // return builder for chaining
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Build method returns the final object
        public Car build() {
            return new Car(this);
        }
    }
}

// Client code
public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Build car step by step
        Car car1 = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .setColor("Red")
                .build();

        Car car2 = new Car.CarBuilder()
                .setEngine("Electric")
                .setWheels(3)
                .setColor("Blue")
                .build();

        car1.showDetails();
        car2.showDetails();
    }
}
