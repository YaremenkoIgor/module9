package music.objects;


import music.abstract_level.MusicalInstruments;

public class Guitar extends MusicalInstruments {


    public Guitar(String name, Integer prise) {
        super(name, prise);
    }

    @Override
    public String toString() {
        return Guitar.class.getSimpleName()+ "\t\t " + getName() + "\t\t " + getPrise();
    }
}
