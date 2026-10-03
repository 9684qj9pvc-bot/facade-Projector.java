package facade;

public class FacadeDemo {

    public static void main(String[] args) {

        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        MoviePlayer moviePlayer = new MoviePlayer();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(
                        projector,
                        soundSystem,
                        moviePlayer
                );

        homeTheater.watchMovie("The Matrix");

        System.out.println();

        homeTheater.endMovie();
    }
}
