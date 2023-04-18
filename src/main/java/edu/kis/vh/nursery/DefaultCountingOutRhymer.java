package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int size = 12;
    public static final int minusOne = -1;
    private int[] NUMBERS = new int[size];

    public int total = minusOne;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == minusOne;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return minusOne;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return minusOne;
        return NUMBERS[total--];
    }

}
