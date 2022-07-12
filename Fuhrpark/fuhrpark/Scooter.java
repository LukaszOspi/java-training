package fuhrpark;
public class Scooter extends Roller {
    private int anzahlScooter;
    private int gewicht;
    private boolean klappbar;

    public int getAnzahlScooter() {
        return anzahlScooter;
    }
    public int getGewicht() {
        return gewicht;
    }
    public boolean getKlappbar() {
        return klappbar;
    }
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
