package ch13;
//Callback
interface Callback {
	void printMoney(int money);
}

class MoneyChange {
	int money = 10000;

	public void accept(Callback callback) {
		// 은행에 입출 요청을 해서 20000원을 받을 예정 2초!!
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					money = money + 20000;
					callback.printMoney(money);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		MoneyChange mc = new MoneyChange();
		mc.accept(new Callback() {
			@Override
			public void printMoney(int money) {
				System.out.println("통장의 잔액은 : " + money);
			}
		});
		for (int i = 1; i < 6; i++) {
			System.out.println("메인쓰레드 : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
