package com.javaLectureEightHW.nikolay;

public class MyLinkedList<N> {

    private N value;
    private MyNode<N> head;
    private int size = 0;

    public MyNode getHead() {
        return head;
    }

    public int getSize() {
        return this.size;
    }

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
            resultNode.setPrevNode(node.getPrevNode());
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

    public void addNodeByIndex(int index, N value) {
        MyNode<N> resultNode = new MyNode<N>(value, null, null);
        MyNode<N> node = head;
        size += 1;
        if (index > 0 & index < this.size) {
            for (int i = 0; i < index - 1; i++) {
                node = node.getNextNode();
            }
            resultNode.setNextNode(node.getNextNode());
            resultNode.setPrevNode(node);
            node.setNextNode(resultNode);


        }
        if (index == 0) {
            addFirstNode(value);
        }
        if (index == this.size) {
            addLastNode(value);
        }

    }


    public void removeFirstNode() {
        head = head.getNextNode();
        this.size -= 1;
    }

    public void removeNode(N value) {
        this.size -= 1;
        if (head.getValue().equals(value)) {
            this.removeFirstNode();

        } else {

            MyNode<N> node = head.getNextNode();
            MyNode<N> prevNode = node.getPrevNode();
            MyNode<N> nxtNode = node.getNextNode();

            for (int i = 0; i < this.size; i++) {

                if (node.getValue().equals(value) && nxtNode == null) {
                    prevNode.setPrevNode(null);
                    node.setPrevNode(null);
                    node.setValue(null);
                    break;
                } else if (node.getValue().equals(value)) {
                    prevNode.setNextNode(nxtNode);
                    nxtNode.setPrevNode(prevNode);
                    node.setNextNode(null);
                    node.setPrevNode(null);
                    node.setValue(null);
                    break;
                }
                prevNode = node;
                node = node.getNextNode();
                nxtNode = node.getPrevNode();

            }

        }
    }
}
