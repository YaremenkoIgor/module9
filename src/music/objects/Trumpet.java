package music.objects;


import music.abstract_level.MusicalInstruments;

public class Trumpet extends MusicalInstruments {


    public Trumpet(String name, Integer prise) {
        super(name, prise);
    }

    @Override
    public String toString() {
        return Trumpet.class.getSimpleName()+ "\t\t " + getName() + "\t " + getPrise() ;
    }
}
