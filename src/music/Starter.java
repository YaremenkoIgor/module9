package music;


import music.abstract_level.MusicalInstruments;
import music.objects.Guitar;
import music.objects.Piano;
import music.objects.Trumpet;
import music.shop.MusicShop;
import music.utils.Ceasar;
import music.utils.MusicInstrumentsSorter;
import music.utils.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {

        List<MusicalInstruments> musicalInstrumentses = new ArrayList<>();

        MusicalInstruments fender = new Guitar("Fender", 2154);
        MusicalInstruments ibanez = new Guitar("Ibanez", 35681);
        MusicalInstruments yamana = new Piano("Yamana", 57842);
        MusicalInstruments cassio = new Piano("Cassio", 4578);
        MusicalInstruments trumpet = new Trumpet("Trumpet", 25478);

        createMusicShop(fender, ibanez, yamana, cassio, trumpet);

        addMusicInstuments(musicalInstrumentses, fender, ibanez, yamana, cassio, trumpet);

        Printer.print(musicalInstrumentses);

        MusicInstrumentsSorter.sortByName(musicalInstrumentses);


        String collectionToStringView = musicalInstrumentses.toString().replace("[", "").replace("]", "");
        int value = valueToCesarAlgoritm();
        String encodeContent = Ceasar.encode(collectionToStringView, value);
        String decodeContent = Ceasar.decode(encodeContent, value);


        System.out.println(" ");
        System.out.println("Initial content: " + collectionToStringView + "\n\t");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("Encoded content: " + encodeContent + "\n\t");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println("Decoded content: " + decodeContent + "\t");


    }


    private static int valueToCesarAlgoritm() {
        Scanner reader = new Scanner(System.in);
        System.out.println(" ");
        int value = 0;
        while (true) {
            System.out.print("Please, enter a value (positive integer number): ");
            value = reader.nextInt();
            System.out.println("---------------------------------------------- ");
            if (value > 0) break;
        }
        return value;
    }

    private static void addMusicInstuments(List<MusicalInstruments> musicalInstrumentses, MusicalInstruments fender, MusicalInstruments ibanez, MusicalInstruments yamana, MusicalInstruments cassio, MusicalInstruments trumpet) {
        musicalInstrumentses.add(ibanez);
        musicalInstrumentses.add(yamana);
        musicalInstrumentses.add(trumpet);
        musicalInstrumentses.add(fender);
        musicalInstrumentses.add(cassio);
    }

    private static void createMusicShop(MusicalInstruments fender, MusicalInstruments ibanez, MusicalInstruments yamana, MusicalInstruments cassio, MusicalInstruments trumpet) {
        MusicShop musicShop = new MusicShop("MyShop");

        addMusicInstuments(musicShop.getMusicalInstrumentses(), fender, ibanez, yamana, cassio, trumpet);
    }
}