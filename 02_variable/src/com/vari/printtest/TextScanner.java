package com.vari.printtest;

import java.util.Scanner;

public class TextScanner {

	public static void main(String[] args) {
//		 ** ���� ���� �Է� �ޱ� **
//		Scanner���� char �Է� �޴� �޼ҵ�� ���� ����.
//		String�� �����ϴ� �޼ҵ带 ���� ���� ���ڸ� ������ �� �ִ�. (�迭 ����)
//		���� �� / �� / ���̶�� ���� ���ڸ� ��ǻ�ʹ� �ν� X 
//		�ڵ�� ����� ������ �������� '�����'�� ����ϴ� ��
//		�׷��� ��ǻ�ʹ� unicode�� �̸� �޾Ƽ� [��][��][��]���� �迭 �����ϰ�
//		String ���� ��ü�� �̸� �����ִ� �ϳ��� �迭�� �ȴ�.
		char[] character = new char[3];// �̷�������
//		�׸��� �� �迭���� 
		character[0] = '��';
		character[1] = '��';
		character[2] = '��';
//		�̷��� ���̴�. 
//		�׸��� ���ڿ��� �̵��� ��� ��Ƽ� ������ش�.
		char exam = character[0];
		char exam1 = character[1];
		char exam2 = character[2];
		System.out.println(exam + exam1 + exam2);
//		 ---------- ������ ���� ----------
		char first = "ABC".charAt(0);
//		String���� 0�� �迭 ��ü�� ��ġ�� ã�°���
		System.out.println(first);
		char second = "ABC".charAt(1);
		System.out.println(second);
		char third = "ABC".charAt(2);
		System.out.println(third);

//		String indexOutOfBound : �ε��� ���� �ʰ�
//		char fourth = "ABC".charAt(3);
//		System.out.println(fourth);
		
		String name1 = "�̿��";
		 char char1 = name1.charAt(1);
		 System.out.println(char1);
				
//		 Scanner�� ���ؼ� �Է� ���� ���� charAt���� ����������?
		 Scanner sc=new Scanner(System.in);
		 System.out.println("�ѱ��� �Է� : ");
//		  sc.nextLine().charAt(2); //�̷������� �������� �ǰڳ� 
		 char key = sc.nextLine().charAt(0);
		 System.out.println(key);

		 
//		 �����ڵ�� ����ȯ
		 System.out.println((int) key);

	}
	

}
