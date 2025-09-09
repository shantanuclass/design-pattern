// Subsystems
class Lights {
    void on()  { System.out.println("Lights On"); }
    void off() { System.out.println("Lights Off"); }
}

class Projector {
    void start() { System.out.println("Projector Started"); }
}

class Sound {
    void play() { System.out.println("Sound Playing"); }
}

// Facade
class HomeTheaterFacade {
    private Lights lights;
    private Projector projector;
    private Sound sound;

    HomeTheaterFacade(Lights l, Projector p, Sound s) {
        this.lights = l;
        this.projector = p;
        this.sound = s;
    }

    void watchMovie() {
        lights.off();
        projector.start();
        sound.play();
        System.out.println("Movie Started!");
    }
}

// Client
public class FacadeDemo {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade(
            new Lights(), new Projector(), new Sound()
        );
        theater.watchMovie();
    }
}
