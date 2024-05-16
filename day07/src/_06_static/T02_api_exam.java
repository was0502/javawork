package _06_static;

public class T02_api_exam {
	//매개변수가 없는 생성자
	//매개변수로 empName, dept,job
	int salary;
	double bonusPoint;
	
	T02_api_exam() {
		salary =salary;
		bonusPoint = 0.05;
		System.out.println("매개변수가 없는 생성자");
	}	
	
	T02_api_exam(int salary) {
		this.salary =salary;
		bonusPoint = 0.05;
		System.out.println("매개변수가  1개인 생성자");	
		
	}
	T02_api_exam(int salary, double bonusPoint) {
		this.salary =salary;
		bonusPoint = 0.05;
		System.out.println("매개변수가  2개인 생성자");
		
		void method(int...salary) {
			System.out.println("인자가 0개 이상");
		}

		
	}
}
