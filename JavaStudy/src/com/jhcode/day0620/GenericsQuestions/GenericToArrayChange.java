package com.jhcode.day0620.GenericsQuestions;

public class GenericToArrayChange {
	
	//T 타입의 배열을 반환하고, T타입의 배열을 매개변수로 가지는 메소드이다.
	//제네릭으로 T를 선언했기 때문에 메소드 범위 안에서 T를 사용할 수 있다.
	public static <T> T[] changeToPosition(T[] str) {
		for (int i = 0; i < str.length-1; i++) {
			//배열의 i번째의 수를 임시 변수에 담는다.
			T temp = str[i];
			//배열의 i번째에 배열의 i+1번 째의 수를 담는다.
			str[i] = str[i+1];
			//배열의 i+1번째 수에 임시 변수(배열의 i번째 수)를 담는다.
			str[i+1] = temp;
		}
		return str;
	}
	
	public static void main(String[] args) {
		GenericToArrayChange gta = new GenericToArrayChange();
		String[] str = {"가", "나", "다", "라"};
		String[] result = changeToPosition(str);
		for(String rs : result) {
			System.out.println(rs);
		}
	}
}
