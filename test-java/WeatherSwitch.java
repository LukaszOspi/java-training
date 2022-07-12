import javax.swing.JOptionPane;

public class WeatherSwitch {
    
    public static void main(String[] args) {
        String tempBerlin, tempHamburg, tempMuenchen;
            tempBerlin = "16 Grad";
            tempHamburg = "14 Grad";
            tempMuenchen = "17 Grad";
        
            Object[] selectionValues = { "Berlin", "Hamburg", "München" };
            String initialSelection = "Berlin";
            Object selection = JOptionPane.showInputDialog(null, "Zeige aktuelle temperatur für: ",
                "Wetterlage", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            System.out.println(selection);
            String selectionString = selection.toString();

            switch (selectionString) {
                case  "Berlin":
                        JOptionPane.showMessageDialog(null, "Heutige Temperatur in Berlin ist: " + tempBerlin);
                        break;
                        case  "Hamburg":
                        JOptionPane.showMessageDialog(null, "Heutige Temperatur in Hamburg ist: " + tempHamburg);
                        break;
                        case  "München":
                        JOptionPane.showMessageDialog(null, "Heutige Temperatur in München ist: " + tempMuenchen);
                        break;
                default: 
                System.out.println("Nichts");
            };
    }



}

