package ch13.thread;

public class ExRunable implements Runnable {
	int num;

	public ExRunable(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = num; i <= num + 9; i++) {

			System.out.println(this.name + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}
}
