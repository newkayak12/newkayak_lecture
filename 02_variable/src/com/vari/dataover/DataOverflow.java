package com.vari.dataover;

public class DataOverflow {

	public static void main(String[] args) {

		byte bnum=125;
		System.out.println(++bnum); //126 ����
		//bnum++ �� bnum�� 1 �����ϴ� ���� ������
		//++bnum�� bnum�� 1 �����ϴ� ���� ������
		
//		���� �����ڿ� ���� �����ڴ� ���� ����ϴ� ������ �ٸ���.
		
		System.out.println(++bnum); //127 ����
//		System.out.println(++bnum); //128 ����Ǵµ� �����δ� -128�� ��µ�
//		System.out.println(++bnum); // ���� ���� -128�� �ư�, ���⼭�� -127�� ��µ�
		
//		�̷� ��츦 'data overflow'��� �Ѵ�.
//		�̷� ��츦 �ؼ��Ϸ��� �ش� �ڷ������� ū �ڷ������� �������ָ� �ȴ�.
		
		int inum = bnum;
		System.out.println(++inum);
		
		for( int i =0; i<300; i++ ) {
			System.out.println(++bnum);
		}
//		��ġ ����콺�� ��ó�� �ȿ��� �ݺ��Ǹ� ����.
	}

}
