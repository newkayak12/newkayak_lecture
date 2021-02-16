package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.Book;

public class GenericTest {
	public static void main(String[] args) {
//		기본 제네릭 알아보기
//		<자료형>으로 제네릭에 대한 자료형을 선언함.
//		우리는 주로 Collection이나 Map을 상대로 사용함.
			System.out.println("\n\n list");
//			list에서 제네릭 이용	
		
//		******* 제네릭을 안 쓰고 ************
		ArrayList names = new ArrayList();  //  이름을 저장하기 위한 변수
		names.add("유병승");
		names.add("김상현");
		names.add("정유정");
		names.add(19); //? 내가 원하는게 아닌데??
		
			for( Object o : names) {
//				String name = (String) o;
//				System.out.println(name.charAt(0));
				
				
//		Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//		at com.generic.controller.GenericTest.main(GenericTest.java:17)
			}
			
			
//			*********** 제네릭을 써보면?? *************
			
			
			
			ArrayList<String> names2 = new ArrayList<>();  //  이름을 저장하기 위한 변수
			names2.add("유병승");
			names2.add("김상현");
			names2.add("정유정");
			
//			names2.add(19); //제네릭을 쓰니까 컴파일러가 검사를 하네?
			
				for( String o : names2 ) {
						System.out.println(o.charAt(0));
					
					
				}
				
				
				
			List<Book> books = new ArrayList<>();
			
			books.add(new Book("java의 정석", "남궁성", 34000, 0.5));
			books.add(new Book("노인과 바다", "헤밍웨이", 12000, 1.5));
			books.add(new Book("어린 왕자", "생텍쥐베리", 10000, 2.5));
				
				// books에 저장된 책들의 이름과 가격을 출력하라
				
				
				
				for(int i =0; i<books.size(); i++) {
					System.out.println(books.get(i).getTitle()+ " " + books.get(i).getPrice());
				}
				
				
				for(Book book : books) {
					System.out.println(book.getTitle()+" "+book.getPrice());
				}
				
				
					
//		컴파일 시점에서 에러체크도 하고 사용 할 때 형변환도 없어서...
				
				System.out.println("\n\n set");
//				Set에서 제네릭을 이용
				
				System.out.println("\n 제네릭을 사용");
//				제네릭 사용 안 함
		Set set = new HashSet();
		set.add("김지한");
		set.add("정인채"); 
		set.add("이진주");
		set.add("유병승");
		
		Iterator it = set.iterator();
			while(it.hasNext()) {
				Object o = it.next();
				
				String name = (String) o;
				System.out.println(name.charAt(0));
			}
			
				System.out.println("\n 제네릭을 사용");
//				제네릭을 사용함
		Set<String> set2 = new HashSet<>();
		set2.add("김지한");
		set2.add("정인채"); 
		set2.add("이진주");
		set2.add("유병승");
		
		Iterator<String> it2 = set2.iterator();
			while(it2.hasNext()) {
				System.out.println(it2.next().charAt(0));
			}
//		set은 forEach문을 이용해서 값을 받을 수 있음
			
				System.out.println("\n for each로 iterator skip");
			for( String name : set2	) {
//				이러면 iterator 없이 사용 가능
				System.out.println(name.charAt(0));
			}
			
			
			
//			객체를 한 번 받아 봤습니다.
			Set<Book> bookSet = new HashSet<>(books);
			
			for(Book b : bookSet) {
				System.out.println(b);
			}
			
			
			
//		***************Map
			
			Map map = new HashMap();
			
			map.put(1, "사과");
			map.put(2, "배");
			map.put(3, "포도");

				System.out.println("\n\n 제네릭이 뭐야?");
//			*** 1 번째 방법
		 	Set k = map.keySet();
		 	
			 	for( Object ki : k) {
			 		Integer ky = (Integer) ki;
			 		System.out.print(ky+" : ");
			 		System.out.println(map.get(ky));
			 	}
			 	System.out.println();
//				*** 2 번째 방법
		 	Set<Map.Entry<Integer, String>> temp = map.entrySet();
		 		for( Object o : temp) {
		 			System.out.print(((Map.Entry<Integer, String>) o).getKey()+" : ");
		 			System.out.println(map.get(((Map.Entry<Integer, String>) o).getKey()));
		 		}
		 		System.out.println("\n\n제네릭 사용");
//		*********본격적으로 제네릭 사용	
//		 		****** 1번째 방법
			HashMap<Integer, String> map2 = new HashMap();
			map2.put(1, "하나");
			map2.put(2, "둘");
			map2.put(3, "셋");
			
			Set<Integer> key2 = map2.keySet();
//			이게 조금 재밌는 부분이니까 이 부분은 꼭 기억하면 편할 거야
			Iterator<Integer> it4 = key2.iterator();
			
			while(it4.hasNext()) {
				int a = it4.next();
					System.out.println(a + " : " + map2.get(a));
			}
			System.out.println();
//			********EntrySet
//				******* 2번째 방법
			
			
			Set<Map.Entry<Integer, String>> entry = map2.entrySet();
			Iterator<Map.Entry<Integer, String>> its = entry.iterator();
				while(its.hasNext()) {
					Map.Entry<Integer, String>  kis = its.next();
					int kiz = kis.getKey();
						System.out.print(kiz +" : ");
					String values = map2.get(kiz);
						System.out.println(values);
				}
				
				
				
//				**** 더 효율적으로 for-each로
				
				for(Map.Entry<Integer, String> pieces : map2.entrySet()) {
					System.out.println(pieces.getKey()+" : "+pieces.getValue());
				}
				
				System.out.println();
//				***또다른 예시??
				HashMap<String, Book> booksMap = new HashMap<>();
				booksMap.put("one", new Book("java의 정석", "남궁성", 34000, 0.5));
				booksMap.put("two", new Book("노인과 바다", "헤밍웨이", 12000, 1.5));
				booksMap.put("three", new Book("어린 왕자", "생텍쥐베리", 10000, 2.5));
				
				for(Map.Entry<String, Book>  p : booksMap.entrySet()) {
					System.out.println(p.getKey() + " : " +p.getValue().getTitle() + " / " +
									   p.getValue().getAuthor() + " / " +p.getValue().getPrice());
				}
				
					
			
				System.out.println("\n\n generic class ");
//				제네릭 클래스 만들어보기
				
				MyGeneric my = new MyGeneric();
					System.out.println(my.getTemp());
				MyGeneric<Integer> my2 = new MyGeneric<Integer>();
					System.out.println(my2.getTemp());
				my2.setTemp(100);
					System.out.println(my2.getTemp());
//				my2.setTemp("백");// Integer에 못들어가
					
				MyGeneric<String> my3 = new MyGeneric<String>();
				my3.setTemp("백");
					System.out.println(my3.getTemp());
					
//				이렇게도 할 수 있지
				MyGeneric<List<Book>> my4 = new MyGeneric<List<Book>>();
				
				my4.setTemp(new ArrayList<Book>());
				my4.getTemp().add(new Book("하하", "호호", 1000, 0.0));
				
					System.out.println(my4.getTemp());

	}
}
