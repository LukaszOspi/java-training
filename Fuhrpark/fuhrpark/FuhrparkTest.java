package fuhrpark;

public class FuhrparkTest {
    public static void main(String[] args) {

        // 3 Kontruktoren ElektroPKW
        ElektroPKW elektropkw1 = new ElektroPKW("Kennung 0001");
        ElektroPKW elektropkw2 = new ElektroPKW("Kennung 0002", 5, 100);
        ElektroPKW elektropkw3 = new ElektroPKW("Kennung 0003", 5, 90, 4 );

        // 2 Konstruktoren VerbrennerPKW
        VerbrennerPKW verbrenner1 = new VerbrennerPKW("Kennung 0006");
        VerbrennerPKW verbrenner2 = new VerbrennerPKW("Kennung 0007", 5, 5, "BI200500", "8/8" );
        //Verbrenner 3 mit anderer Tankgroesse
        VerbrennerPKW verbrenner3 = new VerbrennerPKW("Kennung 0010", 4, 4, "BI70040", "6/8", 44);
        // 1 Konstruktor LKW
       LKW lkw1 = new LKW("Kennung 0005");

        // 1 Konstruktor Escooter
       Escooter escooter1 = new Escooter("Kennung 0004");

       // 2 Konstruktoren Scooter
       Scooter scooter1 = new Scooter("Kennung 0008");
       Scooter scooter2 = new Scooter("Kennung 0009", 250);

// Erwartet: 3 x ElektroPKW, 2x VerbrennerPKW, 1x LKW = 6 PKW
// Erwartet: 1x Escooter, 2x Scooter = 3x Roller
// Erwartet: 9x Fahrzeug

System.out.println("ElektroPKW: " + ElektroPKW.anzahlElektroPKW + " VerbrennerPKW: " + VerbrennerPKW.anzahlVerbrennerPKW + 
" LKW: " + LKW.anzahlLKW + " PKW gesamt: " + PKW.anzahlFahrzeuge);

System.out.println("Escooter: " + Escooter.anzahlEscooter + " Scooter: " + Scooter.anzahlScooter + " Roller gesamt: " + Roller.anzahlRoller);

System.out.println("Anzahl Fahrzeuge gesamt: " + Fahrzeug.anzahlFahrzeuge);

System.out.println("Verbrenner2 Tankgroesse: " + verbrenner2.getTankgroesse());
System.out.println("Verbrenner3 Tankgroesse: " + verbrenner3.getTankgroesse());
    }
}
