package entities;

import Interfaces.Play;

public class RegistrazioneAudio extends ElementoMultimediale implements Play {
    private final int volume;
    private final int durata;

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = Math.max(volume, 0);
        this.durata = Math.max(durata, 1);
    }


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            String risultato = getTitolo();
            for (int index = 0; index < volume; index++) {
                risultato += "!";
            }
            System.out.println(risultato);
        }
    }

    @Override
    public void show() {

    }
}
