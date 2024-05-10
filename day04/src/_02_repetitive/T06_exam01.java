package _02_repetitive;

import java.util.Scanner;

public class T06_exam01 {

	public static void main(String[] args) {
		// 주사위의 숫자 맞추기 게임
		
		// com의 숫자는 1~6
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 6) +1;
		int user;
		do {
			System.out.println("주사위의 숫자를 맞춰보세요 : ");
			user = sc.nextInt();
			
			if(com == user)
				System.out.println("축하합니다. 맞췄습니다.");
			else
				System.out.println("틀렸습니다. 다시 입력하세요");
		} while(com != user);
		
		//for문을 이용하여 반복 합계 연산
		System.out.print("5의 배수의 합계는: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=5; j<=5; j++) {
				System.out.println("");
		int sum = 0;
		sum += i;
		}
			}
			System.out.println();
		
		}


}
