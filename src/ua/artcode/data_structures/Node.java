package ua.artcode.data_structures;

public class Node {

    private Object val;
    private Node next;

    public Node() {
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
