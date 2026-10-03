package facade;

public class SoundSystem {

    public void on() {
        System.out.println("Sound system is ON");
    }

    public void off() {
        System.out.println("Sound system is OFF");
    }

    public void setVolume(int volume) {
        System.out.println("Volume set to " + volume);
    }
}
