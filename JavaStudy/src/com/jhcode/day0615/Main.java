package com.jhcode.day0615;

public class Main {

	public static void main(String[] args) {
	
		String[] array = {"A", "B", "C"};
        int arrayLength = varargsExample(array);
        System.out.println(arrayLength);
        
        Integer[] intArray = new Integer[5];
        for(int i = 0; i < intArray.length; i++) {
        	intArray[i] = i + 1;
        }
        
        int intArrayLenght = varargsExample(intArray);
        System.out.println(intArrayLenght);
        
	}
	
	//호출자에서 매개변수로 넘어올 배열의 타입을 정의한다.
	//해당 배열의 length를 반환한다.int로 반환된다.
	//기본형 타입 배열은 컴파일 시 T로 해석되기 때문에 제대로된 배열의 타입을 이해할 수 없다.
	//힙 오염이 발생했다.
	//배열일 경우
	public static <T> int varargsExample(T...varargs) {
		int result = varargs.length;
		return result;
	}

}
