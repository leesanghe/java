package ch13.thread;

public class Test {
	public static void main(String[] args) {
		TestAccount account = new TestAccount();
		Thread t1 = new Thread(()->{
			account.withdraw(50);
		});
		Thread t2 = new Thread(()->{
			account.withdraw(80);
		});
		t1.start();
		t2.start();
//synchronizeㅇ(동기화)를 하지 않았을 경우 둘다 인출되었습니다 뜰 확률 높음
}
}
