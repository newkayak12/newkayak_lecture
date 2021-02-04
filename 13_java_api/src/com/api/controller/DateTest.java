package com.api.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
//		1970년대 1월 1일이 long형의 0으로 잡아놓고 하나씩 계산
//		모든 언어에서 같은 기준을 가지고 있음
//		표현 방식이 조금씩 다름
		
		
		Date today = new Date(); // 오늘 날짜를 가져옴
			System.out.println(today);
			
//			날짜는 long타입의 숫자로 표현
			
			System.out.println(today.getTime());
//			1612331619730 이 long형 값이  Wed Feb 03 14:53:39 KST 2021으로 표현됨
			
		Date day = new Date(1234578945123L);
			System.out.println(day);
//			이러면 로컬에 있는 시간을 받는다.
			
			
		LocalDateTime ldt = LocalDateTime.now();
			System.out.println(ldt);
			
			
//			날짜를 원하는 방식대로 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss (E)");
		
		String date = sdf.format(today);
			System.out.println(date);
			
			
//			어????? yyyy/MM/dd는 뭐임??
			

			
			
//			https://docs.oracle.com/javase/8/docs/api/

//Letter	Date or Time Component							Presentation	Examples
//G				Era designator								Text			AD
//y					Year									Year		1996; 96
//Y				Week year									Year		2009; 09
//M		Month in year (context sensitive)					Month		July; Jul; 07
//L		Month in year (standalone form)	Month				July; 		Jul; 07
//w			Week in year									Number			27
//W			Week in month									Number			2
//D			Day in year										Number			189
//d			Day in month									Number			10
//F		Day of week in month								Number			2
//E		Day name in week									Text		Tuesday; Tue
//u		Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
//a			Am/pm marker									Text			PM
//H			Hour in day (0-23)								Number			0
//k			Hour in day (1-24)								Number			24
//K		Hour in am/pm (0-11)								Number			0
//h		Hour in am/pm (1-12)								Number			12
//m		Minute in hour										Number			30
//s		Second in minute									Number			55
//S		Millisecond											Number			978
//z		Time zone										General time zone	Pacific Standard Time; PST; GMT-08:00
//Z		Time zone										RFC 822 time zone	-0800
//X		Time zone										ISO 8601 time zone	-08; -0800; -08:00
			
//		대충 이런식임
			
		
		
		
	}

}
