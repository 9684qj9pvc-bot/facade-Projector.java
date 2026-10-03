package facade;

public class MoviePlayer {

    public void on() {
        System.out.println("Movie player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Movie stopped");
    }

    public void off() {
        System.out.println("Movie player is OFF");
    }
}
