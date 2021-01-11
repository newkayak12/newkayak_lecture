package com.vari.dataover;

public class DataOverflow {

	public static void main(String[] args) {

		byte bnum=125;
		System.out.println(++bnum); //126 예상
		//bnum++ 는 bnum에 1 증가하는 후위 연산자
		//++bnum은 bnum에 1 증가하는 전위 연산자
		
//		후위 연산자와 전위 연산자는 값을 계산하는 순서가 다르다.
		
		System.out.println(++bnum); //127 예상
//		System.out.println(++bnum); //128 예상되는데 실제로는 -128이 출력됨
//		System.out.println(++bnum); // 앞의 값이 -128이 됐고, 여기서는 -127이 출력됨
		
//		이런 경우를 'data overflow'라고 한다.
//		이런 경우를 해소하려면 해당 자료형보다 큰 자료형으로 변경해주면 된다.
		
		int inum = bnum;
		System.out.println(++inum);
		
		for( int i =0; i<300; i++ ) {
			System.out.println(++bnum);
		}
//		마치 뫼비우스의 띠처럼 안에서 반복되며 돈다.
	}

}
