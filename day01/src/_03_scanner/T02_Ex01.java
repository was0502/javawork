package _03_scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		// 총점과 평균을 출력하세요
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 1개 입력 : ");
		char ch = scan.next().charAt(0);
		// String ch = scan.next();
		System.err.println(ch + "의 유니코드 : ");
		
		System.out.print("국어 점수 입력 : ");
		int kor = scan. nextInt();
		System.out.print("컴퓨터 점수 입력 : ");
		int com = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = scan.nextInt();
	}
}
