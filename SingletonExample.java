package singleton;

class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton singleInstance;

    // Step 2: Make the constructor private so no one can create an object directly
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a public static method to get the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton(); // only created once
        }
        return singleInstance;
    }

    // Just a method to show it works
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Trying to get instance multiple times
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Checking if both objects are same
        if (obj1 == obj2) {
            System.out.println("Both references point to the same instance!");
        } else {
            System.out.println("Different instances created!");
        }
    }
}
