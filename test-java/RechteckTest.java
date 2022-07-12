import javax.swing.JOptionPane;
public class RechteckTest {

    public static void main(String[] args) {
        String eingabe, einheit;
        double laenge, breite;
        eingabe = JOptionPane.showInputDialog("Geben Sie die Länge ein:");
        laenge = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie die Breite ein:");
        breite = Double.parseDouble(eingabe);

        Rechteck rechteck1 = new Rechteck(laenge, breite);
        System.out.println("Lange Seite: " + rechteck1.getLangeSeite());
        System.out.println("Kurze Seite: " + rechteck1.getKurzeSeite());
        System.out.println("Diagonale: " + rechteck1.getDiagonale());
        System.out.println("Umfang: " + rechteck1.getUmfang());
        System.out.println("Fläche: " + rechteck1.getFlaeche());
        rechteck1.laengeVerkleinern(5);
       System.out.println(rechteck1.getLangeSeite());

        System.out.println();
        // rechteck1.laengeAusgeben();
        }

}