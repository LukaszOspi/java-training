
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;


public class WetterApp {
    public static void main(String[] args) throws IOException, ParseException  {

// declare locations of different cities

String locationBerlin, locationHamburg, locationMuenchen, location;

locationBerlin = "lat=52.52&lon=13.40";
locationHamburg = "lat=53.55&lon=9.99";
locationMuenchen = "lat=48.13&lon=11.57";
location = "";


Object[] selectionValues = { "Berlin", "Hamburg", "München" };
String initialSelection = "Berlin";
Object selection = JOptionPane.showInputDialog(null, "Zeige aktuelle temperatur für: ",
    "Wetterlage", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
String selectionString = selection.toString();

// ask user for city and then attach its location to API URL

switch (selectionString) {
    case  "Berlin":
            location = locationBerlin;
            break;
            case  "Hamburg":
           location = locationHamburg;
            break;
            case  "München":
            location = locationMuenchen;
            break;
    default: 
    System.out.println("Nichts");
};

// depending on user's choice, an appropriate location is being used for an API call

        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?"+location+"&appid=a8b6d11e8092451401085374323733cd");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        
        //Getting the response code
        int responsecode = conn.getResponseCode();
        System.out.print("Response code: " +  responsecode + " ");
        
        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {
          
            String inline = "";
            Scanner scanner = new Scanner(url.openStream());
          
           //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
               inline += scanner.nextLine();
            }
            
            //Close the scanner
            scanner.close();
        
            //Using the JSON simple library parse the string into a json object
            JSONParser parse = new JSONParser();
            JSONObject data_obj = (JSONObject) parse.parse(inline);
        
            //Get the required object from the above created object
           Object obj =(Object)data_obj.get("main");


            String obj2 = obj.toString(); 

       
// regex splits the result from JSON into an array, regarding the ":" as a separator

 String [] array = obj2.split(":");

 // all of those sympbols are removed from an array

 String strNew = array[1].replaceAll("([a-z]|[_]|[,]|[\"])", ""); 

 // here you get a temperature value

 Double temp = Double.valueOf(strNew);

 System.out.println(temp);

 // temperature is provided in kelvin, convert to celsius

  temp = temp - 273.15;

 // round the temperature in celsius to two decimal places 

 Double tempCelsiusRound = Math.round(temp * 100.0) / 100.0;

 // display the result depending on the initial choice

 switch (selectionString) {
    case  "Berlin":
            JOptionPane.showMessageDialog(null, "Heutige Temperatur in Berlin ist: " + tempCelsiusRound + " Grad Celsius");
            break;
            case  "Hamburg":
            JOptionPane.showMessageDialog(null, "Heutige Temperatur in Hamburg ist: " + tempCelsiusRound + " Grad Celsius");
            break;
            case  "München":
            JOptionPane.showMessageDialog(null, "Heutige Temperatur in München ist: " + tempCelsiusRound + " Grad Celsius");
            break;
    default: 
    System.out.println("Nichts");
};
}}};




