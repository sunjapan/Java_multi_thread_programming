package chap4.ReadWriteLockBegin4;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service svc = new Service();

		ThreadB b = new ThreadB(svc);
		b.setName("B");
		b.start();
		Thread.sleep(1000);
		ThreadA a = new ThreadA(svc);
		a.setName("A");

		a.start();
		

	}

}
