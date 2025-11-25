public class Main {

    // ----- Memento (Save File) -----
    static class PlayerMemento {
        private int health;
        private int score;
        private String location;

        public PlayerMemento(int health, int score, String location) {
            this.health = health;
            this.score = score;
            this.location = location;
        }

        // Getters (Only Originator can access)
        public int getHealth() { return health; }
        public int getScore() { return score; }
        public String getLocation() { return location; }
    }

    // ----- Originator (Player) -----
    static class Player {
        private int health;
        private int score;
        private String location;

        public void setState(int health, int score, String location) {
            this.health = health;
            this.score = score;
            this.location = location;
        }

        public void showState() {
            System.out.println("Player State → Health: " + health + 
                               ", Score: " + score + 
                               ", Location: " + location);
        }

        public PlayerMemento saveGame() {
            System.out.println("💾 Saving game...");
            return new PlayerMemento(health, score, location);
        }

        public void loadGame(PlayerMemento memento) {
            System.out.println("📦 Loading game...");
            this.health = memento.getHealth();
            this.score = memento.getScore();
            this.location = memento.getLocation();
        }
    }

    // ----- Caretaker (Memory Card) -----
    static class MemoryCard {
        private java.util.List<PlayerMemento> saves = new java.util.ArrayList<>();

        public void addSave(PlayerMemento m) {
            saves.add(m);
        }

        public PlayerMemento getSave(int index) {
            return saves.get(index);
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        Player player = new Player();
        MemoryCard memoryCard = new MemoryCard();

        // Initial State
        player.setState(100, 5000, "Forest Entrance");
        player.showState();

        // Save game
        memoryCard.addSave(player.saveGame());

        // Player takes damage and moves
        player.setState(20, 5200, "Dragon Cave");
        player.showState();

        // Restore previous save after failure
        player.loadGame(memoryCard.getSave(0));
        player.showState();
    }
}
