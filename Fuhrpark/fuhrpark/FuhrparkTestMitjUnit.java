package fuhrpark;

import static org.junit.Assert.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.junit.Test;

public class FuhrparkTestMitjUnit {

    @Test
   public void test() {
        // fail("Not yet implemented");
    }

    
    @Test
   public void zaehlungAnzahlDerFahrzeuge() {
        Scooter meinErsterScooter = new Scooter("BX-7 z3");
        Scooter meinZweiterScooter = new Scooter("BX-7 b7");
        assertEquals(Fahrzeug.getAnzahlFahrzeuge() ,2);
    }

    @Test
    public void keineNegAccuKapazitaet() {
        Escooter meinEscooter = new Escooter("Kennuntg XYZ");
        meinEscooter.setAkkuKapazitaet(-40);
        assertTrue("Accukapazitaet ist negative", meinEscooter.getAkkuKapazitaet() >= 0);
    }
    @Test
    public void keineZuHoheAccuKapazitaet() {
        Escooter meinEscooter = new Escooter("Kennuntg XYZ");
        meinEscooter.setAkkuKapazitaet(120);
        assertTrue("Accukapazitaet ist zu hoch", meinEscooter.getAkkuKapazitaet() <= 100);
    }
    
    @Test
    public void keineNegKaufPreis() {
        Escooter meinEscooter = new Escooter("Kennuntg XYZ");
        meinEscooter.setKaufPreis(-40);
        assertTrue("Kaufpreis ist negative", meinEscooter.getKaufPreis() >= 0);
    }
    
    
    @Test
    public void keineNegKaufPreisFuerRoller() {
        Roller meinRoller = new Roller("Kennuntg XYZ");
        meinRoller.setKaufPreis(-40);
        assertTrue("Kaufpreis ist negative", meinRoller.getKaufPreis() >= 0);
    }
    
    @Test
    public void keineNegKaufPreisFuerFahrzeug() {
        Fahrzeug meinFahrzeug = new Fahrzeug("Kennuntg XYZ");
        meinFahrzeug.setKaufPreis(-40);
        assertTrue("Kaufpreis ist negative", meinFahrzeug.getKaufPreis() >= 0);
}
    @Test
    public void VerbrennerPKWgetterTest(){
        VerbrennerPKW meinVerbrennerPKW = new VerbrennerPKW("BX-7 z3", 4, 5, "BI-400KC", 90);
        assertEquals("BX-7 z3", meinVerbrennerPKW.getFahrzeugkennung());
        assertEquals(4, meinVerbrennerPKW.getAnzahlMaxInsassen());
        assertEquals(5, meinVerbrennerPKW.getAnzahlTueren());
        assertEquals("BI-400KC", meinVerbrennerPKW.getKfzKennzeichen());
        assertEquals(90, meinVerbrennerPKW.getFuellstand());
    }

    @Test
    public void VerbrennerPKWSetterTest(){
        VerbrennerPKW meinVerbrennerPKW = new VerbrennerPKW("BX-7 z3", 4, 5, "BI-400KC", 90);
        meinVerbrennerPKW.setFahrzeugkennung("BX-7 z3");
        meinVerbrennerPKW.setAnzahlMaxInsassen(4);
        meinVerbrennerPKW.setAnzahlTueren(5);
        meinVerbrennerPKW.setKfzKennzeichen("BI-400KC");
        meinVerbrennerPKW.setFuellstand(90);
        assertEquals("BX-7 z3", meinVerbrennerPKW.getFahrzeugkennung());
        assertEquals(4, meinVerbrennerPKW.getAnzahlMaxInsassen());
        assertEquals(5, meinVerbrennerPKW.getAnzahlTueren());
        assertEquals("BI-400KC", meinVerbrennerPKW.getKfzKennzeichen());
        assertEquals(90, meinVerbrennerPKW.getFuellstand());
    }

    @Test
    public void LKWsetterTest(){
        LKW meinLKW = new LKW("BX-7 z3");
        meinLKW.setFahrzeugkennung("BX-7 z3");
        
        meinLKW.setKfzKennzeichen("BI-400KC");
        meinLKW.setGefahrengut(true);
        meinLKW.setZulaessigesGesamtgewicht(12.5);
        meinLKW.setLadeVolume(16.8);
        meinLKW.setKuehlung(true);

        assertEquals("BX-7 z3", meinLKW.getFahrzeugkennung());
        assertEquals("BI-400KC", meinLKW.getKfzKennzeichen());
        assertEquals(true, meinLKW.isGefahrengut());
        assertEquals(12.5, meinLKW.getZulaessigesGesamtgewicht(), 0.01);
        assertEquals(16.8, meinLKW.getLadeVolume(), 0.01);
        assertEquals(true, meinLKW.isKuehlung());

    }

    @Test   
    public void PKWsetKaufDatumTest() throws ParseException{
        // create new object of type PKW
        PKW meinPKW = new PKW("BX-7 z3");
        // set the date
        meinPKW.setKaufDatum("26.08.1999");
        // create a new SimpleDateFormat object with the pattern "dd MM yyyy"
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        // create a new Date object with the date "26 08 1999"
        Date date = myFormat.parse("26.08.1999");
        // compare the date of the object with the date of the string
        assertEquals(date, meinPKW.getKaufDatum());
   
    }



}