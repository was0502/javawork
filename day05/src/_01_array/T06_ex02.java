package _01_array;

import java.util.Arrays;
import java.util.Scanner;


public class T06_ex02 {

	public static void main(String[] args) {
		// 1.길이 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		int[] arrayInt1 = new int[10];
		
		for(int i=0; i<10; i++) {
			arrayInt1[i] = i+1;
		}
		System.out.print(Arrays.toString(arrayInt1)+"\n");
		// 2.길이 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		int[] arrayInt2 = new int[10];

		for(int i=10; i>0; i--) {
			arrayInt2[10-i] = i;
		}
		System.out.print(Arrays.toString(arrayInt2));
		System.out.println();
		//2.1 
		int[] iArr22 = new int[10];
		for(int i=0; i<iArr22.length; i++) {
			iArr22[9-i] = i+1;
		}
		for(int i=0; i<iArr22.length; i++) {
			System.out.print(iArr22[i] + ", ");
	}
		System.out.println();
		System.out.println();
		
		//2.2
		int[] iarr24 = new int[10];
		
		int count = 10;
		for(int i=0; i<iarr24.length; i++) {
			iarr24[i] = count--;
			System.out.print(iarr24[i] + ", ");
		}
		System.out.println();
		System.out.println();
		// 3.사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		Scanner scan = new Scanner(System.in);

			System.out.print("배열의 갯수 입력 : ");
			int count2 = scan.nextInt();
			
			int[] iarr3 = new int[count2];
			for(int i=0; i<iarr3.length; i++) {
				iarr3[i] = i+1;
				System.out.print(iarr3[i] + ", ");
			}
			System.out.println();
			System.out.println();
	
			
		// 4. 길이가 5일 배열에 사과, 귤, 포도, 복숭아, 참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
			String names [] = { "사과", "귤", "포도", "복숭아", "참외"};
			System.out.println(names[1]);
			System.out.println();

		// 5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
			//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
			System.out.print("문자열 : ");
			String str = scan.next();
			System.out.print("찾을 문자 : ");
			char search = scan.next().charAt(0);
			
			char[] carr5 = new char[str.length()];
			int count5 = 0;
			String index1 = ""; 
			
			for(int i=0; i<str.length(); i++) {
				carr5[i] = str.charAt(i);
				if(carr5[i] == search) {
					index1 += i + " ";
					count5++;
				}
			}
			System.out.println(str + " 에 " + search + "가 존재하는 위치(인덱스) :" + index1);
			System.out.println(search + " 개수 : " + count5);
			System.out.println();
		
		// 6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아 숫자와 같은 요일 출력
		char[] days = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.println("0~6사이 숫자 입력 : ");
		int iarr6 = scan.nextInt();
		
		if(iarr6 >= 0 && iarr6 <= 6) {
			System.out.println(days[iarr6] + "요일");
		} else {
			System.out.println("잘못 입력하였습니다");
			}
		System.out.println();
		
		// 7.사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
		// 배열 전체의 합 출력
		System.out.print("배열의 개수 입력 : ");
		int count7 = scan.nextInt();
		
		int[] iarr7 = new int[count7];
		int sum = 0;
		
		for(int i=0; i<iarr7.length; i++) {
			System.out.println(i+1 + "번째 값 입력 : ");
			iarr7[i] = scan.nextInt();
			sum += iarr7[i];
		}
		
		System.out.println(Arrays.toString(iarr7));
		System.out.println("합계 : " + sum);
		System.out.println();
		
		
		//8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		// 다시 정수를 받도록 하세요. 
		while(true) {
			System.out.print("정수 입력 : ");
			int num8 = scan.nextInt();
			
			if(num8 >= 3 && num8%2 == 1) {
				int iarr8[] = new int[num8];
			int value = 1;
			for(int i=0; i<iarr8.length; i++) {
				if(i < num8/2)
					iarr8[i] = value++;
				else 
					iarr8[i] = value--;
				 
				if(i < iarr8.length-1)
					System.out.print(iarr8[i] + ", ");
				else
					System.out.print(iarr8[i]);
			}	
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
			}
			System.out.println();
		
		//9. 사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		String[] chickens = {"양념", "후라이드", "파닭", "허니버터"};
		System.out.print("치킨 이름 입력 : ");
		String menu = scan.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break;
			}	
		}
		
		if(flag)
			System.out.print(menu + "치킨 배달 가능");
		else
			System.out.print(menu + "치킨 배달 불가능");
			
	
		//10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	    // 1~10 사이의 난수를 발생시켜 배열에 초기화 후
	    //배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int[] iarr10 = new int[10];
		for(int i=0; i<iarr10.length; i++) {
			iarr10[i] = (int)(Math.random()*10)+1;
			System.out.println(iarr10[1] + " ");
		}
		
		int min = iarr10[0];
		int max = iarr10[0];
		
		for(int i=1; i<iarr10.length; i++) {
			if(min > iarr10[i])
				min = iarr10[i];
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최대값 : " + max);
	}
	

}
