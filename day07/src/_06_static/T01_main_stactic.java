package _06_static;

public class T01_main_stactic {

	public static void main(String[] args) {
		T01_api_stactic as1 = new T01_api_stactic();
		T01_api_stactic as2 = new T01_api_stactic();
		
		as1.num = 1000;
		System.out.println("as1.num : " + as1.num);
		System.out.println("as2.num : " + as2.num);
			
		as1.sNum = 20000;
		System.out.println("as1.sNum : " + as1.sNum);
		System.out.println("as2.sNum : " + as2.sNum);

	}

}
