package _02_ArrayList;

import java.util.*;

public class T03_ArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i=0; i<10; i++) {
			int random = (int) (Math.random()*10);
			list.add(random);
		}
		System.out.println(list.toString());
		
		list.subList(3,6);
		List<Integer> list2 = new ArrayList<Integer>(list.subList(3,  6));
		System.out.println(list2.toString());
		
		Collections.sort(list);
		
		System.out.println(list);
		
		//
		System.out.println("list는 list2의 요소를 모두 가지고 있는가?" + list.containsAll(list2));
		
		// list와 list2의 요소중 교집합만 남기고 모두 삭제
		System.out.println("교집합 : " + list.retainAll(list2));
		System.out.println(list);
		System.out.println(list2);
		
		list.clear();
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		list.set(4, 3);
		list2.add(7);
		list2.add(3);
		System.out.println("----------------------");
		
		//문제. list2의 객체가 list에 들어 있으면 삭제, 출력

		for(int i=list2.size()-1;i>-0; i++) {
			if(list.contains(list2.get(i))) 
					list2.remove(1);
	}
		System.out.println(list);
		System.out.println(list2);
	}
}
