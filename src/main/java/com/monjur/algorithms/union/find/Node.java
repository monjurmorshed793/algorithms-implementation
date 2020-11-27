package com.monjur.algorithms.union.find;

public class Node<T> {
    private Integer index;

    private T nodeObject;

    public Node(Integer index, T nodeObject) {
        this.index = index;
        this.nodeObject = nodeObject;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public T getNodeObject() {
        return nodeObject;
    }

    public void setNodeObject(T nodeObject) {
        this.nodeObject = nodeObject;
    }
}
