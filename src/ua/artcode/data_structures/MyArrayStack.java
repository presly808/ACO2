package ua.artcode.data_structures;

public class MyArrayStack implements IStack {

    private Object[] mas;
    private int top = 0;

    public MyArrayStack() {
        mas = new Object[10];
    }

    public MyArrayStack(int size) {
        this.mas = new Object[size];
    }

    @Override
    public void push(Object obj) {
        mas[top++] = obj;
    }

    @Override
    public Object pop() {
        return mas[--top];
    }
}
