package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;

    public static final int MINUS_ONE = -1;

    public static final int INITIAL = -1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == MAX_SIZE + INITIAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return INITIAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL;
        return NUMBERS[total--];
    }

}
