public class Main {

    // ----- Iterator Interface -----
    interface Iterator {
        boolean hasNext();
        Object next();
    }

    // ----- Aggregate Interface -----
    interface Aggregate {
        Iterator createIterator();
    }

    // ----- Concrete Aggregate (Bookshelf) -----
    static class Bookshelf implements Aggregate {

        private String[] books;

        public Bookshelf(String[] books) {
            this.books = books;
        }

        @Override
        public Iterator createIterator() {
            return new BookshelfIterator(books);
        }
    }

    // ----- Concrete Iterator -----
    static class BookshelfIterator implements Iterator {

        private String[] books;
        private int index = 0;

        public BookshelfIterator(String[] books) {
            this.books = books;
        }

        public boolean hasNext() {
            return index < books.length;
        }

        public Object next() {
            return books[index++];
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Books in the Science section
        String[] scienceBooks = {
            "Physics for Beginners",
            "Chemistry Explained",
            "Biology of Life",
            "Astronomy: Stars & Galaxies"
        };

        Bookshelf bookshelf = new Bookshelf(scienceBooks);
        Iterator iterator = bookshelf.createIterator();

        System.out.println("📚 Science Section Books:");

        while (iterator.hasNext()) {
            System.out.println("➡️ " + iterator.next());
        }
    }
}
