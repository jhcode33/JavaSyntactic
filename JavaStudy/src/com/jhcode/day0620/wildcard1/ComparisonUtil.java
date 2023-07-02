package com.jhcode.day0620.wildcard1;

import java.util.Arrays;
import java.util.List;

public class ComparisonUtil {
	
//	void foo(List<?> i) {
//        i.set(0, i.get(0)); // 컴파일 에러:
//        					  // List의 element가 와일드 카드(알 수 없는 타입 변수)로 
//        					  // 설정되었음.
//        				  	  // 그래서 컴파일 타임시, 당연히 에러가 발생함.
//        				   	  // E set(int index, E element);
//                            //   ->2nd Para:E(타입 변수) element
//                            //     : 그러므로 '알 수 없는 타입 변수(?)'와 
//                            //       '요소의 타입을 지정하는 타입 변수(E)' 간에   					//       
//                            //       불일치.
//        					  //  와일드 카드 캡처 변수?
//    }
	
	//== 타입 파라미터는 컴파일러에게 타입에 대한 정보를 제공한다 ==//
	public static <T> void foo(List<T> list) {
	    list.set(0, list.get(0));
	    //=> 왜 굳이 ? 카드를 사용해야 할까?
	}

	//== 아래 printList() 메소드와 비교하면서 와일드 카드 캡쳐 변수를 확인해야 함 ==//
	public static void printList(List<?> list) {
		// printList(intList); 코드로 인해 printList가 호출되었다면,
		// 실제 디버깅하면 element는 Integer 타입임.
		// : 이는 와일드 타입 캡처 변수(실제 컴파일러가 내부적으로 생성하는 임시 변수)에
		//   Object를 Integer로 캡처함
		//   (Integer 타입의 캡처 변수에 element 변수가 캐스팅됨!!!)
	    for (Object element : list) {
	        System.out.println(element.getClass());
	    }
	}
	
	//== 타입 매개변수를 사용한 printList() ==//
//	public static <T> void printList(List<T> list) {
//	    for (T element : list) {
//	        System.out.println(element.getClass());
//	    }
//	}

	//== 타입 파라미터를 두 개를 사용한 방법 ==//
	public static <T, X> void compareTwoTypeParameter(List<T> list1, List<X> list2) {
		
        if (list1.equals(list2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
	
	//== 와일드 카드를 사용한 방법 ==//
	public static void compareWildCard(List<?> list1, List<?> list2) {
		
        if (list1.equals(list2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
	
//	void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
//		Number temp = l1.get(0);
//		l1.set(0, l2.get(0)); 	// expected a CAP#1 extends Number,
//                              // got a CAP#2 extends Number;
//                              // same bound, but different types
//		l2.set(0, temp);	  	// expected a CAP#1 extends Number,
//                            	// got a Number
//    }

	//== main ==//
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Hello", "World");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        //printList(strList);
        printList(intList);
        
        //compare(strList, intList); // Not Equal

        List<Double> dblList1 = Arrays.asList(3.14, 2.718);
        List<Double> dblList2 = Arrays.asList(3.14, 2.718);
        compareTwoTypeParameter(dblList1, dblList2); 
        compareWildCard(dblList1, dblList2); // Equal
    }
}
