package _02_method;

public class T01_api_method {
	//반환형이 없는 메소드
	void print1() {
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	
	}

	int print2() {
		System.out.println("반환값이 int 매개변수도 없는 메소드");
		int result = 10;
		return result;
	}	
	String print3() {
		System.out.println("반환값이 String이고 매개변수");
		return "반환되는 문자";
	}
	// 매개변수
	void print4(int x) {
		System.out.println(x);
	}
	
	int print5(int x, int y) {
		int result = x+y;
		return result;
	}
	 void print6(String str, int z) {
		 System.out.println("입력한 문자열 : ");
		 System.out.println("입력한 숫자");
	 }
}
