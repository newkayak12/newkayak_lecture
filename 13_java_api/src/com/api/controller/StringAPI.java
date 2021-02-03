package com.api.controller;

import java.util.StringTokenizer;

public class StringAPI {

	public static void main(String[] args) {
		
//		String 클래스는 불변이다.
		String str = "유병승";
			System.out.println(str);
			System.out.println(str.hashCode());
		String test = new String("유병승");
			System.out.println(test.hashCode());
		
		str += " 19살";
			System.out.println(str);
			System.out.println(str.hashCode());
		
			
			
			
			
			
			
			
			
			
			
			
// 		String활용 주요 메소드		
//		 1. concat() : 문자열을 결합하여 반환하는 메소드
		String result = str.concat(" 선생님");
		
			System.out.println("\n 1. concat() 문자열 접합");
			System.out.println(result);
			System.out.println(result.hashCode());
		
//		 2. contains() : 문자열 안에 포함된 문구, 문자를 찾아주는 메소드
//							매개변수에 있는 문자가 있으면 true/ 없으면 false
			System.out.println("\n 2. contain() 문자열 색인");
			System.out.println(result.contains("19"));
			System.out.println(result.contains("192.1"));
//		 if문의 조건으로 들어갈 수 있겠지?
		
//		 3. indexOf() : 매개변수와 일치하는 문자열 안의 문자의 인덱스 번호를 반환
		result = "안냥하세여!";
			System.out.println("\n3. indextOf() 문자 인덱스 반환");
			System.out.println(result.indexOf('하'));
//			단독으로는 안쓰고 ~에서 ~까지 잘라내고 교체할 때 함께 사용
//			indexOf는 매개변수를 두 개도 가능하다.
		result = "aabcde";
			System.out.println(result.indexOf('a'));
			System.out.println(result.indexOf('a', 1));
//			indexOf(char/string, fromindex);
			
			
			
//		4. lastIndextOf() : indexOf랑 같은데 오른쪽에서 왼쪽으로 찾아들어감
		result = "avdslskjab";
			System.out.println("\n4. lastIndexOf() indexOf()랑 같은데 뒤에서부터 색인");
			System.out.println(result.lastIndexOf('a'));
			System.out.println(result.indexOf('a'));
			
//		indexOf류의 특징 하나 찾으면 거기서 멈춰버림 _ for로 돌리던해야지
			
//		5. replace(교체할 인덱스 번호, 새롭게 들어갈 문구) : 문자열 교체하는 메소드(원본을 건들이는 건아니고 새롭게 만들어서 반환)
			
		result = "나를 좋아해?";
			System.out.println("\n5. replace 값을 바꿔서 새로운 문자열로 반환");
		String newOne = result.replace("나를 ", "너를 " );
		 	System.out.println(result);
		 	System.out.println(newOne);
		result = " 나를 나를 좋아해?";	
		newOne = result.replace("나를 ", "사실 ");
	 		System.out.println(newOne);
	 		
	 		
//	 		replaceFirst() > 위의 경우처럼 다 바꿔버리니까 처음의 것만 바꾼다.
 		newOne = result.replaceFirst("나를 ", "나는 ");
 			System.out.println(newOne);
 			
// 			배열 내부에 도메인이 바뀐 경우 그냥 for로 replace를 돌리면 되는 부분?
 			
 			
 			
//		6. split() : 특정 문자열이 특정 구분자로 구분되어 있을 때 배열로 변경해준다.?
		String strSplit = "김두호/유병승/이진주";
		String[] name = strSplit.split("/");
		
			System.out.println("\n6. split 구분자를 적출해서 배열로 반환");
			for( String names : name) {
				System.out.println(names);
			}
			
//		7. join() : 배열을 특정 구분자로 한 개 문자열로 합쳐줌 <->split
		String joinResult = String.join(",", name);
			System.out.println("\n7. join 배열을 다시 구분자를 넣어서 문자열로 반환");
			System.out.println(joinResult);
			
			
//			Oracle에는 배열이 없어서 여기서 합쳐서 보내야함
//			static method
			
			
			
//		8.substring() : 특정지역(인덱스범위)의 문자를 잘라내는 기능
		result = "여러분 오늘 힘냅시다!";
			System.out.println("\n8. substring 인덱스 번호로 구분해서 잘라냄 ");
			System.out.println(result.substring(6));
			System.out.println(result.substring(0,3).concat(result.substring(6)));
			
//			인덱스 한 개짜리는 그 부분에서부터 뒤만 남김(시작 인덱스 번호) 
//			인덱스 두 개짜리는 일정 범위를 잘라냄 (시작 인덱스(포함), 끝 인덱스(안 포함))
			
//			인덱스 번호를 세야한다??????? 쉽지 않지...
			
			System.out.println(result.substring(result.indexOf("힘")));
//			indexOf 혼자 안쓴다니까 ㅋㅋ
			
			System.out.println(result.substring(result.indexOf("오"), result.lastIndexOf(" ")));
			System.out.println(result.substring(result.indexOf("오"), result.indexOf("늘")+1));
//			indexOf에 인덱스 번호 넣을 수 밖에 없나?? 띄어쓰기 때문에????
//			lastIndexOf 쓰면 되네 ㅋㅋㅋ 진짜 공부 많이 해야겠다... 사실 이 부분은 너무 방대해서 기억이 안나기도 하는데....ㅋㅋㅋ
			
			
//		9. 영문자 변환 (대문자 > 소문자 or 소문자 > 대문자)
//			toUpperCase/ toLowerCase
			
			System.out.println("\n9. toUppercase/ toLowerCase  대문자에서 소문자, 소문자에서 대문자로 변환");
			
		str = "AbrAcAdAbrA";
		result = str.toLowerCase();
			System.out.println(result);
		result = str.toUpperCase();
			System.out.println(result);
			
			
			
			
			
//		10. trim() 공백을 잘라내주는 기능 > 띄어쓰기를 다 날려버림
//			얘는 문자열로 네트워크 상에서 데이터를 주고 받는데 띄어쓰기 때문에 동등비교가 안될 수도 있음 그래서 많이 씀
			System.out.println("\n10. trim 공백 제거");
			
		str ="                띄 어    쓰기          ";
			System.out.println(str);
		result = str.trim();
		
			System.out.println(result);
//		문자 사이에 띄어쓰기가 있는 경우에는 그 문자 사이 띄어쓰기는 제거하지 않는다. 
//			문자 사이의 공백은 replace로 사용하면 된다.
		newOne = result.replaceAll(" ", "");
			System.out.println(newOne);
			
			
			
//		11. valueOf() 다른 자료형 String으로 형변환하기
			int age =19;
//			(String) age 
		str = String.valueOf(age);
//		static method
			System.out.println(str);
			
//			기본 자료형은 다아 된다. 
//		 코드를 더 간단하게 해주는 것들
			
			
			
//		StringBuffer 클래스 이용하기
//			똑같이 문자열을 저장하는 클래스 > 가변(즉 저장소에 있는 데이터(원본)를 수정할 수 있다.)  > 그래서 buffer인듯
//			얘는 객체이다. 그냥 객체 생성 방식대로 new연산자를 통해서 생성해서 관리한다.
//			직접적으로 데이터를 보관하는 변수에 접근이 불가능하다. > 메소드를 통해서만 접근이 가능하다. (StinrgBuffer가 제공하는)
			
			
			System.out.println("StringBuffer");	
		StringBuffer strb = new StringBuffer("이제 곧 점심시간"); //>자동으로 10개인가 생성한다고 했던걸로 기억하는데?
			System.out.println(strb);
			System.out.println(strb.hashCode());//toString을 Override 했구나
//			원본 문자열을 수정, 삭제, 추가
		strb.append("점심 잘 먹었나요");
			System.out.println(strb.hashCode());
			
//			hash가 안 변했다.
			System.out.println("\ninsert");
		strb.insert(strb.indexOf("잘")+1 , " 못" );
			System.out.println(strb);
			System.out.println(strb.hashCode());
			
			
//			이야 아주 중첩으로 잘쓴다 ㅋㅋㅋ 이거 자주 쓰면 외워지는 부분이겠지
			
			System.out.println("\ndelete");
		strb.delete(0, 4);
			System.out.println(strb);
			System.out.println(strb.hashCode());
		
		
//		여기서 알 수 있는 사실 ! 조작이 ??? 가능하다.
//		문자열을 거꾸로 변경하는 것
			System.out.println("\nreverse");
		strb.reverse();
			System.out.println(strb);
			System.out.println(strb.hashCode());
			
//			수정
			System.out.println("\nsetCharAt");
		strb.setCharAt(0, '안');
			System.out.println(strb);
			System.out.println(strb.hashCode());
			
			
			
//		StringBuffer 를 받아서 String으로 넣어야하는 경우가 있다.
//		strb.contains("안녕!");
//		이럴 경우 / 매개변수로 String을 받는 경우도 있고 > 그런 경우 버퍼를 String으로 바꿔야겠지
		String change = new String (strb);
		change.contains("안냥!");
//		혹은
		String change2 = strb.toString();
		change2.contains("안녕!");
		
//		이렇게 이용할 수 있다. 
		
		
//		StringTokenizer 클래스 활용하기
//		특정 구분자로 구분되어있는 문자열을 배열과 비슷한 형식으로 변경해서 출력하는 클래스
		
		String lang = "java, oracle, html/css, javascript, jquery";
		StringTokenizer st = new StringTokenizer(lang, ",");
			System.out.println("StringTokenizer");
			
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
			System.out.println(st.nextToken());
//			Exception in thread "main" java.util.NoSuchElementException
//			at java.base/java.util.StringTokenizer.nextToken(StringTokenizer.java:348)
//			at com.api.controller.StringAPI.main(StringAPI.java:238)
// 분할 했을 때 토큰이 더 이상 없어서 나오는 에러
			
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());

//				읽고 토큰을 지운다...
//				System.out.println(st.nextToken());
//				이렇게 해도 hasmoretoken으로 보호가 안되서 에러 위의 에러와 같은 에러임
				
				
			}
			
			
			
//			너 남은 토큰 이썽?? 없으면 false
			
//			
//			메소드를 배우는거라 ㅋㅋㅋ
//			그냥 자주 써서 익히면 되는 거임 딱 써야할 때 어?? 이거 쓰면 되겠네 수준 정도
//			어차피 API를 저장하고 있는건 내 뇌가 아니거든 
			
			
			
			
			
			
			
			
	}

}
