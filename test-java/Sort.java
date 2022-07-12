import java.util.Random;
public class Sort {

    public static int[] bubbleSortV1(int[] zr){
        for (int i = 0; i < zr.length - 1; i++) {
            for (int n = 0; n < zr.length - 1; n++) {
                if (zr[n] > zr[n + 1]) {
                    int temporaer = zr[n];
                    zr[n] = zr[n + 1];
                    zr[n + 1] = temporaer;
                }
            }
        }    
    return zr;
    }


    public static int[] bubbleSortV2(int[] zr){
        for (int i = 0; i < zr.length - 1; i++) {
            for (int n = 0; n < zr.length - i - 1; n++) { // Optimierung
            if (zr[n] > zr[n + 1]) {
                    int temporaer = zr[n];
                    zr[n] = zr[n + 1];
                    zr[n + 1] = temporaer;
                }
            }
        }    
    return zr;
    }
    public static int[] bubbleSortV3(int[] zr){
    //while Bubble Sort
    int n = 0;       
    while (n < zr.length-1) {
        if (zr[n+1] < zr[n]) {
            int temporaer = zr[n];
            zr[n] = zr[n + 1];
            zr[n + 1] = temporaer;
            n = -1;
        }
        n++;
    }
    return zr;
    }

    public static int[] bubbleSortV4(int[] zr){

        return zr;
    }

    public static int[] fuellenIntArrayRandom(int[] zr) {
        int schleifenZaehler = 0;
        Random zufallszahl = new Random();
        while(schleifenZaehler < zr.length) {
            zr[schleifenZaehler] = zufallszahl.nextInt(1001);
            schleifenZaehler ++;
        }

    return zr;
    }
    public static int[] bubbleSortV5(int[] zr){
        boolean datenSindUnsortiert = true;
        for (int i = 0; i < zr.length - 1 && datenSindUnsortiert; i++) {
            datenSindUnsortiert = false;
            for (int n = 0; n < zr.length - 1; n++) {
                if (zr[n] > zr[n + 1]) {
                    int temporaer = zr[n];
                    zr[n] = zr[n + 1];
                    zr[n + 1] = temporaer;
                    datenSindUnsortiert = true;
                  }
            }
        }  
        return zr;
    }
}