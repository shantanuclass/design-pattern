// Singleton class
class Principal {
    // static instance (only one will exist)
    private static Principal instance;

    // private constructor prevents direct object creation
    private Principal() {}

    // global access point
    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello, I am the only Principal!");
    }
}

// Client code
public class SingletonDemo {
    public static void main(String[] args) {
        // Trying to get multiple objects
        Principal p1 = Principal.getInstance();
        Principal p2 = Principal.getInstance();

        // calling method
        p1.showMessage();

        // checking if both are same object
        if (p1 == p2) {
            System.out.println("Both p1 and p2 are the same instance!");
        } else {
            System.out.println("Different instances created!");
        }
    }
}
