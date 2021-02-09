package com.collection.controller;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		
		//객체들을 저장할 수 있는 저장 구조
//	 	순서가 없고 중복이 불가능하다.(중복값 저장이 안된다.)
		
		
		HashSet set = new HashSet();
//		add() 매소드를 이용해서 값을 넣음
		set.add("유병승");
		set.add("정유정");
		set.add("김태희");
		set.add("김상현");
		set.add("김예진");
//		값은 그냥 들어가 있고, 꺼내는 것은 그냥 꺼낼 수 없어!!!
		
//		set에 저장되어있는 값을 출력하기 위해서는 
//		Iterator객체를 이용해서 출력을 함 > 출력하는 방식은 StringTokenizer와 비슷하다.
		
		Iterator it =  set.iterator();
		
			while(it.hasNext()) {
				System.out.println(it.next());
//				System.out.println(it.next());
				
//				Exception in thread "main" java.util.NoSuchElementException
//				at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1586)
//				at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1607)
//				at com.collection.controller.SetTest.main(SetTest.java:29)

//				StringTokenizer랑 완전 구조가 같은 편인데

			}
		
		
		System.out.println("\n\n중복값이 들어가니??\n");
	// set의 가장 큰 특징은 중복값을 저장하지 않는다. 
		HashSet set2 = new HashSet();
			set2.add("유병승");
			set2.add("김태희");
			set2.add("정유정");
			set2.add("김예진");
			set2.add("김상현");
			set2.add("김상현");
			set2.add("김상현");
			set2.add("김상현");
			set2.add("김상현");
			set2.add("김상현");
			set2.add("김상현");
			//Iterator로 뽑아내는 알고리즘이 정해져 있어서 꺼내는 순서가 일정하게 어느 정도는 정해져 있다.
			
			
		Iterator it2 = set2.iterator();
		
			while(it2.hasNext()) {
				System.out.println(it2.next());
			}
		
		
		/*
		 * StringTokenizer
		 * String alpha = "A,B,C,D,E,F,G"
		 * StringTokenizer st = new StringTokenizer(alpha, ",");
		 * 
		 * while(st.hasNext()){
		 * 
		 *  st.nextToken();
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 이거랑 Iterator랑 굉장히 유사하게 보이지?? 구조도 비슷하게 사용되니까 기억을 하는게 좋겠지요?
		 */
	}
}
