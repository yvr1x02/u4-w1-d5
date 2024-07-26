package entities;

public class Immagine extends ElementoMultimediale {
    private final int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = Math.max(luminosita, 0);
    }


    @Override
    public void show() {
        System.out.println(getTitolo() + "*".repeat(luminosita));
    }
}
