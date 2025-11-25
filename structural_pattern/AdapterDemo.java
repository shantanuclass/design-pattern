public class Main {

    // ----- Target Interface (Indian Socket) -----
    interface IndianSocket {
        void givePower();
    }

    // ----- Adaptee (Foreign Plug) -----
    static class ForeignPlug {
        public void supplyElectricity() {
            System.out.println("Foreign plug supplying electricity ⚡");
        }
    }

    // ----- Adapter -----
    static class PlugAdapter implements IndianSocket {

        private ForeignPlug foreignPlug;

        public PlugAdapter(ForeignPlug foreignPlug) {
            this.foreignPlug = foreignPlug;
        }

        @Override
        public void givePower() {
            System.out.println("Adapter converting foreign plug to Indian socket 🔌");
            foreignPlug.supplyElectricity(); // adapting the method
        }
    }

    // ----- Client -----
    public static void main(String[] args) {

        // Toy with foreign plug
        ForeignPlug foreignToy = new ForeignPlug();

        // Use adapter to fit into Indian socket
        IndianSocket socket = new PlugAdapter(foreignToy);

        socket.givePower();
    }
}
