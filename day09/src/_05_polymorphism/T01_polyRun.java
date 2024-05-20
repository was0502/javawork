package _05_polymorphism;
class A {int a=1;}
class B extends A {

	public char[] b;}
class C extends A {}
class D extends B {}
class E extends C {}

public class T01_polyRun {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		System.out.println(b.a);
		System.out.println(b.b);
		
		System.out.println(a1.a);
		// System.out.println(a1.b); // A클래스 타입을 형변환했기 때문에 A클래스만 사용할 수 있다
		System.out.println(a2.a); // c변수 사용불가
		System.out.println(a3.a); // d변수 사용불가
		System.out.println(a4.a); // e변수 사용불가
	}
}
