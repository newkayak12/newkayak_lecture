package com.collection.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Fruits;


public class MapTest {
	public static void main(String[] args) {
//	map에 대해서 탐구해보는 시간을 갖겠어요
//		map은 쌍으로 이뤄져 있는 자료 구조 > key, value
//			key는 Object자료형 / value는 Object > 다 들어올 수 있다.
		
//		collection 인터페이스를 상속 받지 않음
		
//		Map Interface로 구성되어 있음
		
		
		
		//HashMap
		
		
		HashMap map = new HashMap();
//		**************데이터 넣기
//		key와 value를 다 넣어야한다. 
//		put(key, value)메소드를 이용한다.
//		key의 자료형은 대부분 String이나 Integer를 사용한다. (물론 AUTOBOX되는 부분이긴 하지만)
//		value : vo(데이터보관용 객체)를 이용.
//		> 대부분 객체를 저장하는 식으로 사용
		
				System.out.println("\n\nput으로 집어 넣기");
//		add가 아닌 put을 사용한다.
		
		map.put("유병승", 19);
		map.put("김상현", 29);
		map.put(1, "장혜린");
		map.put(2, "정유정");
		
//		set과 유사한 구조로 저장되는데 key가 nameTag처럼 붙어있는 구조이다.
		
		
			System.out.println(map);
//	{1=장혜린, 2=정유정, 김상현=29, 유병승=19}
//	입력순이 아니죠?? 순서는 없는데, key따라서 정렬된다는 말씀입니다.
	
	
	
				System.out.println("\n\nget으로 가져오기");
//**********	map에 저장된 데이터는 key를 기준으로 가져온다. key가 인덱스처럼 사용된다는 의미이다. 
			System.out.println(map.get("유병승"));  //19 key(구분자)를 기준으로 가져온다.
			System.out.println(map.get("김상현"));
	
	
//	 %%%%%%%key 값은 중복이 불가능 합니다. 그러나 value는 중복이 가능합니다!
				System.out.println(map.get(1));
			map.put(1, "김동규");
				System.out.println(map.get(1));
//				이렇게 하면 value값을 덮어쓴다는 것을 알 수 있다. (같은 key는 있을 수가 없다. 절대로 key는 중복이 안되는 구조이기 떄문)
		
				
				
	
//		********* remove()메소드 이용
//				값 삭제하기 
					System.out.println("\n\nremove로 값 삭제하기");
					
			map.remove(1);
				System.out.println(map);
		
				System.out.println("\n\n size()메소드로 길이 확인하기!");
//		*****************size()
				System.out.println(map.size());
				
				System.out.println("\n\n 전체 자료 조회하기");
//		******************** map에 있는 전체 자료 조회하기 (iterator같은 녀석이 있니?)
//			Key를 기준으로 값을 가져오기 때문에 그래서??????
//				1. key값을 알고 있어야 조회가 가능하다. 
//					key는 set방식으로 저장된다. (Iterator 로 key를 전체적으로 당겨와야한다.)
				
				System.out.println("step 1. key는 set이기 때문에 Iterator당겨옴\n");
		
				
				System.out.println("\n** 방법 1번 **\n");
		Iterator key = map.keySet().iterator();
//		 (map.keySet()이 set방식이니까 iterator가 가능하다. )
			while(key.hasNext()) {
//				System.out.println(key.next());
//				key값을 당겨오는 방법
				
				
				
//				System.out.println(map.get(key.next()));
//				이걸 응용해서 바로 map에서 get하기
				
				
				Object keyit = key.next();
				Object value = map.get(keyit);
//				제네릭을 안써서 Object타입입니다! 제네릭을 조금 달라지겠지요?
				System.out.println(keyit + " : " +value);
//				이건 선생님이 하신 방법인데 일부러 두 번 거치신 것 같네요??
				
			}
		
				System.out.println("\n** 방법 2번 **\n");
//		Map, Entry를 이용해서 key와 value 값을 동시에 가져오기
				
//		Set entrySet = map.entrySet();		//Map.Entry클래스
//		Iterator entry = entrySet.iterator(); 
//			
//			while(entry.hasNext()) {
////				it.next()  > Map.Entry객체가 들어있음
//				Map.Entry e = (Map.Entry)entry.next();
////				getKey() > key값을 가져옴 / getValue() > value를 당겨옴
//				System.out.println(e.getKey()+" "+ e.getValue());
//				
//			}
//				System.out.println("\n\n내부에 데이터 확인하기\n");
////			데이터가 있는지 확인하기
//				System.out.println("isEmpty :" + map.isEmpty());
//				System.out.println("containsKey :"+map.containsKey("유병승"));
//				System.out.println("containsValue : "+map.containsValue(29));
//				
				
				
				
//		map에 객체를 넣는다??
			map.clear();
			
		map.put(1, new Fruits("귤", "제주", 10, 15000	));
		map.put(2, new Fruits("파인애플", "필리핀", 5, 7000));
		map.put(3, new Fruits("레몬", "미국", 1, 3000));
		
//		******************* 1번쨰 방법
		
		
				System.out.println("\n\n*** 1번째 방법 ***");
		Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				Object Key = it.next();
				Fruits f = (Fruits) map.get(Key);
				System.out.println(f.getName() +" "+ f.getOrigin());
				
			}
//			
			
		
//		 ******************** 2번쨰 방법을 이용했다.
		
					System.out.println("\n\n*** 2번째 방법 ***\n");
		Set entrySet = map.entrySet();  //Map.Entry타입을 넘겨주고
		Iterator entry = entrySet.iterator(); //Set에서 iterator // 넘긴건 Map.Entry
		
		
		
		
		
		
		
			while(entry.hasNext()) {
				//set에 있는 것을 당겨오는 곳
				Map.Entry e = (Map.Entry) entry.next(); //obj타입 그래서 Map.Entry에 들어갈 수 있네
				
//				Entry는 Map안에 있는 Nested Interface
				///여기는 그냥 보이는 것을 당겨오는 곳
				Fruits fr = (Fruits) e.getValue();
				System.out.println(e.getKey()+" "+fr.getName()+ " " + fr.getOrigin());
			}
			
			
			
//			Map의 Values(); Map에 있는 값을 Collection으로 반환
			System.out.println("\n\nValues()를 이용하면 Collection타입으로 반환한다.");
		Collection c= map.values();
//			System.out.println(c);
			
		Iterator ic = c.iterator();
			while(ic.hasNext()) {
				System.out.println(ic.next());
			}
			System.out.println("\n\nArrayList로 받은 Collection을 당겨오기");
		ArrayList list = new ArrayList(c);
		System.out.println(c);

				
		
		
		
		
		System.out.println(" ********************************* 제네릭 사용");

		Set<Map.Entry<Integer, Fruits>> lss = map.entrySet();
		
		Iterator<Map.Entry<Integer, Fruits>> ls2 = lss.iterator();
			while(ls2.hasNext()) {
				Map.Entry<Integer, Fruits> tempor = ls2.next();
				System.out.println(tempor.getKey());
				System.out.println(tempor.getValue());
			}
		
		
//		웹에서는 어떻게 쓸건가?
		
		
		list.clear();
		
		HashMap data = new HashMap();
		
		data.put("name", "유병승");
		data.put("age", 19);
		data.put("address", "시흥시");
		data.put("ID", "admin");
		
		
		list.add(data);
			for(int i=0; i<list.size(); i++) {
				for(Object o : ((HashMap)list.get(0)).keySet()) {
					
					HashMap m1 = (HashMap) list.get(0);
					System.out.println(m1.get(o));
					
				}
			}
				
//			물론 여기에 제네릭을 쓰면 더 간단해지기는 하는데
//			그니까 HashMap으로 저장한걸 List에 넣고 List에 넣은 것을 꺼내서 Object o에 키값을 주입하고
//			m1에 value를 key로 받아서 값을 출력
			
			
//			이렇게 list를 연결해서 처리한다. 물론 제네릭을 사용하니까 더 간단하지!
			
			
			
			
			
			

		
	}
}
