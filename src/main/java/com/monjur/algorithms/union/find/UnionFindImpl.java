package com.monjur.algorithms.union.find;

import java.util.ArrayList;
import java.util.List;

public class UnionFindImpl<T> implements UnionFind<Node<T>>{

    private List<Node<T>> nodes = new ArrayList<>();

    public UnionFindImpl(List<Node<T>> nodes) {
        this.nodes = nodes;
    }

    @Override
    public void union(Node<T> from, Node<T> to) {
        from.setIndex(to.getIndex());
    }

    @Override
    public boolean connected(Node<T> from, Node<T> to) {
        return from.getIndex().equals(to.getIndex());
    }

    @Override
    public Node<T> find(Node<T> node) {
        return null;
    }

    @Override
    public int count() {
        return nodes.size();
    }
}
