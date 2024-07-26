package entities;

import Interfaces.Play;

public class Video extends ElementoMultimediale implements Play {
    private final int volume;
    private final int luminosita;

    public Video(String titolo, int volume, int luminosita) {
        super(titolo);
        this.volume = Math.max(volume, 0);
        this.luminosita = Math.max(luminosita, 0);
    }


    @Override
    public void play() {
        for (int i = 0; i < volume; i++) {
            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public void show() {
        // Video non ha il metodo show()
    }
}
