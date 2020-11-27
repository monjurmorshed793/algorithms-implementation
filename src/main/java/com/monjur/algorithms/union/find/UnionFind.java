package com.monjur.algorithms.union.find;

public interface UnionFind <T>{
    void union(T from, T to);

    boolean connected(T from, T to);

    T find(T node);

    int count();
}
