import java.util.Random;

import javax.swing.JOptionPane;

public class cube {

    public static int guess(int bound) {
        Random random = new Random();
        int guess = random.nextInt(bound);
        guess++;
        return guess;
    }

    public static int wuerfel() {

        int counter = 0;
        int guess = guess(6);

        do {
            counter++;
            guess = guess(6);

        }

        while (guess != 6);

        return counter;
    };

    public static void main(String[] args) {

        int numberFromTrials = 0;

        // it calculates statistics of throwing 6 in Java Random

        for (int i = 0; i < 10000000; i++) {
            numberFromTrials = numberFromTrials + wuerfel();
        }
        ;
        float statistic = (float) numberFromTrials / 10000000 / 6;

        System.out.println(statistic);
        JOptionPane.showMessageDialog(null, "Statistics of guessing 6 (out of 6): " + statistic);
    }
}
