package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.collection.model.vo.Fruits;

public class SetTest {
	public static void main(String[] args) {
		
//		********************** 제네릭 지정을 안 했으니까 기본적으로 다! Object타입
		
		
		
		
		
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
			//02월 10일
			
//			만약 다 뽑고 다시 뽑고 싶으면 재할당해야한다.
			it2 = set.iterator();
//			그니까 set에 있는 녀석들이 사라진다기 보다는  iterator가 소진된다고 생각하는 게 맞다
//			추가적으로 뽑아내는 로직이 정해져 있어서 데이터를 더 추가하지 않는 이상 그 순서대로 나온다.
			
//			****************** set을 통해서 중복값을 제거하는 방법
			
			ArrayList list =new ArrayList();
			
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(2);
			
			System.out.println(list); // 1,1,2,2
			HashSet temp = new HashSet(list);
			list = new ArrayList(temp);
			
			System.out.println(list);
			
//			set의 특성을 가지고 중복값을 제거하는 ...ㅋ 로또번호 만들기?
			
			list.clear();
				while(list.size() != 6){
					list.add(  (int) (Math.random()*45)+1 );
					list = new ArrayList ( new HashSet( list ) );
					//메모리 차원에서는 효율적인지 의문이지 객체를 계속 만드니까
					System.gc();
				}
				
				System.out.println(list);
			
			
				System.out.println("\n\n LinkedHashSet");
			
//			************LinkedHashSet
				
			LinkedHashSet lhs = new LinkedHashSet();
			//넣는 순서가 유지됨
			
			lhs.add(1);
			lhs.add("유병승");
			lhs.add(new Fruits("배", "나주", 10, 50000));
			Iterator i2 = lhs.iterator();
				while(i2.hasNext()) {
					System.out.println(i2.next());
					
//					이렇게 입력한 값이 그대로 출력되지 순서 있이!					
//					1
//					유병승
//					name 배 origin of country 나주 sugar content 10 price 50000

				}
				
				
				
				
				
				
				
//				**************TreeSet 
//				같은 자료형일 때 쓸 수 있다. 왜냐하면 순서를 만들어야하니까
				
				TreeSet tset = new TreeSet();
				tset.add("유병승");
				tset.add("김상현");
				tset.add("장혜린");
				tset.add("김동규");
				
				
				
				System.out.println("\n\n TreeSet");
				Iterator l2 = tset.iterator();
				
					while(l2.hasNext()) {
						System.out.println(l2.next());
					}
					
					
//					김동규
//					김상현
//					유병승
//					장혜린
					
//					tree라서 잘 정렬되네요??
					
					
					
					
				l2 = tset.descendingIterator();
				
					while(l2.hasNext()) {
						
						System.out.println(l2.next());
					}
//					장혜린
//					유병승
//					김상현
//					김동규
					
//					자료형이 같아야 이렇게 오름/내림차순으로 정렬을 할 수 있다.
//					descedningIterator 는 내림차순으로 Iterarte한다.
//					 만약 다른 자료형이 끼어 있으면 트리형으로 정렬이 불가능해서 안된다.
//					당연히 set이니까 중복값은 안받습니다.
					
					System.out.println("\n\n\n  set을 사용하면 자주하는 실수는 뭡니까??");
//			*********************set을 사용하면서 자주하는 실수		
				HashSet fruit = new HashSet();
				fruit.add(new Fruits("복숭아", "천도", 5, 5000));  //Object타입이지... 제네릭이 없으니까
				fruit.add(new Fruits("체리", "미국", 3, 12000));
				fruit.add(new Fruits("체리", "미국", 3, 12000));
//				이렇게 같은 애들이 있으면 hashcode로 비교합니다. 그래서 hashcode도 같이 override해야한다.
				
				Iterator i3 = fruit.iterator();
				
					while(i3.hasNext()) {
						 Fruits fr = (Fruits) i3.next();
//							 System.out.println(((Fruits) i3.next()).getName());
//							 System.out.println(((Fruits) i3.next()).getPrice());
						 
						 	System.out.println(fr);  
						 	System.out.println(fr.getName() + " " + fr.getPrice());
						 	
//						 	hashcode랑 equals는 항상 오버라이드 할 떄 세트로 하세요 안쓰더라도
					}
				
					
					
					
					
					
					

					
					
					
					
			
	}
}
