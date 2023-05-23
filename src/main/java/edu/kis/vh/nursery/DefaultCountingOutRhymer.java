package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer reprezentuje implementacje stosu liczbowego
 * z ograniczeniem rozmiaru na podstawie zmiennej MAX_SIZE.
 */
public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12; // Maksymalny rozmiar stosu
    public static final int RETURN_VAL = -1; // Wartosc zwracana w przypadku pustego stosu
    public static final int INITIAL = -1; // Wartosc poczatkowa licznika stosu
    private final int[] NUMBERS = new int[MAX_SIZE]; // Tablica o rozmiarze MAX_SIZE przechowująca liczby na stosie
    private int total = INITIAL; // Tablica o rozmiarze MAX_SIZE przechowująca liczby na stosie

    /**
     * Zwraca liczbe elementow na stosie.
     *
     * @return Liczba elementow na stosie.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje liczbe na stos, jesli stos nie jest pelny.
     *
     * @param in Liczba do dodania na stos.
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return Wartosc logiczna czy stos jest pusty.
     */
    public boolean callCheck() {
        return total == INITIAL;
    }

    /**
     * Metoda sprawdzajaca czy stos jest pelny.
     *
     * @return Wartosc logiczna czy stos jest pelny.
     */
    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    /**
     * Zwraca wartosc ostatnio dodanej liczby na stosie.
     * Metoda nie zdejmuje liczby ze stosu.
     *
     * @return Wartosc ostatnio dodanej liczby na stosie.
     */
    protected int peekaboo() {
        if (callCheck())
            return RETURN_VAL;
        return NUMBERS[total];
    }

    /**
     * Zwraca wartosc ostatnio dodanej liczby na stosie.
     * Metoda zdejmuje liczbe ze stosu.
     *
     * @return Wartosc zdejmowanej liczby ze stosu.
     */
    public int countOut() {
        if (callCheck())
            return RETURN_VAL;
        return NUMBERS[total--];
    }

}
