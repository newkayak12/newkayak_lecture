package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest /* implements Runnable */ {

	public static void main(String[] args) {
//  Calendar
//	날짜를 출력해주는 클래스
//		자체 생성이 불가능하게 설계되어 있음 > new 연산자를 통해 생성할 수 없음
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		결과물java.util.GregorianCalendar[time=1612397911940,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=35,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=18,SECOND=31,MILLISECOND=940,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		
//		날짜를 이렇게 출력하지는 않지
//		필드에 있는 값을 가져와서 출력
//		
//		필드 값을 어떻게 가져오냐 get 메소드를 이용해서 > 여기서 출력값은 다 int
		
		System.out.print(c.get(Calendar.YEAR)+"/");
		System.out.print(c.get(Calendar.MONTH)+1+"/");  //얘 왜 1나오냐... 2월인데
//		달력을 표시할 때 0부터 시작해서... 그리서 우리는 달력을 출력할 때 +1 -1을 처리
		System.out.print(c.get(Calendar.DATE)+"  ");
		System.out.print(c.get(Calendar.AM_PM));// 0==오전 1==오후
		System.out.print(c.get(Calendar.HOUR_OF_DAY)+":");
		System.out.print(c.get(Calendar.MINUTE)+":");
		System.out.print(c.get(Calendar.SECOND));
		
		
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
//		int dateofmon = c.get(Calendar.DAY_OF_MONTH);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min  = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		
		
		
		System.out.println("\n"+year +"/"+ month+"/"+date+"   "+hour+":"+min+":"+sec);
		
	System.out.println("calendar로 날짜 구해서  date로 바꿔서 simpledateFormat으로 넘기기 ");
		Date day = new Date(c.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat();
//		우리가 주로 이렇게 쓸거라네...
		
		
		
		System.out.println(sdf.format(day));
		
		
		////////////////////주의할 점////////////////////////
//		날짜를 변경해서 출력하기
		c.set(1993,7-1,10);
//		컴퓨터는 7월을 6으로 받으니까 -1
		//////////////////////////////////////////////////
		
		
		printDate(c);
		
		c.set(Calendar.YEAR, 1996);
		printDate(c);
//		생성하면서 초기화 할 수는 없지 getInstance로 당겨오는 애니까
		
		
		
		
		
//		그레고리안 캘린더 Calendar 객체를 상속받아 사용하는 GregorianCalendar
		
		GregorianCalendar gc = new GregorianCalendar();
//		생성자로 생성이 가능하하다
		
		System.out.println(gc);
//		java.util.GregorianCalendar[time=1612399338539,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=35,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=42,SECOND=18,MILLISECOND=539,ZONE_OFFSET=32400000,DST_OFFSET=0]

		printDate(gc);
//		상속 관계니까 자동형변환으로 쓰면 상관 없겠지... >필드는 다 가져다 썼으니까
		
		
//		test
//		
//		while(true) {
//			Thread th =new Thread();
//			th.run();
//			th.wait(3000);
			
			GregorianCalendar gc1 = new GregorianCalendar(1996,8-1,4);
			printDate(gc1);
//		}
		
		
		
		
//		gregorian simpledateformat 가능?
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//				System.out.println(sdf2.format(gc));
			
				
				/*
				 * // Exception in thread "main" java.lang.IllegalArgumentException: Cannot
				 * format given Object as a Date at
				 * java.base/java.text.DateFormat.format(DateFormat.java:339) at
				 * java.base/java.text.Format.format(Format.java:159) at
				 * com.api.controller.CalendarTest.main(CalendarTest.java:103)
				 */
		
//			GregorianCalendar gc1 = new GregorianCalendar(1996,8-1,4);
			System.out.println(sdf2.format(new Date(gc1.getTimeInMillis())));
		
		
		
		
		
		
	}
	
	
	
	private static void printDate(Calendar c) {
		
		System.out.print(c.get(Calendar.YEAR)+"/");
		
		
		
		
		////////////////////주의할 점////////////////////////
		System.out.print(c.get(Calendar.MONTH)+1+"/");  //얘 왜 1나오냐... 2월인데
		////////////////////////////////////////
		
		
		
		
		
//		달력을 표시할 때 0부터 시작해서... 그리서 우리는 달력을 출력할 때 +1 -1을 처리
		System.out.print(c.get(Calendar.DATE)+"  ");
		System.out.print(c.get(Calendar.AM_PM));// 0==오전 1==오후
		System.out.print(c.get(Calendar.HOUR_OF_DAY)+":");
		System.out.print(c.get(Calendar.MINUTE)+":");
		System.out.print(c.get(Calendar.SECOND));
		System.out.println();
		
	///////////////////////////////////////////////////////	
		
	}



//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
	

}
