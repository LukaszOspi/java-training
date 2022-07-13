package fuhrpark;

public class ElektroPKW extends PKW {

    private int anzahlElektroPKW = 0;
    private int akkuKapazitaet;
    private int ladestand;

    ElektroPKW()   {
        anzahlElektroPKW++;
    }
    ElektroPKW(int akkuKapazitaet) {
        this.akkuKapazitaet = akkuKapazitaet;
        
    }
    ElektroPKW(int anzahlMaxInsassen, int ladestand) {
        super(anzahlMaxInsassen);
        this.ladestand = ladestand;
    }
    public int getAnzahlElektroPKW() {
        return anzahlElektroPKW;
    }
    public int getAkkuKapazitaet() {
        return akkuKapazitaet;
    }
    public int getLadestand() {
        return ladestand;
    }
    public void setAkkuKapazitaet(int akkuKapazitaet) {
        this.akkuKapazitaet = akkuKapazitaet;
    }
    public void setLadestand(int ladestand) {
        this.ladestand = ladestand;
    }
}