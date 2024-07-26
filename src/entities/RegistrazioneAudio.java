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
