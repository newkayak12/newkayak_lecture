package com.collection.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.collection.common.FruitsNameAscending;
import com.collection.common.FruitsNameDescending;
import com.collection.common.FruitsPriceAscending;
import com.collection.common.FruitsPriceDescending;
import com.collection.common.FruitsSugarContentAscending;
import com.collection.common.FruitsSugarContentDescending;
import com.collection.model.vo.Fruits;


public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList는 배열과 동일한 저장방식을 가지고 있으며
//		배열의 단점을 보완한 자료구조형태이다. 
//		객체이기 떄문에 클래스로 되어있다. 메소드를 이용하여 데이터를 수정, 삭제, 추가를 할 수 있다.
		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		
		ArrayList list = new ArrayList();  //기본적으로 10개의 배열 저장 공간이 확보된다.
		//저장 공간을 지정해서 생성할 수 있다. 
		ArrayList list2 = new ArrayList(20);
//		Object 배열로 저장하죠 > 그러니까 add로 넣을 수 있는 것은 Object타입의 모든것
		
		
//		다형성에 의해서 구현 인터페이스 자료형에 대입이 가능하다. 
		List listTest = list;
		Collection collection = list2;
		
		
//		이용해보자!
//		생성된 list에 값틀 넣기
//		값은 add메소드를 이용해서 값을 넣는다.
		list.add(false);      // Wrapping 한거지 *****
		list.add("유병승"); //0번 인덱스
		list.add(19);		// 1번 인덱스
		list.add(180.5);	// 2번 인덱스
		list.add(new Date()); //3번 인덱스
		
		
//			System.out.println(list);
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
//			System.out.println(list.get(2));
//			System.out.println(list.get(3));

//			for로 가져올 수 있겠네요?????
//			근데 우리 length를 쓸 수 있어요 없어요?? 없죠
//			그럼 뭐 써야 해야요?? size();메소드 쓴다구요
				System.out.println("list의 데이터 수" + list.size());
				for(int i =0 ; i< list.size(); i++) {
					System.out.println(list.get(i));
				}
				
//				
			
//			toString 오버라이드 되어 있고 그래서 이렇게 나오는데 심지어 Null인 녀석은 출력도 안되게 해놨다는게 참 재미있네
			
//			사실 저장할 때 List자료형은 사용할 때는 통상 vo객체를 저장할 때 사용합니다.
//			vo는 데이터 저장용 클래스 > Student, Employee 등 통괄적으로 보관하기 위해서
//			****Object 타입이기 때문에 자바에서 사용하는 모든 타입을 저장할 수 있다.**** 
				
				
				
				
				
//		**********list에 있는 데이터 변수에 저장하기 > get으로 가져오는 모든 것들은 Object 타입 무조건 형변환 해줘야한다.
//				대입하려면 강제적 형변환
//				동적 바인딩이 적용되면 안 해도 됨
				System.out.println("\nlist의 특정 인덱스 출력");
			boolean bool = (Boolean) list.get(0);
			String name = (String) list.get(1);
			int age = (Integer) list.get(2);
			
			
			
		ArrayList fruits = new ArrayList();
		fruits.add(new Fruits("사과", "영주", 5, 30000 ));
		fruits.add(new Fruits("포도", "체코", 3, 15000	));
		fruits.add(new Fruits("딸기", "논산", 8, 8000 ));
//			System.out.println("fruits의 데이터 개수 : " + fruits.size());
//			for(int i = 0; i< fruits.size(); i++) {
//				System.out.println(fruits);
//			}
		
		
//			들어갔으면 하나 하나 출력을 해봐야한다. 
//			출력하는 방법은 : index(각 데이터마다 부여된 index를 기준으로 가져온다. )
//			get 메소드로 출력을 한다. parameter로 index를 주면 된다
		
		
		
		
		
		
		
		
		
		
		
		
//		************************list의 데이터 삭제하기!
//		삭제하는 로직을 알아서 구현 해놨는데 그 메소드 이름이? remove();
//			remove()의 parameter에는 index값이나 객체, 데이터 값 그 자체가 들어갈 수 있다.	
			System.out.println("\n삭제");
			
		list.remove(0);
//		인덱스로 지우기
			System.out.println(list.get(0));
//		0번의 boolean을 지우니까 한 칸 당겨졌네??? 참 편해요 ㅋㅋ
		
		
		list.remove("유병승");
//		객체/ 데이터 값으로 지우기
			System.out.println(list.get(0));
		
//		**************	list데이터를 수정하기
//		set()이라는 메소드를 이용하면 된다. 
//		set()의 parameter는 index, 수정할 데이터
			System.out.println("\n수정");
		
		list.set(0, "이제 곧 쉬는 시간");
			System.out.println(list.get(0));
		
		
		
//	 ********list의 원하는 위치에 데이더 삽입!
//		add()에 parameter에 index, 데이터로 삽입 > index위치에 데이터를 추가하고 원래 있던 애들은 밀어버린다. 
		list.add(1,"이것은 추가한 것입니다!");
			System.out.println("\n인덱스에 추가하고 밀기");
			System.out.println(list);
		
		
//		******내가 만든 객체를 이용해보기!
//			여기서 이제, 
				System.out.println("\n내가 만든 객체를 이용해보기!");
//			추가하기
			fruits.add(new Fruits("수박", "시골", 8, 20000	));
				System.out.println(fruits);
			
			fruits.add(1, new Fruits("키위", "뉴질랜드", 5, 10000));
				System.out.println(fruits);
			
//			삭제하기
//				>인덱스로 지우기
//			fruits.remove(0);
//				%%객체 sort를 위해 주석
				
				System.out.println(fruits);
			
//				>객체로 지우기	
//			fruits.remove(new Fruits("키위", "뉴질랜드", 5, 10000));
				
//				객체를 이렇게 생성해서 지우려고 한다면 문제가 생긴다. 
//				new 로 새로운 객체를 생성했기 때문에 필드는 같을 수 있지만 실제 객체의 주소값은 다르기 때문
//				그래서 우리는 객체간의 비교를 위해서 equals를 오버라이드 해서 둘이 같다는 것을 증명해줘야한다.
				
				/*
				 * @Override
				 * public boolean equals(Object obj){
				 * 		if(this==obj){
				 *				return true;
				 * 		} else if( obj instanceof this){
				 * 				This others = (This) obj;
				 * 				
				 * 				if(this.getBlah.equals(others.getBlah());){
				 * 					return true;
				 * 				}
				 * 
				 * 		} else { 
				 * 				return false;
				 * 		} 	
				 * 
				 * 
				 * 
				 * 
				 * ++ hashCode override reminder
				 * 
				 * @Override
				 * public int hashCode(){
				 * 
				 * 
				 * 	return Objects.hash( parameter1, parameter2, ...,parameter0);
				 * }
				 */
				
				
				
				
//				%%객체 sort를 위해 주석
				System.out.println(fruits);
				
				
//				어? 뭐야! > equals 오버라이드
				
//				Fruits 변수 > 과일들을 관리핟기 위해서 선언했지
				
				
//			fruits.add(new Date());
//			>이러면 과일이 아닌 녀석이 들어가지 Object타입으로 선언을 했으니까
//			제네릭으로 얘를 제한 할 수 있음
				
				
//			***list에서 사용할 만한 메소드
//			1.contains() : list 내부에 매게변수의 객체가 있는지 알려주는 메소드
			
				System.out.println(fruits.contains(new Fruits("수박", "시골", 8, 20000	)));
				if(!fruits.contains(new Fruits("망고", "필리핀", 8, 20000) )){
					fruits.add(new Fruits("수박", "시골", 8, 20000	));
				}
//			
				
//			2. clear() : list에 있는 데이터를 모두 지우는 것
				
//				fruits.clear();
				System.out.println(fruits);
				
//			3. isEmpty() : List에 데이터가 있는지 확인
				
				if(!fruits.isEmpty()) {
					for(int i = 0; i< fruits.size(); i++) {
						System.out.println(fruits.get(i));
					}
				}
				
				
//			4. indexOf(객체) : 객체와 일치하는 값의 인덱스 번호 반환
				System.out.println(list.indexOf(180.5));
//				-1이 반환 값이면 없는 값
				
//			5. toArray() : List를 Object[]로 반환해주는 메소드
//				 다른 메소드 이용시 매개변수로 배열로 선언한 경우
			Object[] objs = list.toArray();
			
			
//			이런 것들을 잘 응용하면 List를 잘 관리할 수 있겠죠
			
//			****************list는 중복 값을 저장한다.
				System.out.println("\n duplicated value");
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			fruits.add(new Fruits("망고", "필리핀", 7 , 7000));
//			
//			객체 sort하기 위해서 주석을 했습니다. 나중에 확인하세요
			
			
				System.out.println(fruits);
			
				
//			**************** list는 순서가 있기에 정렬이 가능합니다.
			list.clear();
				System.out.println("\n\nsort");
			
				for(int i = 0; i<10; i++) {
					list.add((int)(Math.random()*10)+1);
					
				}
				
				System.out.println(list);
//				정렬 전

				
//			Collections.sort(): 를 이용하면됨	
			Collections.sort(list);
				System.out.println(list);
//				오름차순 정렬
			list.clear();
//			list에다가 문자열로 입력받으세요 취미를 입력 받아서 저장해보세요
			
//			%%%쓰기(runtime때) 귀찮아서 주석***************************
//				System.out.println("enter");
//				Scanner scn = new Scanner(System.in);
//				for(int i =0; i<5; i++) {
//					list.add(scn.next());
//				}
//			Collections.sort(list);
//				System.out.println(list);
//			이게 되네????? 존나 신기하네 ㅋ
//			1.	근데 얘네 다 오름차순 정렬이죠????
//			2.		그리고 객체는 정렬이 될까요???
//			%% 여기까지 문자열 **************************************
			
			
			
			
			
//			***************2.객체의 정렬
				System.out.println("객체의 정렬");
				for(Object o : fruits) {
					System.out.println(o);
				}
				
				System.out.println("\n\n정렬을 해봅시다 직접 CompareTo를 오버라이드 해서 (Fruits에 Comparable을 구현하고 제네릭으로 Fruits타입을 줬습니다.)");
//				Collections.sort(fruits);
				
				
//			Exception in thread "main" java.lang.ClassCastException: class com.collection.model.vo.Fruits cannot be cast to class java.lang.Comparable (com.collection.model.vo.Fruits is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//			at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//			at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//			at java.base/java.util.Arrays.sort(Arrays.java:1106)
//			at java.base/java.util.Arrays.sort(Arrays.java:1300)
//			at java.base/java.util.ArrayList.sort(ArrayList.java:1721)
//			at java.base/java.util.Collections.sort(Collections.java:145)
//			at com.collection.controller.ArrayListTest.main(ArrayListTest.java:264)

//			망했네요??? 얘는 기본적으로 그냥 sorting할 수 없다는 의미겠지
//			sort할 때 comparable을 구현해놔야 하는데 안했죠??
			
//			Fruits로 가서 Comparable구현하고 제네릭으로 Fruits타입을 준다.
//			그리고 CompareTo 오버라이드
				
				System.out.println("\n\ncomparable구현\n");
				Collections.sort(fruits);
				for(Object o : fruits) {
					System.out.println(o);
				}
				
				/*(implement Comparable)
				 * @Override
				 * public int compareTo(Object obj){
				 * 
				 * 
				 * 	return obj1.compareTo(others);
				 * }
				 * 
				 */
				
				
				
				
				
				
//			CompareTo를 재정의 한 후 
//			CompareTo는 객체마다 정렬을 해주는 식으로...
				
				
//		 **************정렬하는 방법 2
//				정렬클래스를 새로 생성해서 적용하는 방법
//				Comparator 인터페이스를 구현하는 객체를 만들면 됩니다.
//				그러면 이름순/ 원산지순/ 가격순 이런걸 따로따로 만들 수 있다구요
//				Collection.sort(리스트, Comparator구현 객체);를 집어넣어서 정렬
				
				
				
				System.out.println("\n\nCompare 오버라이드 Comparator구현(오름차순)\n");
				Collections.sort(fruits, new FruitsNameAscending());
				for(Object o : fruits) {
					System.out.println(o);
				}
				
				

				System.out.println("\n\nCompare 오버라이드 Comparator구현(오름차순)\n");
				Collections.sort(fruits, new FruitsNameDescending());
				for(Object o : fruits) {
					System.out.println(o);
				}
			
				
				
				
				System.out.println("\n\n Price 오름차순");
				Collections.sort(fruits, new FruitsPriceAscending());
				for(Object o : fruits) {
					System.out.println(o);
				}
		
				System.out.println("\n\n Price 내림차순");
				Collections.sort(fruits, new FruitsPriceDescending());
				for(Object o : fruits) {
					System.out.println(o);
				}
				
				
				System.out.println("\n\n Sugar 오름차순");
				Collections.sort(fruits, new FruitsSugarContentAscending());
				for(Object o : fruits) {
					System.out.println(o);
				}
		
				System.out.println("\n\n Sugar 내림차순");
				Collections.sort(fruits, new FruitsSugarContentDescending());
				for(Object o : fruits) {
					System.out.println(o);
				}
				
				
//				아 진짜 한 번만 만들어서 쓰면 안되냐?
				
//				람다식...
//				메소드의 선언부를 간단하게 표시해서 매개변수로 넘길 수 있다. 
//				인터페이스에 한 개의 메소드만 선언한 경우에 사용할 수 있다. 
				
				
				
				
				Collections.sort(fruits, new Comparator<Fruits>() {

					@Override
					public int compare(Fruits o1, Fruits o2) {
						return o1.getPrice()-o2.getPrice();
					}
				});
//				익명 구현 객체로 
//				
				
				Collections.sort(fruits, (Object o1, Object o2)
						->(  ((Fruits)o2).getPrice()-((Fruits)o1).getPrice())  );
//				람다로 > 동작 파라미터 정도로 생각하면 됩니다.
				
				
				
				
				/* implement Comparator<>
				 * 
				 * @Override
				 * public int Compare(Object obj1, Object obj2){
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 	return obj1.compareTo(obj2);
				 * \객체 형태만 들어와서 기본 타입은 wrapping\
				 * }
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				
				
				
//				여기까지 ArrayList입니다!
				
				
//				CompareTo 문자는 CompareTo사용하고
//							숫자는 - 으로 사용하면 됩니다.
				
	}

}
