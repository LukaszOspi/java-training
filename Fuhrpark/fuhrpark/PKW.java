package fuhrpark;

// This is a superior class for VerbrennerPKW and ElektroPKW !!

public class PKW extends Fahrzeug {
    
    private String kfzKennzeichen;
    private int anzahlTueren;
    private int anzahlMaxInsassen;
    static int anzahlPKW = 0;

// 4 Konstruktoren
    public PKW(String fahrzeugkennung) {
        super(fahrzeugkennung);
        anzahlPKW++;
    }
    PKW(String fahrzeugkennung, int anzahlMaxInsassen){
        super(fahrzeugkennung);
        this.anzahlMaxInsassen = anzahlMaxInsassen;
        anzahlPKW++;
    }
    PKW(String fahrzeugkennung, int anzahlMaxInsassen, int anzahlTueren) {
        super(fahrzeugkennung);
        this.anzahlMaxInsassen = anzahlMaxInsassen;
        this.anzahlTueren = anzahlTueren;
        anzahlPKW++;
    }
    PKW(String fahrzeugkennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen) {
        super(fahrzeugkennung);
        this.anzahlMaxInsassen = anzahlMaxInsassen;
        this.anzahlTueren = anzahlTueren;
        this.kfzKennzeichen = kfzKennzeichen;
        anzahlPKW++;
    }

// Getter
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


// Setter
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
