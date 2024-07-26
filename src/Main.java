import Interfaces.Play;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci il tipo di elemento (audio, video, immagine):");
            String tipo = scanner.nextLine();
            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo.toLowerCase()) {
                case "audio":
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata:");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new RegistrazioneAudio(titolo, volumeAudio, durataAudio);
                    break;
                case "video":
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosita:");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la durata:");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, volumeVideo, luminositaVideo, durataVideo);
                    break;
                case "immagine":
                    System.out.println("Inserisci la luminosita:");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo di elemento non riconosciuto.");
                    i--;
            }
        }

        while (true) {

            System.out.println("Elementi inseriti:");
            for (int i = 0; i < elementi.length; i++) {
                System.out.println((i + 1) + "->" + elementi[i].getTitolo());
            }

            System.out.println("Scegli un elemento da riprodurre (1-5) o 0 per finire:");
            int scelta = Integer.parseInt(scanner.nextLine());

            if (scelta == 0) {
                break;
            } else if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Play) {
                    ((Play) elemento).play();
                } else {
                    elemento.show();
                }
            } else {
                System.out.println("Scelta non valida. Inserisci un numero tra 1 e 5, o 0 per finire.");
            }
        }

        scanner.close();
    }
}
