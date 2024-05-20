package _05_polymorphism;
class Parent {
	void method1() {
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}
class Child extends Parent {
	@Override
	void method2() {
		System.out.println("child method2()");
	}
}
public class T02_polyRun {

	public static void main(String[] args) {
		/*
		Child child = new Child();
		Parent parent = child;
		*/
		Parent parent2 = new Child();
		parent2.method1();
		// 오버라이딩한 메소드는 형변환과 상과넝ㅄ이 무조건 개체를 생성한 곳에 들어있는 메소드 호출
		parent2.method2();

	}

}
