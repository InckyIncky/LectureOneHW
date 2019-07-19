package com.javaLectureEightHW.nikolay;

public class MyLinkedList<N> {

    private N value;
    private MyNode<N> head;
    int size = 0;

    public MyNode getHead() {
        return head;
    }

    public int getSize() {return this.size; }

    public void printListMy() {
        MyNode node = head;
        while (node.getNextNode() != null) {
            System.out.print(node.getValue() + ", ");
            node = node.getNextNode();
        }
        System.out.println(node.getValue());
    }

    public void addLastNode(N value) {
        MyNode<N> resultNode = new MyNode<N>(value, null, null);
        size += 1;
        if (head == null) {
            head = resultNode;

        } else {
            MyNode<N> node = head;
            while (node.getNextNode() != null) {
                node = node.getNextNode();
            }
            node.setNextNode(resultNode);
            resultNode.setPrevNode(node.getPrevValue());
        }
    }

    public void addFirstNode(N value) {
        MyNode<N> resultNode = new MyNode<N>(value, null, null);
        size += 1;
        if (head == null) {
            head = resultNode;
        } else {
            MyNode<N> node = head;
            resultNode.setNextNode(node);
            head = resultNode;
        }
    }

//    public void addMiddleNode(int index, N value) {
//        MyNode<N> resultNode = new MyNode<N>(value, null, null);
//        MyNode<N> node = head;
//        if (index > 0 & index < this.size) {
//            for (int i = 0; i < index - 1; i ++) {
//                node = node.getNextNode();
//            }
//            node.setNextNode(resultNode);
//            resultNode.setNextNode();
//
//        }if (index == 0) {
//            addFirstNode(value);
//        }if (index == this.size) {
//            addLastNode(value);
//        }
//
//    }

    public void removeNode(N value) {

        if (head.getValue().equals(value)) {
            head = head.getNextNode();
        } else {

            MyNode<N> node = head.getNextNode();
            MyNode<N> prevNode = node.getPrevValue();
            MyNode<N> nxtNode = node.getNextNode();

            for (int i = 0; i < this.size; i++) {
                node = node.getNextNode();
                if (node.getValue().equals(value) & node.getPrevValue() == null) {
                    nxtNode.setPrevNode(null);
                    node.setNextNode(null);
                    node.setPrevNode(null);
                    node.setValue(null);
                    break;
                } else if(node.getValue().equals(value) & node.getNextNode() == null){
                    prevNode.setPrevNode(null);
                    node.setNextNode(null);
                    node.setPrevNode(null);
                    node.setValue(null);
                    break;
                }
                else if (node.getValue().equals(value)) {
                    prevNode.setNextNode(prevNode);
                    nxtNode.setPrevNode(nxtNode);
                    node.setNextNode(null);
                    node.setPrevNode(null);
                    node.setValue(null);
                    break;
                }else {
                    continue;
                }
            }

        }
    }
}
