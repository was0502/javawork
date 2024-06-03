package _06_Function;

import java.util.*;
import java.util.function.*;

public class T02_Function {
	// 클래스 변수
		static List<Student> list = Arrays.asList(
				new Student("김주영", 79, 100),
				new Student("김주일", 84, 89),
				new Student("김주이", 79, 100),
				new Student("김주삼", 75, 47),
				new Student("김주사", 79, 100)
	);
	
	// 출력메소드
	static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	// 평균 출력 메서드
	// 반환형 double (ToIntFuntion)
	static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum+= function.applyAsInt(student);
		}
		double avg = (double)sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double engAvg = avg(t -> t.getEng());
		System.out.printf("[영어 평균 점수] = %.2f", engAvg);
		
		double comAvg = avg(t -> t.getCom());
		System.out.printf("[컴퓨터 평균 점수] = %.2f", comAvg);

		
	}

}
