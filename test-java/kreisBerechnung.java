import javax.swing.JOptionPane;

public class kreisBerechnung {
    public static void main(String[] args) {
        double radius, umfang, flaeche;
        String einheit, eingabe;
        eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
        einheit = eingabe;
        umfang = 2.0 * 3.1415926 * radius;
        flaeche = 3.1415926 * radius * radius;
        JOptionPane.showMessageDialog(null,
                "Umfang: "
                        + umfang
                        + " "
                        + einheit
                        + "\nFläche: "
                        + flaeche
                        + " "
                        + einheit
                        + '\u00b2');
    }
}