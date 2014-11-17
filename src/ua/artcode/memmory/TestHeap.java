package ua.artcode.memmory;

import ua.artcode.data_structures.Node;

/**
 * Created by admin on 15.11.2014.
 */
public class TestHeap {

    public static void test1(){
        Node node = new Node(null, null);
        while (true){
            Node temp = new Node(78,null);
            node.setNext(temp);
            node = temp;
        }
    }

    public static void test2(){
        Node node = new Node(new int[1000], null);
        while (true){
            Node temp = new Node(new int[10000] ,null);
            temp.setNext(node);
            node = temp;
        }
    }

    public static void main(String[] args) {
        test2();
    }

}
