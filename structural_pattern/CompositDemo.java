public class Main {

    // ----- Component (Common Interface) -----
    interface FileSystem {
        void showDetails();
    }

    // ----- Leaf -----
    static class File implements FileSystem {
        private String name;

        public File(String name) {
            this.name = name;
        }

        public void showDetails() {
            System.out.println("📄 File: " + name);
        }
    }

    // ----- Composite -----
    static class Folder implements FileSystem {
        private String name;
        private java.util.List<FileSystem> items = new java.util.ArrayList<>();

        public Folder(String name) {
            this.name = name;
        }

        public void add(FileSystem item) {
            items.add(item);
        }

        public void showDetails() {
            System.out.println("📁 Folder: " + name);
            for (FileSystem item : items) {
                item.showDetails(); // file or folder (treated same)
            }
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Files
        File file1 = new File("Resume.pdf");
        File file2 = new File("Photo.png");
        File file3 = new File("Notes.txt");

        // Subfolder
        Folder docsFolder = new Folder("Documents");
        docsFolder.add(file1);
        docsFolder.add(file3);

        // Main folder
        Folder mainFolder = new Folder("MyFolder");
        mainFolder.add(file2);
        mainFolder.add(docsFolder);  // add subfolder

        // Show structure
        mainFolder.showDetails();
    }
}
