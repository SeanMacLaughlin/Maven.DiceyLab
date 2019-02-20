import java.util.Random;

public class Dice {

    private Integer numberOfDice;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        for(int i = 0; i < numberOfDice; i++) {
            sum += roll();


        }
        return sum;
    }

    private Integer roll() {
        return (int) (Math.random() * 6 + 1);
    }



}
