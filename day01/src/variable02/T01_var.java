package variable02;

public class T01_var {

	public static void main(String[] args) {
		/* rlqhswkfygud
		 * 점수 : int
		 실수 : double
		 참, 거짓 : boolean
		 문자1개 
		 */
		// crtl + /
		/* ctrl + shitt + / */
		/*
		 정수 타입 : 
		 * btye(1byte) 
		 * char(2byte) 
		 * short(2byte)
		 * int(4byte)
		 * long(8byte)
		 */
		int num1;
		int num2 = 10;
		
		num1=11;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1 + num2);
		System.out.println(num1 *2 + num2);
		
		int sum = num1 + num2;
		System.out.println("num1=num2="+sum);
		
		int num3 = sum + 5;
		System.out.println(num3);
		
		long long01 = 50000000000000L;
		
		double doub01 = 37.93849283;
		System.out.println(doub01);
		double doub02 = 78.9283;
		System.out.println(doub01+doub02);
		// 기본자료형 8byte 를 float 4byte에 (큰자료형을 작은 자료형에) 넣어서 오류남
		float float01 = 45.829384723f;
		System.out.println(float01);
	}

}
