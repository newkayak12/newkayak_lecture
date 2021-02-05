package com.io.run;

import com.io.controller.FileController;
import com.io.controller.File_IO_Controller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileController fc = new FileController();
		
//		fc.basicFile();
//		
//		fc.fileTest();
//		
//		fc.fileInfo();
		
		File_IO_Controller io = new File_IO_Controller();
		
//		io.saveFile();
//		io.loadFile();
		io.saveStrFile();
//		io.loadStrFile();
		
	}

}
