package com.thread.run;

import com.thread.controller.CharacterRun;
import com.thread.model.vo.CharacterTest;

public class CharacterMain {

	public static void main(String[] args) {
		
		CharacterRun sang = new CharacterRun(new CharacterTest(50,1,"김상현"));
		CharacterRun tae = new CharacterRun(new CharacterTest(30,2,"김태희"));
		CharacterRun  yoo = new CharacterRun(new CharacterTest(10000,1,"유병승"));
		
		
		
		
		sang.start();
		tae.start();
		yoo.start();
		
		
		
		
	}

}
