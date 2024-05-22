package _05_ArrayListEx;

public class Member {
	private String name;
	private int age;
	private String gender;

	Member() { }
	Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this. gender = gender;
	}
	void setName(String name) {
		this.name = name;
	}
	   String getName() {
		      return this.name;
  }
		void setAge(int age) {
			this.age = age;
		}	
	int getAge() {
		return age;
	}

	void setGender(String gender) {
		this. gender = gender;
	}
	String getGender() {
		return gender;
	}
	 public String toString() {
	      return "이름 : "+this.name + ", 나이 : "+this.age + ", 성별 : "+this.gender;
	}
}
