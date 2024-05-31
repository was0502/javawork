package _05_Thread;

class PThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("#");
			for(int j=0; j<100000; j++);
		}
		System.out.println();
	}
}

class PThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("@");
			for(int j=0; j<100000; j++);
		}
	}
}
public class T06_ThreadPriorty {
	public static void main(String[] args) {
		PThread pt1 = new PThread();
		PThread2 pt2 = new PThread2();
		
		pt2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("pt1 우선순위 : " + pt1.getPriority());
		System.out.println("pt2 우선순위 : " + pt2.getPriority());
		
		pt1.start();
		pt2.start();
	}

}
