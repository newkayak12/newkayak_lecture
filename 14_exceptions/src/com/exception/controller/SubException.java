package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class SubException extends ReadFile {
	
	
	
	
	
	
	@Override
	public void fileLoad2()  throws FileNotFoundException, EOFException /*IOException*/  /* throws Exception */ {
//		Exception으로 보낸 것과 IOException으로 보낸 것의 차이??
//		Exception Exception is not compatible with throws clause in ReadFile.fileLoad2()
//		원본에 있는 것보다 예외 처리 범위가 더 넓어지면 안된다.
//		좁아지는 것은 전혀 상관이 없다. // EOF는 파일 길이를 넘겼을 때(EOF > End Of File)
//		범위가 넓어지면 안된다. 다시 한 번 말하지만
		
		
		
		
		
		
		System.out.println("오버라이드");
			
//		super.fileLoad2();
	}
}
