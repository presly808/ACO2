package ua.artcode.data_structures;

import java.util.Arrays;

/**
 * Created by admin on 08.11.2014.
 */
public class TestNode {

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};
        Node tail = genChain(mas);
        Node reversed = reverseChain(tail);
        System.out.println(print(reversed));

    }

    public static Node genChain(int[] mas) {
        if (mas.length == 0) { //exit from recursion
            return null;
        }

        int[] newMas = Arrays.copyOfRange(mas, 1, mas.length);
        Node returned = genChain(newMas);

        return new Node(mas[0], returned);

    }

    public static Node copy(Node tail){
        return tail == null ? null : new Node(tail.getVal(), copy(tail.getNext()));
    }

    public static Node genChainLoop(int[] mas) {

        if (mas == null || mas.length == 0) {
            return null;
        }

        Node head = new Node();
        head.setVal(mas[0]);
        Node last = head;

        for (int i = 1; i < mas.length; i++) {
            Node temp = new Node();//create new node
            temp.setVal(mas[i]);//set value to node
            last.setNext(temp);//link node to chain
            last = temp;
        }

        return head;
    }

    public static Node reverseChain(Node head) {
        Node tail = head;
        Node curr = tail.getNext();
        tail.setNext(null);
        Node buff = null;
        while (curr != null) {
            buff = curr.getNext();//1
            curr.setNext(tail);
            tail = curr;
            curr = buff;
        }
        return tail;
    }

    private static String print(Node curr) {
        return curr == null ?
                "" : curr.getVal() + " | " + print(curr.getNext());
    }
}
