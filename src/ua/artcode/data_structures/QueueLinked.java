package ua.artcode.data_structures;

import java.util.Iterator;


public class QueueLinked<T> implements IQueue<T>, Iterable<T> {

    private Node head;
    private Node tail;

    @Override
    public void enqueue(T o) {
        Node temp = new Node(o, null);
        if (head == null && tail == null) {// if size  0
            tail = temp;
            head = temp;
        } else {
            tail.setNext(temp);
            tail = temp;
        }
    }

    @Override
    public T dequeue() {
        if(head == null){
            throw new LinkedQueueEmptyException("Queue is empty");
        }

        Node ret = head;
        head = head.getNext();
        return (T) ret.getVal();
    }

    public boolean contains(T val){
        for(T iter : this){
           if(iter.equals(val)){
               return true;
           }
        }
        return false;
    }

    public void compareHeadWithTail() {
        Comparable comparable = (Comparable) head.getVal();
        comparable.compareTo(tail.getVal());
    }

    public String print() {
        String res = "";
        Node iter = head;
        while (iter != null) {    //exit condition
            res += iter.getVal() + " | ";
            iter = iter.getNext();// next way
        }
        return res;
    }

    private String print(Node curr) {
        return curr == null ?
                "" : curr.getVal() + " | " + print(curr.getNext());
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedQueueIterator();
    }

    private class LinkedQueueIterator implements Iterator<T> {

        private Node iterNode = head;

        @Override
        public boolean hasNext() {
            return iterNode != null;
        }

        @Override
        public T next() {
            T val = (T) iterNode.getVal();
            iterNode = iterNode.getNext();
            return val;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String toString() {
        return print(head);
    }
}
