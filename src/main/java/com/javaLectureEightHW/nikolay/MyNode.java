package com.javaLectureEightHW.nikolay;

public class MyNode<N> {
    private N value;
    private MyNode<N> prev;
    private MyNode<N> next;

    MyNode(N value, MyNode<N> prev, MyNode<N> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public N getValue() {return value; }
    public MyNode getNextNode() {return next; }
    public MyNode getPrevNode() {return prev; }
    public void setValue(N value) { this.value = value; }
    public void setNextNode(MyNode<N> next) {this.next = next; }
    public void setPrevNode(MyNode<N> prev) {this.prev = prev; }

}
