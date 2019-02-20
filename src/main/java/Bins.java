import java.util.Set;
import java.util.TreeMap;

public class Bins {
    private TreeMap<Integer, Integer> totals = new TreeMap<Integer, Integer>();

    public Bins(Integer minRollValue, Integer maxRollValue) {


        for (int i = minRollValue; i <= maxRollValue; i++) {
            totals.put(i, 0);

        }
    }

    public Integer getBins(Integer key) {
        return totals.get(key);

    }

    public void incrementBin(Integer key) {
        Integer tempValue = totals.get(key);
        tempValue++;
        totals.put(key, tempValue);




    }

    public Set<Integer> getKeySet(){
        return totals.keySet();
    }

}

