package _01_operation;

import java.util.Scanner;

public class T06_ex01 {


	public static void main(String[] args) {
		try (// 1. 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요
		Scanner scan = new Scanner (System.in)) {
			System.out.println("양수 : ");
			int 양수 = scan.nextInt();
			String re3 = 양수 >= 80 ? "양수다" : "양수가 아니다";
			System.out.println(re3);
			
			// 2. 키보드로 입력 받은 하나의 정수가 양수이면 "양수다"
			// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요	
			System.out.println("양수 : ");
			int num1 = scan.nextInt();
			String re2 = num1 >= 80 ? "0이다" : "음수다";
			System.out.println(re3);
			
			// 3. 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요
			String name = scan.next();
			System.out.println("짝수다 : 홀수다");
			
			//4. 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
			// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
			int num2 = 10;
			int num3 = 2;
			int result = num1 % num2;
			System.out.println("몫 : " + num1 / num2);
			System.out.println("나머지 : " + result);
			
			//5. 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
			// 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요.
			String 이름 = scan.next();
			System.out.println("박신우 : ");
			String 학년 = scan.next();
			System.out.println("3 : ");
			String 반 = scan.next() ;
			System.out.println("4 : ");
			String 번 = scan.next() ;
			System.out.println("15 : ");
			String gender = scan.next() ;
			System.out.println("F : ");
			String 성적 = scan.next() ;
			System.out.println("85.75 : ");
			double key = scan.nextDouble();
			
			//6. 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
			// 성인(19세 초과)인지 출력하세요.
			String re = num1 < num2 ? "어린이(13세 이하)" : "청소년(13세 초과 ~ 19세 이하)";
			System.out.println(re);
			System.out.println(num1 < num2 ? "청소년(13세 초과 ~ 19세 이하" : "성인(19세 초과)");
			
			//7. 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
			//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
			//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
			//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
			
			

		}
	    

	}

}
