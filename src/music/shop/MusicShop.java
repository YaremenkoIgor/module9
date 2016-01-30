package music.shop;


import music.abstract_level.MusicalInstruments;

import java.util.ArrayList;
import java.util.List;

public class MusicShop extends MusicalInstruments {

    private List<MusicalInstruments> musicalInstrumentses = new ArrayList<>();

    public MusicShop(String name){
        super(name);
    }

    public List<MusicalInstruments> getMusicalInstrumentses() {
        return musicalInstrumentses;
    }

    @Override
    public String toString() {
        return MusicShop.class.getSimpleName() + "\t" + getName();
    }
}
