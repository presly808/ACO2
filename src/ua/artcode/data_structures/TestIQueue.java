package ua.artcode.data_structures;

/**
 * Created by admin on 08.11.2014.
 */
public class TestIQueue {


    public static void main(String[] args) {
        IQueue<String> queue =
                new QueueLinked<>();

        queue.enqueue("String");
        queue.enqueue("22");
        queue.enqueue("22");
        queue.enqueue("22");
        queue.enqueue("22");
        queue.enqueue("22");
        queue.enqueue("22");
        queue.enqueue("22");

        System.out.println(queue);
    }


}
