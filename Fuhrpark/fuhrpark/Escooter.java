package fuhrpark;
public class Escooter extends Roller{
    
    static int anzahlEscooter = 0;
    private String accuType;
    private String kfzKennzeichen;
    private int akkuKapazitaet;

// 1 Konstruktor
    public Escooter(String fahrzeugkennung) {
        super(fahrzeugkennung);
        anzahlEscooter++;
    }

// Getter
    public int getAnzahlEscooter() {
        return anzahlEscooter;
    }
    public String getAccuType() {
        return accuType;
    }
    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }
    public int getAkkuKapazitaet() {
        return akkuKapazitaet;
    }

// Setter
 
    public void setAccuType(String accuType) {
        this.accuType = accuType;
    }
    public void setKfzKennzeichen(String kfzKennzeichen) {
        this.kfzKennzeichen = kfzKennzeichen;
    }
    public void setAkkuKapazitaet(int akkuKapazitaet) {
        if (akkuKapazitaet >=0 && akkuKapazitaet <= 100){
            this.akkuKapazitaet = akkuKapazitaet;
        }
        else {
            akkuKapazitaet = 0;
            System.out.println("Die Akkukapazitaet muss zwischen 0 und 100 liegen!");
        }
      
    }

}
