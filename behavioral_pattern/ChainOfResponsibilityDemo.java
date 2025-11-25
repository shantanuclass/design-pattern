public class Main {

    // ----- Handler Interface -----
    static abstract class RequestHandler {
        protected RequestHandler next;

        public void setNext(RequestHandler next) {
            this.next = next;
        }

        public abstract void handle(String request);
    }

    // ----- Concrete Handler 1 -----
    static class OlderSibling extends RequestHandler {
        public void handle(String request) {
            if (request.equalsIgnoreCase("snack")) {
                System.out.println("Older Sibling: Sure! Here's a snack 🍎");
            } else {
                System.out.println("Older Sibling: That's too big! Passing to Mom/Dad...");
                if (next != null) next.handle(request);
            }
        }
    }

    // ----- Concrete Handler 2 -----
    static class Parent extends RequestHandler {
        public void handle(String request) {
            if (request.equalsIgnoreCase("ice cream")) {
                System.out.println("Parent: Ice cream approved 🍨");
            } else {
                System.out.println("Parent: Pizza is expensive. Passing to Grandma/Grandpa...");
                if (next != null) next.handle(request);
            }
        }
    }

    // ----- Concrete Handler 3 (Final Handler) -----
    static class Grandparent extends RequestHandler {
        public void handle(String request) {
            System.out.println("Grandparent: Pizza request approved! 🍕😄");
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Create handlers
        RequestHandler olderSibling = new OlderSibling();
        RequestHandler parent = new Parent();
        RequestHandler grandparent = new Grandparent();

        // Set up the chain
        olderSibling.setNext(parent);
        parent.setNext(grandparent);

        // Request: Pizza!
        String request = "pizza";

        System.out.println("Request: " + request);
        olderSibling.handle(request);
    }
}
