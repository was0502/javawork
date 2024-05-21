package _01_polymorphosm;

public class Pet {

	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	// 추상 메서드 : 선언부만 있고 실행부가 없는 메서드
	// 			  선언부만 있고 실행부가 없는 메서드
	//			  상속받는 곳에서 받드시 구현해야됨

	void sound() {
		System.out.println("울음소리");
	}
	void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	}
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
}