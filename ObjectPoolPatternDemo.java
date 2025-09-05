package ObjectPool;

// File: ObjectPoolPatternDemo.java

import java.util.*;

// Step 1: Create a simple class (e.g., Connection)
class Connection {
    private static int counter = 0;
    private int id;

    public Connection() {
        id = ++counter;
        System.out.println("Creating Connection #" + id);
    }

    public void connect() {
        System.out.println("Using Connection #" + id);
    }
}

// Step 2: Create Object Pool
class ConnectionPool {
    private List<Connection> available = new ArrayList<>();
    private List<Connection> inUse = new ArrayList<>();
    private final int MAX_SIZE = 3; // limit pool size

    // Borrow a connection
    public Connection getConnection() {
        if (available.isEmpty() && inUse.size() < MAX_SIZE) {
            // Create new connection if pool not full
            Connection conn = new Connection();
            inUse.add(conn);
            return conn;
        } else if (!available.isEmpty()) {
            // Reuse existing connection
            Connection conn = available.remove(0);
            inUse.add(conn);
            return conn;
        } else {
            System.out.println("No available connections. Please wait!");
            return null;
        }
    }

    // Return a connection to pool
    public void releaseConnection(Connection conn) {
        if (conn != null) {
            inUse.remove(conn);
            available.add(conn);
            System.out.println("Connection released back to pool");
        }
    }
}

// Step 3: Client code
public class ObjectPoolPatternDemo {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();

        // Borrow connections
        Connection c1 = pool.getConnection();
        c1.connect();

        Connection c2 = pool.getConnection();
        c2.connect();

        Connection c3 = pool.getConnection();
        c3.connect();

        // Pool limit reached, next request returns null
        Connection c4 = pool.getConnection();

        // Release one connection back to pool
        pool.releaseConnection(c1);
        if (c4 != null) {
            c4.connect();
        } else {
            System.out.println("Could not get connection for c4");
        }

        // Now pool can give that connection again
        Connection c5 = pool.getConnection();
        c5.connect();
    }
}
