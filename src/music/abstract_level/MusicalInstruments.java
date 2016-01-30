package music.abstract_level;





public abstract class MusicalInstruments  {

    private String name;
    private Integer prise;

    public MusicalInstruments(String name, Integer prise) {
        this.name = name;
        this.prise = prise;
    }

    public MusicalInstruments(String name) {
        this.name = name;
    }

    public MusicalInstruments(){

    }

    public String getName() {
        return name;
    }

    public Integer getPrise() {
        return prise;
    }
}
