public class Calculator {

    private int accumulator;

    public Calculator() {
        this.accumulator = 0;
    }

    public Calculator(int accumulator) {
        this.accumulator = accumulator;
    }

    public Calculator plus(int x) {
        accumulator += x;
        return this;
    }

    public Calculator minus(int x) {
        accumulator -= x;
        return this;
    }

    public int result() {
        return accumulator;
    }
}
