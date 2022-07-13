package fuhrpark;
import java.util.Date;

public class Fahrzeug {
    
    private Date kaufDatum;
    private String fahrzeugkennung;
    private double kaufPreis;
    private boolean verfuegbar;
    private int anzahlFahrzeuge = 0;

    public Fahrzeug() {
        anzahlFahrzeuge++;
    }
    public int getAnzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }
    public Date getKaufDatum() {
        return kaufDatum;
    }
    public String getFahrzeugkennung() {
        return fahrzeugkennung;
    }
    public double getKaufPreis() {
        return kaufPreis;
    }
    public boolean getVerfuegbar() {
        return verfuegbar;
    }
    public void setKaufDatum(Date kaufDatum) {
        this.kaufDatum = kaufDatum;
    }
    public void setFahrzeugkennung(String fahrzeugkennung) {
        this.fahrzeugkennung = fahrzeugkennung;
    }
    public void setKaufPreis(double kaufPreis) {
        if (kaufPreis > 0 ){
        this.kaufPreis = kaufPreis; }
        else {
            System.out.println("Der Preis muss positiv sein!");
        }
    }
    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }

}
