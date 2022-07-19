package fuhrpark;

public class LKW extends Fahrzeug {
    private String kfzKennzeichen;
    private double zulaessigesGesamtgewicht;
    private double ladeVolume;
    private boolean gefahrengut;
    private boolean kuehlung;
    static int anzahlLKW = 0;

// 1 Konstruktor
    public LKW(String fahrzeugkennung) {
        super(fahrzeugkennung);
        anzahlLKW++;
    }

// Getter
    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }
  
    public double getZulaessigesGesamtgewicht() {
        return zulaessigesGesamtgewicht;
    }

    public double getLadeVolume() {
        return ladeVolume;
    }

// Setter
    public void setKfzKennzeichen(String kfzKennzeichen) {
        this.kfzKennzeichen = kfzKennzeichen;
    }
    public void setZulaessigesGesamtgewicht(double zulaessigesGesamtgewicht) {
        this.zulaessigesGesamtgewicht = zulaessigesGesamtgewicht;
    }
    public void setLadeVolume(double ladeVolume) {
        this.ladeVolume = ladeVolume;
    }
    public boolean isGefahrengut() {
        return gefahrengut;
    }
    public void setGefahrengut(boolean gefahrengut) {
        this.gefahrengut = gefahrengut;
    }
    public boolean isKuehlung() {
        return kuehlung;
    }
    public void setKuehlung(boolean kuehlung) {
        this.kuehlung = kuehlung;
    }
}