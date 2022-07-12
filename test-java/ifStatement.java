import javax.swing.JOptionPane;

public class ifStatement {
    public static void main(String[] args) {
        double alter;
        String eingabe;
        eingabe = JOptionPane.showInputDialog(null, "Geben Sie Ihr alter ein: ");
        alter = Double.parseDouble(eingabe);

        if (alter < 18) {
            JOptionPane.showMessageDialog(null, "Du bist zu jung! ");
        }
        else {
            JOptionPane.showMessageDialog(null, "Alt genug, hier nudes: ");
        }

    }
}
