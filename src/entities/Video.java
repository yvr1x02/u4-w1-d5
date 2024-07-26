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
            String risultato = getTitolo();
            for (int index = 0; index < volume; index++) {
                risultato += "!";
            }
            for (int index1 = 0; index1 < luminosita; index1++) {
                risultato += "*";
            }
            System.out.println(risultato);
        }
    }

    @Override
    public void show() {

    }
}
