package threadExampleEx;

class Storage{
	private int stackCount = 10; //기본 10개를 지님
	public synchronized void addStack(int stackCount) { //synchronized는 실제 실행하는 스레드의 일부분을 동기화하여 처리.
		this.stackCount = stackCount;
		
		if(this.stackCount >= 10) { //10이면
			System.out.println("비상입니다!!! 스레드님 일어나세요!!");
			notify(); //잠자는 스레드를 깨움.
		}
	}
	
	public synchronized void popStack(int leaveCount) {
		try {
			if(leaveCount > this.stackCount) { //스택에 남아있는 것보다 꺼낼 것이 많으면
				this.stackCount = 0; //스택카운트를 0으로 처리
			}else {
				this.stackCount -= leaveCount; //꺼낼 것보다 스택이 더 많다면 스택카운트에서 하나씩 뺌
			}
			
			if(this.stackCount == 0) {
				System.out.println("스택이 없어요!! 기다릴게요! 스택이 차면 올라갑니다!");
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getStackCount() {
		return this.stackCount;
	}
	
}

class StackThread extends Thread{
	private Storage storage;
	
	public StackThread(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000); //1초마다 1개씩 넣기
				if(this.storage.getStackCount() == 0) {
					System.out.println("스택을 10개를 추가할게요!!");
					this.storage.addStack(10);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class PopThread extends Thread{
	private Storage storage;
	
	public PopThread(Storage storage) {
		this.storage = storage;
	}
	
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000); //1초마다 1개씩 넣기
				System.out.println("스택을 5개를 뺄게요!!");
				this.storage.popStack(5);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class ThreadExampleEx {

	public static void main(String[] args) {
		//스레드란 하나의 프로세스 안에서 스레드는 여러개가 생성될 수 있는데 프로세스 안에서 스레드를 여러 개 생성하여 각자 독립적으로 존재하여 맡은 역할을 수행.
		
		Storage s = new Storage();
		StackThread add = new StackThread(s);
		PopThread pop = new PopThread(s);
		
		add.start();
		pop.start();
	}

}
