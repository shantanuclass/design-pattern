public class Main {

    // ----- State Interface -----
    interface TrafficLightState {
        void handle(TrafficLight context);
    }

    // ----- Red State -----
    static class RedState implements TrafficLightState {
        public void handle(TrafficLight context) {
            System.out.println("🔴 Red Light: STOP! Wait at the line.");
            context.setState(new GreenState()); // transition
        }
    }

    // ----- Green State -----
    static class GreenState implements TrafficLightState {
        public void handle(TrafficLight context) {
            System.out.println("🟢 Green Light: GO! Drive through.");
            context.setState(new YellowState()); // transition
        }
    }

    // ----- Yellow State -----
    static class YellowState implements TrafficLightState {
        public void handle(TrafficLight context) {
            System.out.println("🟡 Yellow Light: CAUTION! Prepare to stop.");
            context.setState(new RedState()); // transition
        }
    }

    // ----- Context (Traffic Light) -----
    static class TrafficLight {
        private TrafficLightState currentState;

        public TrafficLight() {
            this.currentState = new RedState(); // initial state
        }

        public void setState(TrafficLightState state) {
            this.currentState = state;
        }

        public void change() {
            currentState.handle(this);
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) throws InterruptedException {

        TrafficLight light = new TrafficLight();

        // Simulate traffic light cycle
        for (int i = 0; i < 6; i++) {
            light.change();
            Thread.sleep(1000); // just to simulate time passing
        }
    }
}
