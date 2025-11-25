public class Main {

    // ----- Observer Interface -----
    interface Observer {
        void update(String weather);
    }

    // ----- Subject (Observable) -----
    static class WeatherReporter {

        private java.util.List<Observer> subscribers = new java.util.ArrayList<>();
        private String currentWeather;

        public void subscribe(Observer o) {
            subscribers.add(o);
        }

        public void unsubscribe(Observer o) {
            subscribers.remove(o);
        }

        public void setWeather(String weather) {
            this.currentWeather = weather;
            notifyAllSubscribers();
        }

        private void notifyAllSubscribers() {
            System.out.println("\n📢 Weather Reporter: Notifying all subscribers...");
            for (Observer o : subscribers) {
                o.update(currentWeather);
            }
        }
    }

    // ----- Concrete Observers -----
    static class You implements Observer {
        public void update(String weather) {
            System.out.println("You: Weather changed to '" + weather + "'. Taking an umbrella! ☔");
        }
    }

    static class Farmer implements Observer {
        public void update(String weather) {
            System.out.println("Farmer: Weather is '" + weather + "'. Adjusting crop watering 🌾");
        }
    }

    static class PicnicPlanner implements Observer {
        public void update(String weather) {
            System.out.println("Picnic Planner: Weather is '" + weather + "'. Moving picnic indoors 🧺➡️🏠");
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        WeatherReporter reporter = new WeatherReporter();

        // Observers
        Observer you = new You();
        Observer farmer = new Farmer();
        Observer planner = new PicnicPlanner();

        // Subscriptions
        reporter.subscribe(you);
        reporter.subscribe(farmer);
        reporter.subscribe(planner);

        // Weather change!
        reporter.setWeather("Rainy");
    }
}
