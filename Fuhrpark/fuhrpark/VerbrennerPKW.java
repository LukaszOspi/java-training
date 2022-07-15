package fuhrpark;

public class VerbrennerPKW extends PKW {
    static Integer anzahlVerbrennerPKW = 0;
    private String treibstoff;
    private String fuellstand;
    private int tankgroesse = 50;
    
    

// 2 Konstruktoren
    VerbrennerPKW(String fahrzeugkennung) {
        super(fahrzeugkennung);
        anzahlVerbrennerPKW++;
    }
    VerbrennerPKW(String fahrzeugkennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String fuellstand) {
        super(fahrzeugkennung, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen);
        this.fuellstand = fuellstand;
        anzahlVerbrennerPKW++;
    }
    VerbrennerPKW(String fahrzeugkennung, int anzahlMaxInsassen, int anzahlTueren, String kfzKennzeichen, String fuellstand, int tankgroesse) {
        super(fahrzeugkennung, anzahlMaxInsassen, anzahlTueren, kfzKennzeichen);
        this.fuellstand = fuellstand;
        this.tankgroesse = tankgroesse;
        anzahlVerbrennerPKW++;

     
    }



// Getter
    public Integer getAnzahlVerbrennerPKW() {
        return anzahlVerbrennerPKW;
    }
    public String getTreibstoff() {
        return treibstoff;
    }
    public int getTankgroesse(){
    return tankgroesse;
}

// Setter
    public void setTreibstoff(String treibstoff) {
        this.treibstoff = treibstoff;
    }
    public String getFuellstand() {
        return fuellstand;
    }
    public void setFuellstand(String fuellstand) {
        this.fuellstand = fuellstand;
    }
    public void setTankgroesse(int tankgroesse) {
        this.tankgroesse = tankgroesse;
    } 
}