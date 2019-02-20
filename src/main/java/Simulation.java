import java.util.Set;

public class Simulation {
    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Dice die1;
    private Bins bin1;
    private double value;
    private Integer key;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        die1 = new Dice(numberOfDies);
        bin1 = new Bins(numberOfDies, (numberOfDies * 6));


    }

    public void runSimulation() {

        for (int i = 0; i < numberOfTosses; i++) {
            Integer val = die1.tossAndSum();
            bin1.incrementBin(val);
        }
    }

    public double percentage(Integer x, Integer y) {
        double percentage = (double) x / (double) y;
        return percentage;

    }

    public void printResults() {
        Set<Integer> KeySet = bin1.getKeySet();
        String output = "***\n" +
                "simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.\n" +
                "***\n\n";


        for (Integer key : KeySet) {
            this.key = key;
            output += String.format("%2d :%9d : %.2f \n", key, bin1.getBins(key), percentage(bin1.getBins(key), numberOfTosses)/*, stars((bin1.getBins(key) / numberOfTosses))*/);
            System.out.println((double) (bin1.getBins(key) / numberOfTosses));

        }

        System.out.println(output);
    }


/*
    private String stars(Bins bin1) {

        String stars = "";
        for (int i = 0; i < percentage(bin1.getBins(key), numberOfTosses); i += 0.01) {
            stars = stars + "*";
        }
        return stars;
    } */

}


