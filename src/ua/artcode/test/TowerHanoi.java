package ua.artcode.test;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/**
 * Created by admin on 23.10.2014.
 */
public class TowerHanoi {

    private Stack<String> towerA = new Stack<>();
    private Stack<String> towerB = new Stack<>();
    private Stack<String> towerC = new Stack<>();
    private int size;


    public TowerHanoi(int size) {
        this.size = size;
        int code = 'A';
        int range = code + size;
        while (range >= code) {
            towerA.push(String.valueOf((char) range));
            range--;
        }
    }

    public TowerHanoi(Stack<String> towerA, Stack<String> towerB, Stack<String> towerC, int size) {
        this.towerA = towerA;
        this.towerB = towerB;
        this.towerC = towerC;
        this.size = size;
    }

    public void move() {
        printTowers();
        move(towerA, towerB, towerC, towerA.size());
    }

    public void move(Stack towerA, Stack towerB, Stack towerC, int size) {
        if (size == 1) {
            towerC.push(towerA.pop());
            printTowers();
            sleepWrapped();
        } else {
            move(towerA, towerC, towerB, size - 1);
            towerC.push(towerA.pop());
            printTowers();
            sleepWrapped();
            move(towerB, towerA, towerC, size - 1);
        }
    }

    private void sleepWrapped(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printTowers() {
        StringBuilder sb = new StringBuilder();
        ListIterator iterA = towerA.listIterator(towerA.size());
        ListIterator iterB = towerB.listIterator(towerB.size());
        ListIterator iterC = towerC.listIterator(towerC.size());

        for (int i = this.size; i > 0; i--) {
            sb.append((i <= towerA.size() ? iterA.previous() : " ")).append(" | ");
            sb.append((i <= towerB.size() ? iterB.previous() : " ")).append(" | ");
            sb.append((i <= towerC.size() ? iterC.previous() : " ")).append(" | ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static <E> Stack<E> genStack(E...arr){
        Stack<E> stack = new Stack<>();
        for(E e : arr){
            stack.push(e);
        }
        return stack;
    }


    public static void main(String[] args) {


        TowerHanoi towerHanoi = new TowerHanoi(4);
        //towerHanoi.printTowers();
        towerHanoi.move();
    }


}
