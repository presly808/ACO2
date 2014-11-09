package ua.artcode.data_structures;

/**
 * Created by admin on 08.11.2014.
 */
public class QueueLinked<T> implements IQueue<T> {

    private Node head;
    private Node tail;

    @Override
    public void enqueue(T o) {
        Node temp = new Node(o, null);
        if(head == null && tail == null){// if size  0
            tail = temp;
            head = temp;
        } else {
            tail.setNext(temp);
            tail = temp;
        }
    }

    @Override
    public T dequeue() {
        Node ret = head;
        head = head.getNext();
        return (T) ret.getVal();
    }



    public String print(){
        String res = "";
        Node iter = head;
        while (iter != null){    //exit condition
            res += iter.getVal() + " | ";
            iter = iter.getNext();// next way
        }
        return res;
    }

    private String print(Node curr){
        return curr == null ?
                "" : curr.getVal() + " | " +  print(curr.getNext());
    }

    @Override
    public String toString() {
        return print(head);
    }
}
