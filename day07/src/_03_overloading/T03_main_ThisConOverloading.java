package _03_overloading;

class ThisAaa {
	int num;
	double dou;
	String name;
	//생성자에서 this() : 다른 생성자 호출
	// this()는 맨 첫줄에 있어야 됨
	
	ThisAaa() {
	}
	ThisAaa(int num) {
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 없는 생성자");
	}
	ThisAaa(int num, double dou) {
		this.num = num;
		this.dou = dou;
		name = "홍길동";
		System.out.println("매개변수가 2개인 생성자(int, double)");
	}

	ThisAaa(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = "김주영";
		System.out.println("매개변수가 3개인 생성자");
	}

	// 가변인자 : 들어올 인자의 객수를 모를때
	// 
	void method(int...num) {
		System.out.println("인자가 0개 이상");
	}
	// (String num, String...str) : 인자는 1개 이상
	void method(String num, String...str) {
		System.out.println("인자가 반드시 1개 이상");
	}
	// 오류 : 모든 인자는 가변인자에 들어감
	/*
	 void method(String...str.
	 */
}

public class T03_main_ThisConOverloading {

	public static void main(String[] args) {
		Aaa a1 = new Aaa();
		Aaa a2 = new Aaa(5,10.56, "나야나");
		Aaa a3 = new Aaa(10, "문자열");
		Aaa a4 = new Aaa(50, 50.1234);
		a4.method(5);
		a4.method("문자");
		a4.method();		
		
	}
}
