package com.vari.printtest;

public class PrintTest {

	public static void main(String[] args) {

//		System.out.print(); �� System.out.println();�� ���� 
		String name="�����";
		int age = 29;
		double height = 171.1;
		double weight = 70.2;
		char gender= 'M';
		
		
		System.out.println("System.out.print();�� ��� : ");
		System.out.print(name);
		System.out.print(age);
		System.out.print(height);
		System.out.print(weight);
		System.out.print(gender);
		
		System.out.println();
		System.out.println();
		System.out.println("System.out.println();�� ��� : ");
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(gender);
		
		System.out.println();
//		printf(f = ����, ������ ������ �ǹ�)
//		System.out.printf(name, args);
//		�������� �Ǿ� �ְ� "%����", ���� �� ���
		System.out.printf("Ű�� %f �Դϴ�.\n", height);
//		%d : ������ 
//		%c : ����
//		%f : �Ǽ�
//		%s : ���ڿ�
//		%b : ����s
//		%e : ��������ǥ��
//		%g : ���� ��
//		%o : 8����
//		%x : 16����
		
//		���Ĺ��
//		- %5d : 5ĭ�� Ȯ���ϰ� ������ ����
//		- %-5d : 5ĭ�� Ȯ���ϰ� ���� ����
//		- %.2f : �Ҽ��� �Ʒ� 2�ڸ������� ǥ��
		System.out.printf("�̸��� %s �Դϴ�.\n \n", name);
		System.out.printf(" �̸��� %s�Դϴ�. \n ���̴� %d�Դϴ�. \n Ű�� %f�Դϴ�. \n �����Դ� %f�Դϴ�. \n ������ %c �Դϴ�.\n", name,age,height,weight,gender);
		
//		printf�� ���� ����, �Ҽ����ڸ��� ǥ���� ���� �� �� �ִ�.
//		eg) ������, ����, �忬��
		System.out.println();
		System.out.println("println���� ���\n");
		System.out.println("������, 19��");
		System.out.println("����, 20��");
		System.out.println("�忬��, 21��\n\n");
		
//		printf�� ����ϸ� �����ؼ� ����� �����ϴ�.
		System.out.println("printf�� ���� ���\n");
		System.out.printf("%10s %d\n", "������", 19);
		System.out.printf("%10s %d\n", "����", 20);
		System.out.printf("%10s %d\n", "�忬��", 21);
		System.out.printf("%-10s %10d\n", "�����", 29);
//		�Ҽ��� ǥ�ÿ� ���ؼ� ������ �� �ִ�.
		System.out.println("\n\n\n\n");
		
		
		System.out.printf("�Ҽ��� �ټ� �ڸ����� ��� : %f\n", height);
		System.out.printf("�Ҽ��� �� �ڸ����� ��� : %.2f\n", height);
		
//		�����Ը� �Ҽ��� �� �ڸ����� ��� �غ���
		System.out.printf("�Ҽ��� �� �ڸ����� �����Ը� ��� : %.3f\n\n\n", weight);
		
//		printf�� �����α׷��ֿ��� ���� Ȯ���ϴ� ���� �ַ� ���, ������ ���� ������ �ʴ´�.
	
		
		
//	printf�� 
//		���� 000�̰�, ���̴� 00�̰�, ������ 0, Ű�� 00, �����Դ� 00.0 �Դϴ�.
		System.out.printf(" �̸��� %s�Դϴ�.  ���̴� %d�Դϴ�.  Ű�� %.2f�Դϴ�.  �����Դ� %.3f�Դϴ�.  ������ %c �Դϴ�.\n\n", name,age,height,weight,gender);
//		������ �ϴ� ���
		System.out.printf(" �̸��� %s�Դϴ�. \n ���̴� %d�Դϴ�. \n Ű�� %.2f�Դϴ�. \n �����Դ� %.3f�Դϴ�. \n ������ %c �Դϴ�.\n", name,age,height,weight,gender);
	
	
	
	//escape�� = Ư�� ����� �����ϴ� ���� ���ͷ�
		
		System.out.println("-------------------");
//		\t�� ���� ������ ����
		String msg = "�ȳ�     �ϼ��� ";
		System.out.println(msg);
//		/t : �� ����� ���� space 5ĭ�̴�.
		msg = "�ȳ�\t�ϼ̽��?";
		System.out.println(msg);
//		/n : ��
		msg = "�ȳ�\n�ϼ̽��?";
		System.out.println(msg);
//		/' : ' html5�� �� ���ϴ�.
		msg = "\'�ȳ��ϼ̽��?\'";
		System.out.println(msg);
//		/" : " html5�� �� ���ϴ�.
		msg = "\"�ȳ��ϼ̽��?\"";
		System.out.println(msg);
//		'//' = '/'
		msg = "\\�ȳ��ϼ̽��/?";
		System.out.println(msg);
//		��� �����ؼ� C:'\'Users'\'user1�� ���� ���� �� �Ʒ��� ���� ����.
//		
		String path = "C:\\Users\\user1";
		System.out.println(path);

		////////////////     ���� ����� �������... ///////////////////
		/////////////// ���� Ȱ���� �� �ٸ� �����...///////////////

	}

}
