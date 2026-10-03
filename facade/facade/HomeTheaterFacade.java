package facade;

public class HomeTheaterFacade {

    private Projector projector;
    private SoundSystem soundSystem;
    private MoviePlayer moviePlayer;

    public HomeTheaterFacade(
            Projector projector,
            SoundSystem soundSystem,
            MoviePlayer moviePlayer) {

        this.projector = projector;
        this.soundSystem = soundSystem;
        this.moviePlayer = moviePlayer;
    }

    public void watchMovie(String movie) {

        System.out.println("Starting movie...");

        projector.on();
        projector.wideScreenMode();

        soundSystem.on();
        soundSystem.setVolume(10);

        moviePlayer.on();
        moviePlayer.play(movie);

        System.out.println("Movie started successfully!");
    }

    public void endMovie() {

        System.out.println("Ending movie...");

        moviePlayer.stop();
        moviePlayer.off();

        soundSystem.off();
        projector.off();

        System.out.println("Movie session ended.");
    }
}
