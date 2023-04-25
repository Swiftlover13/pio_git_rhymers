package edu.kis.vh.nursery.list;

public class Node {

<<<<<<< HEAD
    public final int value;
    public Node prev, next;
=======
    private int value;
    private Node prev;
    private Node next;
>>>>>>> master

    public Node(int i) {
        value = i;
    }

    public Node getPrev() {
        return prev;
    }

}
