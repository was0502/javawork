package _02_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("100 : ");
		int score = sc.nextInt();
		
		if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else if(score >= 50)
			System.out.println("E학점");
		

	}

}