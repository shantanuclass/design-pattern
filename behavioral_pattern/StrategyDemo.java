public class Main {

    // ----- Strategy Interface -----
    interface RouteStrategy {
        void calculateRoute(String start, String end);
    }

    // ----- Concrete Strategies -----

    static class DrivingStrategy implements RouteStrategy {
        public void calculateRoute(String start, String end) {
            System.out.println("🚗 Driving Route: Using highways and fastest roads from " 
                               + start + " to " + end);
        }
    }

    static class WalkingStrategy implements RouteStrategy {
        public void calculateRoute(String start, String end) {
            System.out.println("🚶 Walking Route: Using sidewalks and pedestrian paths from " 
                               + start + " to " + end);
        }
    }

    static class BikingStrategy implements RouteStrategy {
        public void calculateRoute(String start, String end) {
            System.out.println("🚲 Biking Route: Using bike lanes and trails from " 
                               + start + " to " + end);
        }
    }

    static class PublicTransitStrategy implements RouteStrategy {
        public void calculateRoute(String start, String end) {
            System.out.println("🚇 Transit Route: Using buses and trains from " 
                               + start + " to " + end);
        }
    }

    // ----- Context (GPS App) -----
    static class GPSNavigator {
        private RouteStrategy strategy;

        public void setStrategy(RouteStrategy strategy) {
            this.strategy = strategy;
        }

        public void navigate(String start, String end) {
            System.out.println("\n📍 GPS Navigation:");
            strategy.calculateRoute(start, end);
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        GPSNavigator gps = new GPSNavigator();

        // Driving
        gps.setStrategy(new DrivingStrategy());
        gps.navigate("Home", "Friend's House");

        // Walking
        gps.setStrategy(new WalkingStrategy());
        gps.navigate("Home", "Friend's House");

        // Biking
        gps.setStrategy(new BikingStrategy());
        gps.navigate("Home", "Friend's House");

        // Public Transit
        gps.setStrategy(new PublicTransitStrategy());
        gps.navigate("Home", "Friend's House");
    }
}
