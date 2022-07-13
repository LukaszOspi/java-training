package fuhrpark;

public class Roller extends Fahrzeug {
    private String farbe;
    private int zuladungInKG;
    private int anzahlRoller = 0;

    public Roller(String fahrzeugkennung){
        super(fahrzeugkennung);
        anzahlRoller++;
    }
    public int getAnzahlRoller() {
        return anzahlRoller;
    }
    public String getFarbe() {
        return farbe;
    }
    public int getZuladungInKG() {
        return zuladungInKG;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void setZuladungInKG(int zuladungInKG) {
        this.zuladungInKG = zuladungInKG;
    }
}
