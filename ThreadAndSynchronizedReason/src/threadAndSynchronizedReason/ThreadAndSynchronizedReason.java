package threadAndSynchronizedReason;

class DMK_Bank{
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
}

class PlusThread implements Runnable{
	private DMK_Bank bank;
	private String name;
	
	public PlusThread(DMK_Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}

	@Override
	public void run() {
		
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				bank.addMoney(1000);
				System.out.println(this.name + "님의 현재 금액 : " + bank.getMoney()); //각각 5번씩 더해 총 둘다 5000원이 나와야 정상
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}

public class ThreadAndSynchronizedReason {

	public static void main(String[] args) {
		
		DMK_Bank bank1 = new DMK_Bank();
		
		Thread thread1 = new Thread(new PlusThread(bank1, "DMK"));
		Thread thread2 = new Thread(new PlusThread(bank1, "KDM"));
		
		thread1.start();
		thread2.start();
		
		//2명이 서로 번갈아가면서 DMK_Bank에 입금을 해서 총합산 10000원이 나와야 정상이지만 실행을 해보면 10000원이 안나오는 경우가 많다. 이것은 두 개의 스레드가 서로의 작업을 방해, 간섭하여
		//정상적으로 DMK_Bank에 처리가 되지 않은 것이라 생각하면된다. 이러한 것의 해결방법이 Synchronized를 적은 스레드 동기화라 할 수 있다.
		

	}

}
