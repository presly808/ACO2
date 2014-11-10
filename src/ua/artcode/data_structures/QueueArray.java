package ua.artcode.data_structures;

import java.util.Iterator;

/**
 * Created by admin on 08.11.2014.
 */
public class QueueArray<E> implements IQueue<E>, Iterable<E> {

    private E[] mas;
    private int head;
    private int tail;

    public QueueArray(){
        mas = (E[]) new Object[10];
    }

    @Override
    public void enqueue(E o) {
        mas[tail++] = o;
    }

    @Override
    public E dequeue() {
        E o = mas[head++];
        return o;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueArrayIterator();
    }

    private class QueueArrayIterator implements Iterator<E> {

        int iter = head;

        @Override
        public boolean hasNext() {
            return iter < tail;
        }

        @Override
        public E next() {
            return mas[iter++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


}
