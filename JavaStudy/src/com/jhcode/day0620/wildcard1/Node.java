package com.jhcode.day0620.wildcard1;

public class Node<T> {
	
    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
