public class Main {

    // ----- Prototype Interface -----
    interface Toy extends Cloneable {
        Toy clone();
        void show();
    }

    // ----- Concrete Prototype -----
    static class ToyRobot implements Toy {
        private String color;
        private int height;
        private boolean hasLaser;

        public ToyRobot(String color, int height, boolean hasLaser) {
            this.color = color;
            this.height = height;
            this.hasLaser = hasLaser;
        }

        @Override
        public Toy clone() {
            return new ToyRobot(this.color, this.height, this.hasLaser);
        }

        @Override
        public void show() {
            System.out.println("Toy Robot:");
            System.out.println("Color: " + color);
            System.out.println("Height: " + height + " cm");
            System.out.println("Laser: " + hasLaser);
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Original Toy Robot
        ToyRobot original = new ToyRobot("Red", 30, true);
        System.out.println("Original Robot:");
        original.show();

        System.out.println();

        // Clone the robot (copy)
        ToyRobot clone1 = (ToyRobot) original.clone();
        System.out.println("Cloned Robot:");
        clone1.show();

        System.out.println();

        // Another clone
        ToyRobot clone2 = (ToyRobot) original.clone();
        System.out.println("Another Clone:");
        clone2.show();
    }
}
