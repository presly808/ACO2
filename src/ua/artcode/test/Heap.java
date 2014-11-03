package ua.artcode.test;

/**
 * Created by admin on 28.10.2014.
 */
public class Heap<T extends Comparable> {

    private Node root;

    public void heapify(T[] mas){
        root = heapify(1, mas);
    }

    public Node heapify(int index, T[] mas){
        if(index > mas.length) {
            return null;
        }
        return new Node(mas[index-1], index ,heapify(index * 2, mas), heapify(index * 2 + 1, mas));
    }


    @Override
    public String toString() {
        return "Heap{" +
                "root=" + root +
                '}';
    }

    private class Node {
        T value;
        int index;
        Node lChild;
        Node rChild;

        private Node() {
        }

        private Node(T value, int index, Node lChild, Node rChild) {
            this.value = value;
            this.index = index;
            this.lChild = lChild;
            this.rChild = rChild;
        }
    }

}
