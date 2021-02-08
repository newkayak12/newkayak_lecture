package com.io.run;

import com.io.controller.FileController;
import com.io.controller.FileSubStreamContoller;
import com.io.controller.File_IO_Controller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileController fc = new FileController();
		
//		fc.basicFile();
//		fc.fileTest();
//		fc.fileInfo();
		
		File_IO_Controller io = new File_IO_Controller();
		
		
//		io.saveFile();
//		io.loadFile();
//		io.saveStrFile();
//		io.loadStrFile();
		FileSubStreamContoller fsc = new FileSubStreamContoller();
//		fsc.stringChangeOutput();
//		fsc.stringChangeInput();
//		fsc.bufferedWrtieTest();
//		fsc.bufferedReaderTest();
//		fsc.memberSave();
//		fsc.memberload();
//		fsc.saveMemberDataType();
//		fsc.loadMemberDataType();
//		fsc.objOutputTest();
//		fsc.objInputTest();
		fsc.objOutputTest2();
		fsc.objInputTest2();
		
		
		
		
		
		
		
		
	}

}
