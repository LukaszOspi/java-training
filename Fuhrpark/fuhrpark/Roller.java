package fuhrpark;

// This is a superior class for Scooter and Escooter!!

public class Roller extends Fahrzeug {
    private String farbe;
    private int zuladungInKG;
    static int anzahlRoller = 0;

// 1 Konstruktor
    public Roller(String fahrzeugkennung){
        super(fahrzeugkennung);
        anzahlRoller++;
    }

// Getter
    public int getAnzahlRoller() {
        return anzahlRoller;
    }
    public String getFarbe() {
        return farbe;
    }
    public int getZuladungInKG() {
        return zuladungInKG;
    }

// Setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void setZuladungInKG(int zuladungInKG) {
        this.zuladungInKG = zuladungInKG;
    }
}
