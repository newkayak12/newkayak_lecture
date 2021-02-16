package com.generic.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.generic.model.dao.BookDao;
import com.generic.model.vo.Book;

public class FilterTest {

	public static void main(String[] args) {
		
		
		List<Book> bookdata = BookDao.getTotalBook();
		List<Book> result = filter(bookdata,
				(Book b) -> b.getPrice() > 20000);
			
			System.out.println(result);
			
		List<Integer> intData = Arrays.asList(new Integer[] {1,2,3,4,5,6,});
		List<Integer> intresult = filter(intData,
				(Integer i ) -> i%2==0);
		
			System.out.println(intresult);
			
		List<String> names = Arrays.asList(new String [] {"유병승", "정유정", "김상현", "김예진", "김태희"});
		List<String> nameResult = filter(names, (String name) -> name.charAt(0)=='김');
			
			System.out.println(nameResult);
//	모든 자료형에 대해서 쓸 수 있는 메소드를 하나 만들어낸 것과 같다.
			
//			>람다쪽 꼭 공부해야겠다 ㅋ 개꿀잼인데??
			
			
			
	}
//  book을 가져와서 조건에 따라 검색하는 메소드를 만들어줄 것
//  조건에 따라 book data를 필터링해서 가져오는 것
//	아마 람다쪽 보면 나올걸??
	public static <T> List<T> filter(List<T> data, Predicate<T> filter){
		List<T> result = new ArrayList<>();
			for( T b : data) {
				if(filter.test(b)) {
					result.add(b);
				}
			}
			return result;
	}
}
