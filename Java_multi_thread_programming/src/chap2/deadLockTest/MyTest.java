package chap2.deadLockTest;

public class MyTest {

	public static void main(String[] args) {
		MyService svc1 = new MyService();
		MyService svc2 = new MyService();
		svc1.setOtherService(svc2);
		svc2.setOtherService(svc1);
		
		MyThreadA a = new MyThreadA(svc1);
		MyThreadB b = new MyThreadB(svc2);
		a.start();
		b.start();

	}

}
