public class Main {

    // ----- Mediator Interface -----
    interface AirTrafficControl {
        void requestLanding(Airplane airplane, String runway);
        boolean isRunwayFree(String runway);
        void setRunwayBusy(String runway, boolean busy);
    }

    // ----- Concrete Mediator -----
    static class ControlTower implements AirTrafficControl {

        private java.util.Map<String, Boolean> runwayStatus = new java.util.HashMap<>();

        public ControlTower() {
            runwayStatus.put("Runway 5", true); // true = free
            runwayStatus.put("Runway 6", true);
        }

        @Override
        public boolean isRunwayFree(String runway) {
            return runwayStatus.getOrDefault(runway, false);
        }

        @Override
        public void setRunwayBusy(String runway, boolean busy) {
            runwayStatus.put(runway, !busy); // busy false = not free
        }

        @Override
        public void requestLanding(Airplane airplane, String runway) {

            System.out.println("\n" + airplane.getName() + ": Requesting landing on " + runway);

            if (isRunwayFree(runway)) {
                System.out.println("Control Tower: " + runway + " is free. You may land.");
                setRunwayBusy(runway, true);
                airplane.land(runway);
            } else {
                System.out.println("Control Tower: " + runway + " is busy. Redirecting to Runway 6.");
                airplane.land("Runway 6");
                setRunwayBusy("Runway 6", true);
            }
        }
    }

    // ----- Colleague (Airplane) -----
    static class Airplane {
        private String name;
        private AirTrafficControl tower;

        public Airplane(String name, AirTrafficControl tower) {
            this.name = name;
            this.tower = tower;
        }

        public String getName() {
            return name;
        }

        public void requestLanding(String runway) {
            tower.requestLanding(this, runway);
        }

        public void land(String runway) {
            System.out.println(name + ": Landing on " + runway + " ✈️🛬");
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        ControlTower tower = new ControlTower();

        Airplane planeA = new Airplane("Airplane A", tower);
        Airplane planeB = new Airplane("Airplane B", tower);

        // Scenario
        planeA.requestLanding("Runway 5");

        // Airplane B tries same runway
        planeB.requestLanding("Runway 5");
    }
}
