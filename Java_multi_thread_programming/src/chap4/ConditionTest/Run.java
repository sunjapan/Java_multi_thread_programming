package chap4.ConditionTest;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		MyThreadB b = new MyThreadB(myService);
		b.start();
		Thread.sleep(500);
		MyThreadA a = new MyThreadA(myService);
		a.start();

	}

}
