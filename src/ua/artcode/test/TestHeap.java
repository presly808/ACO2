package ua.artcode.test;

/**
 * Created by admin on 28.10.2014.
 */
public class TestHeap {


    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
        heap.heapify(new Integer[]{18,15,9,14,11,2,7,6,12,3});
        System.out.println();
    }
}
