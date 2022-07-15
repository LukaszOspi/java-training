package fuhrpark;

public class Scooter extends Roller {
    static int anzahlScooter = 0;
    private int gewicht;
    private boolean klappbar;

// 2 Konstruktoren
    public Scooter(String fahrzeugkennung) {
        super(fahrzeugkennung);
        anzahlScooter++;
    }
    public Scooter(String fahrzeugkennung, int gewicht){
        super(fahrzeugkennung);
        this.gewicht = gewicht;
        anzahlScooter++;
    }

// Getter
    public int getAnzahlScooter() {
        return anzahlScooter;
    }
    public int getGewicht() {
        return gewicht;
    }
    public boolean getKlappbar() {
        return klappbar;
    }

// Setter
    public void setAnzahlScooter(int anzahlScooter) {
        this.anzahlScooter = anzahlScooter;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public void setKlappbar(boolean klappbar) {
        this.klappbar = klappbar;
    }
}
