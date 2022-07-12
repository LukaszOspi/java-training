import java.util.Random;

public class Arrays {

    public static void main(String[] args) {
        int zahlenreihe[];             // [] bedeutet eindimensionales Array 
        int schleifenZaehler = 0;        
        zahlenreihe = new int[100];


        while(schleifenZaehler < 100) {
            Random random = new Random();
            zahlenreihe[schleifenZaehler] = random.nextInt(1000);
       //     System.out.println(zahlenreihe[schleifenZaehler]);
            schleifenZaehler ++;
        }

        // bubble sort the array zahlenreihe in ascending order
        int temp;

        for(int i = 0; i < zahlenreihe.length; i++) {
            for(int j = 0; j < zahlenreihe.length - 1; j++) {
                if(zahlenreihe[j] > zahlenreihe[j + 1]) {
                    temp = zahlenreihe[j];
                    zahlenreihe[j] = zahlenreihe[j + 1];
                    zahlenreihe[j + 1] = temp;
                }
            }

    }

    // remove last comma from the output
    
    for (int k=0; k<zahlenreihe.length; k++) {
        if (k == zahlenreihe.length-1){
            System.out.println(zahlenreihe[k]);
        } else {
            System.out.print(zahlenreihe[k] + ", ");
        }
       
    }

}}