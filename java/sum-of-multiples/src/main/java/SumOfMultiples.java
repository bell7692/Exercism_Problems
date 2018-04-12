import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {

    public int number;
    public int[] set;

    public SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        int total = 0;
        Set<Integer> temp = new HashSet<>();
        for (int i = 1; i < this.number; i++) {
            for (int n = 0; n < this.set.length; n++) {
                if (i % this.set[n] == 0) {
                    temp.add(i);
                }
            }
        }
        for (Integer i :temp) {
            total += i;
        }
        return total;
    }

}
