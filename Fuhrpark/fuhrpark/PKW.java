package fuhrpark;


public class PKW extends Fahrzeug {
    
    private String kfzKennzeichen;
    private int anzahlTueren;
    private int anzahlMaxInsassen;
    private int anzahlPKW = 0;

    public PKW(String fahrzeugkennung) {
        super(fahrzeugkennung);
        anzahlPKW++;
    }
    PKW(int anzahlMaxInsassen){
        this.anzahlMaxInsassen = anzahlMaxInsassen;
    }
    PKW(int anzahlMaxInsassen, int anzahlTueren) {
        this.anzahlMaxInsassen = anzahlMaxInsassen;
        this.anzahlTueren = anzahlTueren;
    }
    PKW(int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen) {
        this.anzahlMaxInsassen = anzahlMaxInsassen;
        this.anzahlTueren = anzahlTueren;
        this.kfzKennzeichen = kfzKennzeichen;
    }

    public int getAnzahlPKW() {
        return anzahlPKW;
    }
    public int getAnzahlTueren() {
        return anzahlTueren;
    }
    public int getAnzahlMaxInsassen() {
        return anzahlMaxInsassen;
    }
    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }
    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }
    public void setAnzahlMaxInsassen(int anzahlMaxInsassen) {
        this.anzahlMaxInsassen = anzahlMaxInsassen;
    }
    public void setKfzKennzeichen(String kfzKennzeichen) {
        this.kfzKennzeichen = kfzKennzeichen;
    }

}
