package fuhrpark;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// This is a superior class for all kind of vehicles!!

public class Fahrzeug {
    
    private Date kaufDatum;
    private String fahrzeugkennung;
    private double kaufPreis;
    private boolean verfuegbar;
    static int anzahlFahrzeuge = 0;
    private String kaufDatumString;
    
  
// 1 Konstruktor
    public Fahrzeug(String fahrzeugkennung) {
        this.fahrzeugkennung = fahrzeugkennung;
        anzahlFahrzeuge++;
    }

// Getter
    public static int getAnzahlFahrzeuge() {
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

    // Setter
    public void setKaufDatum(String kaufDatumString) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = myFormat.parse(kaufDatumString);
            this.kaufDatum = date;
        }
            catch (ParseException e) {
                e.printStackTrace();
              }
    
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
