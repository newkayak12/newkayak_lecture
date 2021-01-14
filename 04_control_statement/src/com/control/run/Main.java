package com.control.run;

import com.condition.controller.ConditionController_if;
import com.condition.controller.ConditionController_switch;

public class Main {

	public static void main(String[] args) {

	ConditionController_if cond = new ConditionController_if();
//		cond.ifTest();  //삼항연산자, if 연산
//		cond.ifex();
//		cond.cong();
//		cond.evenNumber();
//		cond.login();
//		cond.ifElseExam();
//		cond.minors();
//		cond.gra();
//		cond.hellKorea();
//		cond.id();
//		cond.nestedIfTest();	
		
	ConditionController_switch cnd = new ConditionController_switch();
		cnd.switchTest();
		
	}

}
