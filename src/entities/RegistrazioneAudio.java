package entities;

import Interfaces.Play;

public class RegistrazioneAudio extends ElementoMultimediale implements Play {
    private final int volume;

    public RegistrazioneAudio(String titolo, int volume) {
        super(titolo);
        this.volume = Math.max(volume, 0);
    }


    @Override
    public void play() {
        for (int i = 0; i < volume; i++) {
            System.out.println(getTitolo() + "!".repeat(volume));
        }
    }

    @Override
    public void show() {

    }
}
