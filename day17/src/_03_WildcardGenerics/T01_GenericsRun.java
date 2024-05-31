package _03_WildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		/*
	      Applicent<Person> ap = new Applicent<>(new Person());
	      Applicent<Student> ap2 = new Applicent<>(new Student());
	      Applicent<Student> ap3 = new Applicent<>(new HighStudent());
	      */

	      Course.registerCourse(new Applicent<Person>(new Person()));
	      Course.registerCourse(new Applicent<Worker>(new Worker()));
	      Course.registerCourse(new Applicent<Student>(new Student()));
	      Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
	      Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
	      System.out.println("-------------------------------------");
	      
	      //학생만 신청가능
//	      Course.registerCourse(new Applicent<Person>(new Person()));               // 부모 안됨
	      Course.registerCourse(new Applicent<Student>(new Student()));
	      Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
	      Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
	      System.out.println("-------------------------------------");
	      
	      // 직장인과 일반인만 신청 가능
	      Course.registerCourse3(new Applicent<Person>(new Person()));
	      Course.registerCourse3(new Applicent<Worker>(new Worker()));            // worker와 worker의 부모 됨
//	      Course.registerCourse3(new Applicent<Student>(new Student()));
//	      Course.registerCourse3(new Applicent<HighStudent>(new HighStudent()));
//	      Course.registerCourse3(new Applicent<middleStudent>(new middleStudent()));
	}
}