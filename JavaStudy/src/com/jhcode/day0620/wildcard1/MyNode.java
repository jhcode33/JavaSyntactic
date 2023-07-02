package com.jhcode.day0620.wildcard1;

import java.util.ArrayList;
import java.util.List;

public class MyNode extends Node<Integer> {
	public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
    
	public static void main(String[] args) {
		MyNode mn = new MyNode(5);
		Node n = mn;            // A raw type - compiler throws an unchecked warning
		n.setData("Hello");     // Causes a ClassCastException to be thrown.
		Integer x = mn.data;  
		List<String>[] array = new ArrayList[5];
		
		List<String> stringList = new ArrayList<>(); //type Inference
        List<?> unboundedList = stringList; // 와일드카드로 비검증 가능한 타입 사용

        //unboundedList.add(10); // 힙 오염 발생: 잘못된 유형의 객체를 추가

        String value = stringList.get(0);
	}
	
}