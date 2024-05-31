package _05_Thread;

import java.awt.Toolkit;

class BeepThread extends Thread {
	@Override
	public void run() {
		for(int i=10; i<15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class T03_MutilThread {
	public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	BeepThread bt = new BeepThread();
	bt.start();
	
	for(int i=0; i<5; i++) {
		// toolkit.beep();
		System.out.println(i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
	 	}	
	}
}
