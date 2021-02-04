package com.exception.common_cumstom;

import java.io.Serializable;

// 예외 처리 객체로 만들자
//조건은 Exception 객체를 상속 받기
//
public class CustomException extends Exception implements Serializable{
//	The serializable class CustomException does not declare a static final serialVersionUID field of type long
	
	
	
	
	
	/**
	 * 
	 * 직렬화 처리 _ 파일 입출력에서 사용
	 * 
	 */
	private static final long serialVersionUID = -5164716705355239486L;

	public CustomException(String message) {
		super(message);
	}
	
	
}
