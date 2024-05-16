package _06_static;

import _04_ex01.T01_api_book;

public class T02_main_exam {

	public static void main(String[] args) {
		// 보너스 계산하는 메소드(salary, bonusPoint)
		// 메소드 내에서 출력해줌
		
		// 보너스 계산하는 메소드(salary)
		//bonusPoint 0.1로 계산하여
		// 메소드 내에서 출력해줌
		T02_api_exam ps1 = new T02_api_exam();
		T02_api_exam ps2 = new T02_api_exam();


		
		ps1.num = 250000;
		System.out.println("salary : " + ps1);
		System.out.println("bonusPoint : " + ps2);
			
		ps1.sNum = 0.05;
		System.out.println("salary : " + ps1);
		System.out.println("bonusPoint : " + ps2);

		
		
	}

}
