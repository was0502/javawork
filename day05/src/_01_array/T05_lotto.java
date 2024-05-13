package _01_array;

public class T05_lotto {

	public static void main(String[] args) {
		// p122
		
		//1. 6개의 1차원 배열
		//2. 1~45숫자를 랜덤으로 추출
		//3. 배열에 들어있는 값과 랜던추출한값이 같은가 비교
		//3.1.		같은값이면 다시 랜덤추출(2번으로 돌아감)
		//3.2.		다른면 배열에 넣기,
		//4. 6개의 배열이 꽉 찰때까지 반복
		
		int lotto[] = new int [6];
		
		int index = 0;
		while(true) {
			int temp = (int)(Math.random()*45) + 1;
			
			boolean insert = true; // 배열에 들어갈 값과 temp의 값이 다르면
			for(int i=0; i<index; i++) {
				if(lotto[i] == temp) {
					insert = false; //배열에 들어갈 값과 temp의 값이 같으면
					break;
			}
		}
		
		if(insert==true) {	//insert가 true이면 lotto배열에 temp값 넣기
			lotto[index]= temp;
			index++;
		}
		
		if(index==6 ) break;
	}
	
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
			
			// insert의 값이 true이면 배열에 temp의 값을 넣어줌.
		}
	}
}
