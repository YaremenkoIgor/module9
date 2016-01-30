package music.utils;


import music.abstract_level.MusicalInstruments;

import java.util.List;

public class MusicInstrumentsSorter {


    public static void sortByName(List<MusicalInstruments> objects) {
        Object temp = null;
        for (int j = 0; j < objects.size(); j++) {
            for (int i = 0; i < objects.size() - j - 1; i++) {
                if (objects.get(i).getName().compareTo(objects.get(i + 1).getName()) > 0) {
                    swap(objects, i);
                }
            }
        }
        System.out.println(" ");
        System.out.println("Sorted musical instruments by name ");
        System.out.println(" ");

        Printer.print(objects);

    }

    private static void swap(List<MusicalInstruments> objects, int i) {
        Object temp;
        temp = objects.get(i);
        objects.set(i, objects.get(i + 1));
        objects.set((i + 1), (MusicalInstruments) temp);
    }


}
