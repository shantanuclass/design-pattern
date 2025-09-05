package AdapterPattern;

// File: AdapterPatternDemo.java

// Step 1: Target interface (what client expects)
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Step 2: Adaptee class (incompatible interface)
class AdvancedMediaPlayer {
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}

// Step 3: Adapter class makes Adaptee compatible with Target
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else {
            System.out.println("Invalid format: " + audioType);
        }
    }
}

// Step 4: Concrete class that uses Adapter
class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            // Use adapter for other formats
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        }
    }
}

// Step 5: Client code
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3"); // direct support
        player.play("mp4", "movie.mp4"); // via adapter
        player.play("vlc", "clip.vlc"); // via adapter
        player.play("avi", "video.avi"); // unsupported
    }
}
