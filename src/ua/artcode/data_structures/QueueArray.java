package ua.artcode.data_structures;

/**
 * Created by admin on 08.11.2014.
 */
public class QueueArray<E> implements IQueue<E> {

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


}
