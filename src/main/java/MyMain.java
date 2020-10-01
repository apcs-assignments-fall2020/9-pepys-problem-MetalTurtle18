import java.util.concurrent.ThreadLocalRandom;

public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int sixes = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 6; j++) {
                if (ThreadLocalRandom.current().nextInt(1, 7) == 6) {
                    sixes++;
                    break;
                }
            }
        }
        return sixes/100D; // Not 10000 because I wanted it to be XX.X instead of 0.XXX
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int sixes = 0;
        boolean first;
        for (int i = 0; i < 10000; i++) {
            first = false;
            for (int j = 0; j < 12; j++) {
                if (ThreadLocalRandom.current().nextInt(1, 7) == 6) {
                    if (first) {
                        sixes++;
                        break;
                    }
                    else {
                        first = true;
                    }
                }
            }
        }
        return sixes/100D;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int sixes = 0;
        int previous;
        for (int i = 0; i < 10000; i++) {
            previous = 0;
            for (int j = 0; j < 18; j++) {
                if (ThreadLocalRandom.current().nextInt(1, 7) == 6) {
                    if (previous == 2) {
                        sixes++;
                        break;
                    }
                    else {
                        previous++;
                    }
                }
            }
        }
        return sixes/100D;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes()
        );
    }
}
