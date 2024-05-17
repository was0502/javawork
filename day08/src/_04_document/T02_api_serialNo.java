package _04_document;

public class T02_api_serialNo {
	String name;
	int count;
	
	T02_api_serialNo() {
		System.out.println("main" + "()");
		System.out.println("new Product" + "();");
	}
	
	T02_api_serialNo(String name) {
		this.name = name;
		System.out.println("시리얼 번호:" + "더조은 1");
		System.out.println("new Product" + "();");
		System.out.println("시리얼 번호:" + "더조은 2");
		System.out.println("생산된 제품의 총 갯수:" + "2");
	}
}
