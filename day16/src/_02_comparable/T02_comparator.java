package _02_comparable;

import java.util.*;

class Decending implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2);
		}
		return -1;
	}
}
public class T02_comparator {
	public static void main(String[] args) {
		String[] strArr = {"cat", "dog", "lion", "tiger"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Decending());
		System.out.println(Arrays.toString(strArr));
	}

}
