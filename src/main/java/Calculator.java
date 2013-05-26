import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Integer> accumulators;

    public Calculator() {
        this.accumulators = new ArrayList<>();
    }

    public Calculator(int accumulator) {
        this();
        plus(accumulator);
    }

    public Calculator plus(int x) {
        accumulators.add(x);
        return this;
    }

    public Calculator minus(int x) {
        accumulators.add(-x);
        return this;
    }

    public int result() {
        Integer result = 0;
        for (Integer accumulator : accumulators) {
            result += accumulator;
        }
        return result;
    }

    public Calculator multiply(int p) {
        int accumulator = result() * p;
        accumulators.clear();
        plus(accumulator);
        return this;
    }
}
