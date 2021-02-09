package com.collection.controller;

import java.util.LinkedList;

public class LinkedListTest {
// ArrayList랑 똑같은데 메소드에서 조금 차이가 나는 편임
	public static void main(String[] args) {
		
		LinkedList linkList = new LinkedList();
		linkList.add("유병승");
		linkList.add("김상현");
		linkList.add("정유정");
		linkList.add("김예진");
		
		
			System.out.println("\n\nfor-each\n");
		 	for(Object o : linkList) {
		 		System.out.println(o);
		 	}
		 	
		 	System.out.println("\n\nfor\n");
		 	for( int j= 0; j<linkList.size(); j++) {
		 		System.out.println(linkList.get(j));
		 	}
		 	
		 	System.out.println("\n\nfir/last\n");
		 	System.out.println(linkList.getFirst());
		 	System.out.println(linkList.getLast());
		 	System.out.println(linkList.pop()); //신기방기하네여?
		 	System.out.println(linkList);
		 	
		 	
		 	
		 	
		 	
		 	
//		 	구조는 유사한데 앞/뒤 주소값을 가지느냐 아니느냐에 따라 조금 다름
		 	
	}
	
	
	
}
