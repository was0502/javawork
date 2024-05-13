package _02_repetitive;

import java.util.Scanner;

public class T07_exam02 {

	public static void main(String[] args) {
		// 1 for문을 이용하여 반복 합계 연산
		   
		int sum = 0;
		for(int i=5; i<=100; i+=5) {
	    	sum += i;
		}
		System.out.println("5의 배수의 합계 " + sum);
		
		// 2 for문을 이용하여 반복 합계 연산
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i=1; i<=100; i++) {
			if(i%2==0) 
				evenSum += i;
			else
				oddSum += i;
		}
		System.out.println("짝수의 합계는 : " + evenSum);
		System.out.println("홀수의 합계는 : " + oddSum);
		System.out.println("-----------------");	
	
		// 3 주사위 합이 6이 되는 모든 경우의 수
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x+y == 6) {
					//System.out.println("("+x+", "+y+")");
					System.out.printf("(%d,%d)\n", x,y);
				}
		}
	}
		System.out.println("------------------------");
		// 4 이중 for문을 이용하여 점찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		// 5.
		for(int i=5; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		// 6.
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int x=1; x<i*2+1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		// 7.
		int count = 1;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
				System.out.println("(" + num + ")");
				if(num == 6) {
					break;
			}
			count++;
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count);
	}

}
