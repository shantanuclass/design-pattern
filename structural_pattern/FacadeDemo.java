public class Main {

    // ----- Subsystems -----
    static class RoomService {
        void orderFood() {
            System.out.println("Room Service: Your food order is placed 🍽️");
        }
    }

    static class CleaningService {
        void requestCleaning() {
            System.out.println("Cleaning Service: Your room will be cleaned 🧹");
        }
    }

    static class LaundryService {
        void sendLaundry() {
            System.out.println("Laundry Service: Your clothes will be washed 👕");
        }
    }

    static class TransportService {
        void bookCab() {
            System.out.println("Transport Service: Your cab is booked 🚗");
        }
    }

    // ----- Facade (Reception) -----
    static class Reception {

        private RoomService roomService = new RoomService();
        private CleaningService cleaning = new CleaningService();
        private LaundryService laundry = new LaundryService();
        private TransportService transport = new TransportService();

        void orderFood() {
            roomService.orderFood();
        }

        void requestRoomCleaning() {
            cleaning.requestCleaning();
        }

        void sendLaundry() {
            laundry.sendLaundry();
        }

        void bookTransport() {
            transport.bookCab();
        }
    }

    // ----- Client -----
    public static void main(String[] args) {

        Reception reception = new Reception();

        reception.orderFood();
        reception.requestRoomCleaning();
        reception.sendLaundry();
        reception.bookTransport();
    }
}
