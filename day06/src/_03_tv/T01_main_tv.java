package _03_tv;

import java.util.Scanner;

public class T01_main_tv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T01_api_tv tv1 = new T01_api_tv();
		System.out.println("회사명 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println(tv1.inch + "인치");
		
		tv1.power();
		//	System.out.println("tv상태 : " + tv1.power);
		System.out.println("tv켜기 : " + tv1.power);
		System.out.println("현재 채널 : " +tv1.channelUP());
		System.out.println("현재 채널 : " +tv1.channelUP());
		System.out.println("현재 채널 : " +tv1.chennelDown());
		System.out.println(tv1.volume(12));
		tv1.power();
		// System.out.println("tv상태 : " + tv1.power);
	}

}
