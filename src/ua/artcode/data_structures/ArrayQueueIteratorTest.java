package ua.artcode.data_structures;

import java.util.Iterator;

/**
 * Created by admin on 09.11.2014.
 */
public class ArrayQueueIteratorTest {

    public static void main(String[] args) {
        QueueArray<Integer> queueArray = new QueueArray<>();
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        queueArray.enqueue(5);

        System.out.println("Manual using of iterator");
        Iterator<Integer> iterator = queueArray.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("For each");
        for(Integer i : queueArray){ // use iterator for this construction
            System.out.println(i);
        }

    }


}
