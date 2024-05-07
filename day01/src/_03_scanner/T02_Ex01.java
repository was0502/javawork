package _03_scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		
		System.out.print("국어 점수를 입력하세요 : ");
		int score = scan.next(); // 문자열의 단어
		System.out.println("국어 점수 " + score);
		
		System.out.print("컴퓨터 점수를 입력하세요 : ");
		int score = scan.nextInt();
		System.out.println("컴퓨터 점수 : " + score);
		
		System.out.print("수학 점수를 입력하세요 : ");
		double score = scan.nextDouble();
		System.out.println("수학 점수"+ score);

		// 총점과 평균을 출력하세요.
	    System.out.printf("총점은 %d 이고, 점수 평균은 %f입니다");
	}

}