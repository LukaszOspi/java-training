package fuhrpark;

public class ElektroPKW extends PKW {

    static int anzahlElektroPKW = 0;
    private int akkuKapazitaet;
    private int ladestand;
    
// 3 Konstruktoren
    ElektroPKW(String fahrzeugkennung)   {
        super(fahrzeugkennung);
        anzahlElektroPKW++; }
   
    ElektroPKW(String fahrzeugkennung, int anzahlMaxInsassen, int ladestand) {
        super(fahrzeugkennung, anzahlMaxInsassen);
        this.ladestand = ladestand;
        anzahlElektroPKW++;
    }
    ElektroPKW(String fahrzeugkennung, int anzahlMaxInsassen, int ladestand, int anzahlTueren) {
        super(fahrzeugkennung, anzahlMaxInsassen, anzahlTueren);
        this.ladestand = ladestand;
        anzahlElektroPKW++;
    }

    // Getter
    public int getAnzahlElektroPKW() {
        return anzahlElektroPKW;
    }
    public int getAkkuKapazitaet() {
        return akkuKapazitaet;
    }
    public int getLadestand() {
        return ladestand;
    }
    // Setter
    public void setAkkuKapazitaet(int akkuKapazitaet) {
        this.akkuKapazitaet = akkuKapazitaet;
    }
    public void setLadestand(int ladestand) {
        this.ladestand = ladestand;
    }
}