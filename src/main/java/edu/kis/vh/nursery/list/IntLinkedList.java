package edu.kis.vh.nursery.list;

public class IntLinkedList {

<<<<<<< HEAD
    public static final int RETURN_VAl = -1;
    Node last;
    int i;
=======
    private Node last;
    private int i;
>>>>>>> master

    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.prev = getLast();
            setLast(getLast().next);
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
<<<<<<< HEAD
            return RETURN_VAl;
        return last.value;
=======
            return -1;
        return getLast().value;
>>>>>>> master
    }

    public int pop() {
        if (isEmpty())
<<<<<<< HEAD
            return RETURN_VAl;
        int ret = last.value;
        last = last.prev;
=======
            return -1;
        int ret = getLast().value;
        setLast(getLast().prev);
>>>>>>> master
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }
}
