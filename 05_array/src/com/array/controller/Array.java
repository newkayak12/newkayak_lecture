package com.array.controller;

import java.util.*;

public class Array {

	Scanner scn = new Scanner(System.in);
	
	public void basicArray() {
//	배열은 동일한 자료형의 변수 여러 개를 관리하는 것
//		배열의 선언은 변수와 비슷함 자료형 뒤에 []를 붙이거나 변수명 뒤에 []를 붙여준다.
//			배열은 선언을 한다고 바로 사용할 수 없다. 선언 후 바로 할당을 해줘야 한다. 
//			 	얘도 객체형식
//					할당은 new 연산자를 통해서 할당함 new 자료형[생성할 변수의 갯수]
//		자료형 [] 변수명 = new 자료형[ 배열의 개수];
		
//		배열 선언하기
		
		int[] nums;
		nums=new int[5];
//		혹은
		int[] nums2= {1,2,3,4,5};
//		혹은
		int[] nums3= new int[5];
//		int[] nums4= new int[]
		System.out.println("nums[0] did not initialize :"+ nums[0]);
//		따로 초기화 안 하면 모든 타입의 기본값이 들어간다. int는 0 double은 0.00 String은 "null" char는 ' '(공백)
		
		nums[0]	= 100;
		System.out.println("nums[0] initialized : " + nums[0]);
		
		
//		길이(index 번호)의 최대값을 넘어서 접근을 하면 어떻게 될까
//		System.out.println(nums[6]);
//		ArrayIndexOutOfBoundsException
		
		
		String[] names = new String[3];
		names[0]="김상현";
		names[1]="정유정";	
		names[2]="권설영";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	
	}
	
	public void arrayWithFor() {
		String[] names = new String[3];
		names[0]="김상현";
		names[1]="정유정";	
		names[2]="권설영";
			for(int i=0; i<=2; i++) {
				System.out.println(names[i]);
			}
	}
	
	
	public void arrayWithFor2() {
		String[] str=new String[3];
			for(int i=0; i<3; i++) {
				str[i]="cheer up!";
					System.out.println(str[i]);
			}
	}
	
//	배열로 생성된 저장공간(변수) 자료형이 고정됨.
//	int[] ages = new int[5];
//	ages[0]=100; > 가능하죠
//	ages[1]="김상현" > 안되죠?? 타입이 호환이 안되니까
	public void stringArray() {
//	int age = Integer.parseInt("자료");
//	System.out.println(age);
//	
//	runtime exception
	
	
	
//	저장공간이 3개인 String배열을 만들고
//	3개의 주소를 입력받고 각 배열에 저장하고 출력
	
		
		String[] adr= new String[3];
		
			for(int i = 0; i<adr.length; i++) {
					System.out.print("enter address : ");
				
				adr[i] = scn.nextLine();
				
				
			}
			
			
			for(int i=0; i<adr.length; i++) {
				System.out.println(adr[i]);
			}
			
			System.out.println(adr);
//			배열에서 그냥 변수를 부르면 해시코드가 호출되네????? 
//			toString이랑 같은 결과가 나오는구나
//			즉, 스택에 저장된게 해시코드라는게 맞는거네
	}
	
	
	
	public void stu() {
		String[] stuName = new String[5];
		stuName[0]="지수현";
		stuName[1]="김상현";
		stuName[2]="홍서연";
		stuName[3]="이진주";
		stuName[4]="이우식";
		
		for(int i=0; i<stuName.length; i++) {
			if(stuName[i].equals("김상현")) {
				System.out.println(stuName[i]);
			}
		}
		
//		여기서 equals에 들어가는 변수를 next();로 받으면 이게 검색이겠지??
	}
	
	public void search() {
			System.out.print("search : ");
			
		String search = scn.next();
		String[] stuName = new String[5];
		stuName[0]="지수현";
		stuName[1]="김상현";
		stuName[2]="홍서연";
		stuName[3]="이진주";
		stuName[4]="이우식";
//		String error = search.substring(0, 3);
		for(int i=0; i<stuName.length; i++) {
			if(stuName[i].equals(search)) {
				System.out.println("검색 결과 '"+ stuName[i]+"'이 존재합니다.");
			} 
				
			}
		System.out.println(search+ "에 대한 결과 값이 존재하지 않습니다.");
	}
	
	
	
//	배열을 생성과 동시에 초기화 하기 
	
	public void arrInitailize() {
//		double[] height = new double[10];
//		height[0]=180.5;이렇게 했었는데
		
		
		double[] height = {180.2,171.1,169.4,188.5,190.4};
		
//		선언과 동시에 초기화했잖아?? 
//
			for(int i =0; i<height.length; i++) {
				System.out.println(height[i]);
			}
		
//		그러면 이렇게 하는 것도 가능할까??
			
			double [] weight = new double[4];
//			weight= {1,2,3,4};
//			이렇게는 안된다...
			
			weight = new double[] {1,2,3,4};
//			이거는 된다.
			
			
			for(int i = 0; i<weight.length; i++) {
				System.out.println(weight[i]);
			}
	}
	
	
	
	
//	배열 저장 공간의 활용
	public void arrChange() {
//		배열에 저장된 데이터들 간의 위치 조정
//		배열에는 순서가 있는데, 그 순서를 변경하는 것
		int[] num= {1,3,5,4,2,6};
//		위치 변경
			for(int i =0; i<num.length; i++) {
				System.out.print(num[i]+ " ");
			}
			
			int copy= num[2];
//			버퍼 역할을 해줄 녀석을 하나 또 선언해야하는데...?
			num[2] = num[3];
			num[3] = copy;
		System.out.println();
		for(int i =0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
	}
	
	
//	정렬
	public void arrOrder() {
		int[] num= {1,3,5,4,2,6};
//			for(int i=0; i<=num.length-2; i++) {
//				
//				if(num[i]>num[i+1]) {
//					int copy = num[i];
//					num[i] = num[i+1];
//					num[i+1]=copy;
//				}
//			}
//			
//			for(int i=0; i<=num.length; i++) {
//				System.out.println(num[i]);
//			}
//		이렇게 하면 한 번만 비교하는거니까
		System.out.println("원래 배열");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+ " ");	
		}
		System.out.println("\n");
		
		
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				System.out.println("i의 " + num[i]+" / " + "j의 " +  num[j]);
				System.out.println();
				if(num[i]<num[j]) {
					int copy = num[i];
					num[i] = num[j];
					num[j]=copy;
					System.out.println("현재 배열 상태 ");
						for(int k=0; k<num.length; k++) {
							System.out.print(num[k]+" ");
							
						}
					System.out.println("\n\n");
					System.out.println("***"+ num[i]+"이랑 "+ num[j]+"이/가 바뀜***");
					System.out.println();
				}
			}
		}
		System.out.println("오름차순");
		for(int i =0; i<num.length; i++) {
			System.out.println(num[i]+ " ");
		}
	System.out.println();
		System.out.println("내림차순");
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(num[i]>num[j]) {
					int copy = num[i];
					num[i] = num[j];
					num[j]=copy;
				}
			}
		}
		for(int i =0; i<num.length; i++) {
			System.out.println(num[i]+ " ");
		}
		
	}	
		
		
		
		
		
		
		public void tenArray() {
//		int 10개의 배열을 선언하고
//		값을 대입하고
//		그 값에서 짝수만 출력
			int evenCount = 0;
			int oddCount = 0;
			int numbers[] = new int[10];
			
				for(int i = 0; i<numbers.length; i++) {
					
					int num =(int) (Math.random()*100)+1;
					numbers[i]=num;
						System.out.print(numbers[i]);
						
						if(numbers[i]%2==0) {
								System.out.println(" 는 짝수");
								evenCount++;
						} else if(numbers[i]%2==1) {
								System.out.println(" 는 홀수");
								oddCount++;
						}
						
				}
				
				System.out.println("\n짝수의 개수는 : " + evenCount +"\n홀수의 개수는 : " + oddCount);
			
		}
	
//	랜덤 숫자 출력하기...
		public void randomTest() {
//			Math라는 클래스에서 제공하는 random 메소드를 이용한다. 
			double ran= Math.random();
			System.out.println(ran);
			
//			정수를 출력하려면??
			//step 1 자릿수만큼 곱하기
			System.out.println(Math.random()*10);
			//step 2 int로 강제 형 변환해서 소수점 자리 날리기
			System.out.println((int) (Math.random()*10));
			//* 실수 많이 하는 것 
			System.out.println((int) Math.random()*10);
			//이러면 0.123123123 하는 수를 int로 바꿔서 0으로 만들고 *10을 하는 실수
			
			
			System.out.println((int)(Math.random()*5)+1);
		}
		
		public void lottery() {
			System.out.println("===이번 주 로또 번호===");
			int lott[] = new int[6];
			for(int i = 0; i<lott.length; i++) {
				lott[i]=(int)(Math.random()*45+1);
					for(int j = 0; j<=i; j++) {
						if((i!=j)&&(lott[i]==lott[j])) {
							lott[j]=(int)(Math.random()*45+1);
						}
					}
			System.out.print(lott[i]+ " ");	
			}
		}
		
		public void ranNum() {
			int[] num = new int[6];
			for(int i =0; i<num.length; i++) {
				num[i] =(int) (Math.random()*28+1);
				
				System.out.print(num[i]+" ");
			}
		}
//		변수가 많아지는 것도 알고리즘에서 공간 복잡도가 올라가서 그렇게 안 하는게 나을 수도 있다. 
//		만약 변수를 적어도 두 번 이상 사용한다고 하면 고려해볼 만 하지!
		
//		랜덤값 출력 > 한 가지가 더 있다.
//		Random객체를 이용할 수 있다. 
//		Random객체의 nextInt();라는 기능을 이용한다.
		
		
		public void anotherRandom() {
			System.out.println(new Random().nextInt());
//			객체 생성해야지 클래스인데? 얘도 util에 있네
//			범위는 어떻게 설정해????????????????
			System.out.println(new Random().nextInt(10)+1);
			
//			new Random().nextInt();
//			Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence. The general contract of nextInt is that one int value is pseudorandomly generated and returned. All 232 possible int values are produced with (approximately) equal probability.
//			The method nextInt is implemented by class Random as if by:
//
//			 public int nextInt() {
//			   return next(32);
//			 }}
//			Returns:
//			the next pseudorandom, uniformly distributed int value from this random number generator's sequence
		}
		
		
		public void copyArray() {
//			 1. 얕은 복사
//			 	ㄴ 배열명의 주소 값을 복사 > 객체 파라미터로 넘길 때 사용
//			2. 깊은 복사
//				ㄴ 배열에 연결되어 있는 객체까지 통쨰로 복사 >
			
			//1. 얕은 복사
			String[] hobby= {"스마트폰", "축구", "낚시", "청소"};
			String[] hobby2=hobby;
			
			System.out.println("얕은 복사 해시값");
			System.out.println(hobby);
			System.out.println(hobby2);
			
			
			
//			오 재밌어!!!!! api 가 이렇게 구성돼있구나!
//			System.out.println(new Random().toString());
//			System.out.println(hobby.toString());
			hobby2[0]="잠자기";
//			System.out.println(hobby2[0]);
//			System.out.println(hobby[0]);
			
			//2.깊은 복사
			String[] hobby3 = new String[hobby.length];
				for(int i =0; i<hobby.length; i++) {
					hobby3[i]=hobby[i];
				}
				System.out.println("\n깊은 복사 결과\n");
				for(String hob :hobby3) {
					System.out.println(hob);
				}
				System.out.println();
				
//				향상된 for 사용
				System.out.println("깊은 복사 해시값");
				System.out.println(hobby);
				System.out.println(hobby3);
				
				String[] hobby4 = new String[hobby.length];
//				복사하는 메소드
				System.arraycopy(hobby2,0,hobby4,0,hobby4.length);
//				System.arraycopy(원본, 시작점, 복사 받을 녀석, 시작점, 끝점);
				System.out.println("\n System.arraycopy 메소드 사용");
				for(String hob : hobby4) {
					System.out.println(hob);
				}
		}
//		배열은 new 연산자로 heap 영역 안에 생긴다. 그 안에 저장공간이 생겼을 떄 초기값이 무조건 필요하다.
//		만약 초기화를 하지 않으면 java에서 그냥 초기값을 대입해서 이 문제가 발생하지 않게 해준다.
		
//		System.arraycopy(); 이거 책에서 다시 보기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		
		
		
	
}
