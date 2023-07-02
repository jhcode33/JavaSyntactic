package com.jhcode.day0620.GenericsQuestions;

public class Node<T> implements Comparable<T> {

	@Override
	public int compareTo(T o) {
		return 0;
	}
	
	public static void main(String[] args) {
		Node<String> node = new Node<>();
		Comparable<String> comp = node;
	}

}
