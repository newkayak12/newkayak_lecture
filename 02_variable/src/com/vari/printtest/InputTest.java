package com.vari.printtest;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		//	Ű���忡�� �Է��� �� �������� + Ram�� �����ϱ�
		Scanner scanner = new Scanner(System.in);
//		ScannerŬ������ �̿��Ѵ�. �ڹ� �⺻ API�� ���Ե�
//		��ĳ�ʴ� java.util��Ű���� ����
//			1. java.util.Scanner�� import�Ѵ�.
//			2. Ŭ������ ����Ϸ��� �ݵ�� �����ڸ� �����Ѵ�. (new �����ڸ� �̿��ؼ�)
//				new Ŭ������();  > new Scanner(System.in);
//				��� ������ ��ü�� 
//			3. Scanner�� �����ϴ� ��� ( �޼ҵ� )�� �̿��ؼ� Ű���� �Է� ���� �����´�.
//					
//						Scanner�� �����ϴ� ���
//		    1. nextInt(), nextDouble(), next(), nextLine()
//				nextInt() : int Ÿ���� ������ �޴´�.
//				nextDouble() : double Ÿ���� ���� �޴´�.
//				next() : ���ڿ�(String)�� �޴´�. / ���⸦ �������� �����´�. 
//											> ���� ���� ���ڸ� ������
//				nextLine() : ���ڿ��� �޴´�.  / ������ �������� �����´�. 
//											> ���� ���� ���ڿ��� ������. 

		
//		String input;
//		input = scanner.next();
//		System.out.println(input);
//		
//		System.out.print("�Է����ּ���");
//		int input;
//		input = scanner.nextInt();
//		System.out.println(20+input);
		
		String input0;
		System.out.print("����� �̸��� �Է����ּ��� >");
//		input0 = scanner.next();
		input0 = scanner.nextLine();
		
		int input1 ;
		System.out.print("����� ���̸� �Է����ּ��� > ");
		input1 = scanner.nextInt();
//		������ �Է� ���� �� ��
//		����ڰ� ���ϰ� ����� �� �ְ� ���������Ѵ�. UX���� ���ؼ�!
		
		double input2;
		System.out.print("����� Ű�� �Է����ּ��� > ");
		input2 = scanner.nextDouble();
//		�Ǽ��� �Է� ���� ��
		
		
		
		String input3;
		System.out.println("����� �ּҸ� �Է����ּ���. >");
		input3 = scanner.next();
//		���� String���� ���Ⱑ �ʿ䰡 ����. next()�� ������ 
		scanner.nextLine();
		System.out.println(" �ּ� 2");
		String input4 = scanner.nextLine();
//		���� String���� ���Ⱑ �ʿ��ϴ�! nextLine()
		
		System.out.println(input0);
		System.out.println(input1 + "age");
		System.out.println(input2 + " cm");
		System.out.println("next" + input3);
		System.out.println("nextLine" + input4);
		
//		����, �Ǽ�, ����(next())�� �Է� �ް� nextLine�� �Է� ���� ��� 
//		�ݵ�� buffer�� ��������. nextLine()�� �� �� �� �Է��ؼ� ���۸� ����.
		
//		����?
//		cpu�� �Է� ���� ���� ó���� �� ������ ��ȣ�� ����, 
//		�Է� �޴� �ӵ����� ó�� �ӵ��� �� ������.
//		
//		'����' ��� ���� ��  �� ���� �ӵ� ���̷� �� �� ó���ǰ� ���ٴ� ���ư�
//	
//		�׷��� ����� �߰��� �޸��� 'buffer'�� �ּ� �� ���̸� �޲�
//		�ȳ� �̶�� �Է��� ���� �� ���ۿ��� ���������Ť�\n(enterkey) ���� �Էµǰ�
//		next();�� ����ϸ� ���ۿ� �����ؼ� \n �� ���� �����´�.
//		�׷��� ���� �ܷ����� \n�� ���� ����
//		
//		�� ����  19��� �Է��� �ϸ� \n�� �� ���� int, double next �� �༮�� �� \n�� 
//		����� (�Է�)\n\n\n\n\n\n �̷������� ����
//		�ٵ� nextLine�� \n�� �ν��ϰ� �װ� �״�� ����ع��� �׷��� �̷��� ���� \n�� ���� ���ؼ� 
//		nextLine()���� �� �༮�� ���� �����ش�.
	
	}

}
