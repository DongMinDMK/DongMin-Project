package hashSetEx;

import java.util.HashSet;
import java.util.Set;

class Message{
	private int messageNumber;
	private String messageContent;
	
	public Message(int messageNumber, String messageContent) { //매개변수가 있는 생성자
		this.messageNumber = messageNumber;
		this.messageContent = messageContent;
	}

	public int getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	
	//hashCode() 메소드와 equals 메소드는 조상 클래스인 Object 클래스에서 오버라이딩을 받아 호출을 할 수 있습니다. 사용자(개발자)가 만든 모든 클래스는 
	//상속을 굳이 적지 않아도 자동적으로 조상클래스인 Object 클래스의 메소드를 오버라이딩을 받습니다.
	@Override
	public int hashCode() {
		return messageNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Message) { //객체가 지닌 메시지 값을 비교해 반환
			Message message = (Message)obj; //조상클래스의 객체를 끌고와서 강제 다운캐스팅을 시킴.
			if(this.messageContent.equals(message.getMessageContent())) { //위에서 선언한 메시지 내용과 조상클래스에서 받아온 메시지 내용을 비교해 같으면 true, 다르면 false 리턴
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}

public class HashSetEx {

	public static void main(String[] args) {
		
		//Set 컬렉션은 List 컬렉션과는 다르게 중복을 허용하지 않음.(나머지 add 함수라던지 이런것은 list 컬렉션과 동일)
		
		Set<Message> messageSet = new HashSet<Message>();
		
		Message message1 = new Message(1, "메시지1번입니다.");
		Message message2 = new Message(1, "메시지1번입니다.");
		Message message3 = new Message(1, "메시지1번입니다.");
		Message message4 = new Message(2, "메시지2번입니다.");
		Message message5 = new Message(3, "메시지3번입니다.");
		
		
		messageSet.add(message1);
		messageSet.add(message2);
		messageSet.add(message3);
		messageSet.add(message4);
		messageSet.add(message5);
		
		System.out.println("메시지 사이즈 : " + messageSet.size()); //중복된 데이터가 있지만 허용하지 않기 때문에 사이즈가 3
		
		for(Message message : messageSet) {
			System.out.println("메시지 번호 : " + message.getMessageNumber() + ", 메시지 내용 : " + message.getMessageContent());
		}
		
		

	}

}
