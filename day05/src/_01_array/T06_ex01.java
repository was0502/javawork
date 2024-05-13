package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T06_ex01 {

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
		// 3.사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		
		Scanner cs= new Scanner(System.in);
		
		int num1 = cs.nextInt();
		
		int[] arrayInt3= new int[num1];//0123
		for(int i=0;i<arrayInt3.length;i++)
			arrayInt3[i]=i+1;
		
		System.out.print(Arrays.toString(arrayInt3));
		/*int index = 1;
		while(true) {
			int temp = (int)(Math.random()*45) + 1;
		// 4. 길이가 5일 배열에 사과, 귤, 포도, 복숭아, 참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
			int[] arrayInt4 = new int[5];
			int[][] fru = {
					{ 사과, 귤, 포도, 복숭아, 참외} // [0]
					//[0][1][2][3][4]
					};
		
			for(int i=0; i<5; i++) {
				arrayInt4[i] = i+1;
				System.out.println(arrayInt1[i] + ", ");
			}
		}*/
	}

}
