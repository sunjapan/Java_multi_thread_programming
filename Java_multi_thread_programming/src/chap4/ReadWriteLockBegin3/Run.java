package chap4.ReadWriteLockBegin3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service svc = new Service();
		ThreadA a = new ThreadA(svc);
		a.setName("A");
		Thread.sleep(1000);
		ThreadB b = new ThreadB(svc);
		b.setName("B");
		a.start();
		b.start();

	}

}
