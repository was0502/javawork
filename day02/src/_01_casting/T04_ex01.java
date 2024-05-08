package _01_casting;

public class T04_ex01 {

	public static void main(String[] args) {
	
		
        //3.
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K'; 
	    
	    //3.1
	    System.out.println(iNum1 + "/" + iNum2 + "의 몫 :" + iNum1/iNum2);
	    
	    double result = iNum2 * dNum;
	    System.out.println(iNum2 + " * " + dNum + " = " + result);
	    
	    //3.2
	    double result1 = iNum2 * dNum;
	    System.out.println(iNum2 + " * " + dNum + " = " + result);
	    
	    //3.3
	    System.out.println((double)iNum1);
	    
	    //3.4
	    double result2 = (double)iNum1 / iNum2;
	    System.out.println(result2);
	    
	    //3.5
	    float float1 = iNum1 / fNum;
	    System.out.println(float1);
	    
	    int re = iNum1 / (int)fNum;
	    System.out.println(re);
	    
	    //3.6
	    double result4 = (double)iNum1 / fNum;
	    System.out.println(result4);
	    
	    //3.7
	    int result5 = ch;
	    System.out.println(result5);
	    
	    //3.8
	    //int result6 = ch + 1;
	    char result6 = (char)(ch + 1);
	    System.out.println(result6);
	    
	}

}
