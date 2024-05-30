package _03_StackQueue;

import java.util.*;

class Message {
	String command;
	String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class T01_Queue {
	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<Message>();
		msgQueue.offer(new Message("sendMail", "홍길동"));
		msgQueue.offer(new Message("sendSMS", "아무개"));
		msgQueue.offer(new Message("sendKatalk", "홍두깨"));
		
		System.out.println(msgQueue);
		
		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.poll();
			switch(msg.command) {
			case "sendMail" :
				System.out.println(msg.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 SMS를 보냅니다");
				break;
			case "sendKatalk" :
				System.out.println(msg.to + "님에게 카톡을 보냅니다");
			}
		}
	}

}
