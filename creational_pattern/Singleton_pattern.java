public class Main {

    // ----- Singleton Class -----
    static class Principal {

        // Only one instance (initially null)
        private static Principal instance;

        // Private constructor → no one else can create object
        private Principal() {}

        // Method to return the only instance
        public static Principal getInstance() {
            if (instance == null) {
                instance = new Principal();
            }
            return instance;
        }

        public void announce() {
            System.out.println("I am the only Principal in this school!");
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        Principal p1 = Principal.getInstance();
        Principal p2 = Principal.getInstance();

        p1.announce();

        System.out.println(p1 == p2);   // true → same object
    }
}
