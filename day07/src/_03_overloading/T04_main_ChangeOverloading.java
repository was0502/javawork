package _03_overloading;

class Over1 {
	// 오버로딩의 조건
	// 1. 메서드 이름이 같아야 한다
	// 2. 매개변수의 개수가 다르던지 자료형이 달라야 한다
	int add() {
		return 0;
	}
	int add(int num1) {	
		return num1;
	}

	int add(int num1, int num2) {
		return num1 + num2;
	}
	double add(int num1, double num2) { // 리턴 자료형은 상관없음
		return num1 + num2;
	}
	String add(String name) {
		return "이름 : " + name;
	}
}
	public class T04_main_ChangeOverloading {
		public static void main(String[] args) {
			Over1 o1 = new Over1();
			System.out.println(o1.add(3,5));
			System.out.println(o1.add(7));
			System.out.println(o1.add("김주영"));

	}
}
