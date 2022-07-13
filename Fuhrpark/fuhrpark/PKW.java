package fuhrpark;


public class PKW extends Fahrzeug {
    
    private String kfzKennzeichen;
    private int anzahlTueren;
    public int anzahlMaxInsassen;
    private int anzahlPKW = 0;

    public PKW() {
        anzahlPKW++;
    }
    PKW(int anzahlMaxInsassen){
        this.anzahlMaxInsassen = anzahlMaxInsassen;
    }
    PKW(int anzahlMaxInsassen, int anzahlTueren) {
        this.anzahlMaxInsassen = anzahlMaxInsassen;
        this.anzahlTueren = anzahlTueren;
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
