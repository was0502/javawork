package _04_car;

public class T01_api_car {
	String company = "KIA";
	String model = "K5";
	String color = "Math.random";
	int start;
	int speed = 10;
	boolean power; // 기본값 : false
	
	void power() {
		power = !power;
		if(power)
			System.out.println("시동 키기");
		else
			System.out.println("시동 끄기");
	}

	int speedUP() {
		speed++;
		return speed;
	}
	
	int speedDown() {
		speed--;
		return speed;
	}
	
	int start(int startInput) {
		start = startInput;
		return start;
	}

}
