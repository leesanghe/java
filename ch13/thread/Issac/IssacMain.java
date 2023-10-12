package ch13.thread.Issac;

public class IssacMain {

	public static void main(String[] args) {
		// 여러고객에게 주문을 받았을때
		// 순차적으로 토스트를 생성하고 제공하는 내용.
		Customer pangha = new Customer("팽수", 5);
		Customer nick = new Customer("nick", 2);
		Customer judy = new Customer("judy", 3);

		Chef chef = new Chef(10);
		chef.start();
		pangha.start();
		nick.start();
		judy.start();
		

	}

}
