import javax.swing.JOptionPane;


public class quadratischeGleichung {
    public static void main(String[] args) {

        double a, b, c, D;
        String first, second, third;
        first = JOptionPane.showInputDialog(null, "a =");
        second = JOptionPane.showInputDialog(null, "b =");
        third = JOptionPane.showInputDialog(null, "c =");

        a = Double.parseDouble(first);
        b = Double.parseDouble(second);
        c = Double.parseDouble(third);

        D = (b * b) - (4 * a * c);

        if (D < 0){
            JOptionPane.showMessageDialog(null, "Es gibt keine Lösung der Quadratischen Gleichung mit Zahlen  " + a + ", " + b + ", " +c);
        }
            else if (D > 0) {
                JOptionPane.showMessageDialog(null, "Es gibt zwei Lösungen der Quadratischen Gleichung für die Zahlen: " + a + ", " + b + ", " +c); 
            }
                else {
                    JOptionPane.showMessageDialog(null, "Es gibt genau eine Lösung der Quadratischen Gleichung mit Zahlen  " + a + ", " + b + ", " +c);

                }
    }
        
    }

