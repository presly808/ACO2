package ua.artcode.test;

/**
 * Created by admin on 23.10.2014.
 */
public class DynamicStructures {


    public static<E extends Comparable<E>> Node<E> genList(int index, E...arr){
        if(index == arr.length-1){
            return new Node<>(arr[index], null);
        } else {
            return new Node<>(arr[index], genList(index+1, arr));
        }
    }

    public static String printList(Node tail){
        if(tail == null){
            return "null";
        } else {
            return tail.getElement().toString() + "->" + printList(tail.getNext());
        }
    }

    public static boolean isEq(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return tailA.getElement().equals(tailB.getElement()) && isEq(tailA.getNext(), tailB.getNext());
        } else {
            return tailA == tailB;
        }
    }

    public static <E extends Comparable<E>> Node<E> copy(Node<E> tail){
        return tail == null ? null : new Node<>(tail.getElement(), tail.getNext());
    }

    public static void main(String[] args) {
        Node node1 = genList(0,1,2,3,4,5);
        Node node2 = copy(node1);

        System.out.println(printList(node1));
        System.out.println(printList(node2));

        boolean res = Functional.isGrowing(node1, node1.getElement());

        System.out.println(res);

        System.out.println("Is eq node1 and node2 " + isEq(node1, node2));


    }



}
