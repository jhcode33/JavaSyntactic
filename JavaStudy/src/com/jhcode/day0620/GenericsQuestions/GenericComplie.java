package com.jhcode.day0620.GenericsQuestions;

public class GenericComplie {
	public static <T> T max(T x, T y) {
	//컴파일 시 타입이 확실하지 않기 때문에 연산자를 사용할 수 없다.
	//연산자는 primitive 타입만 적용된다.
	//	return x > y ?  x : y;
	//강제 형변환해서 인식할 수 있긴 하지만, String 문자열 타입 등이 올 수 있으므로
	//바람직한 코드는 아니다.
		return (Integer) x > (Integer) y ? x : y;
	}

}
