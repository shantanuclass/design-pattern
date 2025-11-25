public class Main {

    // ----- Implementor (TV Interface) -----
    interface TV {
        void on();
        void off();
        void changeChannel(int channel);
    }

    // ----- Concrete Implementors -----
    static class SonyTV implements TV {
        public void on() {
            System.out.println("Sony TV is ON 🔵");
        }

        public void off() {
            System.out.println("Sony TV is OFF ⚫");
        }

        public void changeChannel(int channel) {
            System.out.println("Sony TV tuned to channel " + channel);
        }
    }

    static class SamsungTV implements TV {
        public void on() {
            System.out.println("Samsung TV is ON 🔵");
        }

        public void off() {
            System.out.println("Samsung TV is OFF ⚫");
        }

        public void changeChannel(int channel) {
            System.out.println("Samsung TV switched to channel " + channel);
        }
    }

    // ----- Abstraction (Remote) -----
    static abstract class RemoteControl {
        protected TV tv;

        public RemoteControl(TV tv) {
            this.tv = tv;
        }

        public abstract void turnOn();
        public abstract void turnOff();
        public abstract void setChannel(int channel);
    }

    // ----- Refined Abstraction -----
    static class BasicRemote extends RemoteControl {

        public BasicRemote(TV tv) {
            super(tv);
        }

        public void turnOn() {
            tv.on();
        }

        public void turnOff() {
            tv.off();
        }

        public void setChannel(int channel) {
            tv.changeChannel(channel);
        }
    }

    // ----- Main Method -----
    public static void main(String[] args) {

        // Remote controlling Sony TV
        RemoteControl sonyRemote = new BasicRemote(new SonyTV());
        sonyRemote.turnOn();
        sonyRemote.setChannel(5);
        sonyRemote.turnOff();

        System.out.println();

        // Same Remote controlling Samsung TV
        RemoteControl samsungRemote = new BasicRemote(new SamsungTV());
        samsungRemote.turnOn();
        samsungRemote.setChannel(12);
        samsungRemote.turnOff();
    }
}
