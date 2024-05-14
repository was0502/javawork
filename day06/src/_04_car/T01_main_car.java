package _04_car;

import java.util.Scanner;

import _03_tv.T01_api_tv;

public class T01_main_car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T01_api_car car1 = new T01_api_car();
		System.out.println("회사명 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println(car1.color + "색");
		
		car1.power();
		//	System.out.println("car상태 : " + car1.power);
		System.out.println("시동켜기 : " + car1.power);
		System.out.println("현재 채널 : " +car1.speedUP());
		System.out.println("현재 채널 : " +car1.speedUP());
		System.out.println("현재 채널 : " +car1.speedDown());
		System.out.println(car1.speedUP());
		car1.power();
		// System.out.println("car상태 : " + car1.power);
	}

}
