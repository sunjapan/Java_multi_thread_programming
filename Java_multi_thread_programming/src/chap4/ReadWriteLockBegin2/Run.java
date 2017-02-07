package chap4.ReadWriteLockBegin2;

public class Run {

	public static void main(String[] args) {
		Service svc = new Service();
		ThreadA a = new ThreadA(svc);
		a.setName("A");
		ThreadB b = new ThreadB(svc);
		b.setName("B");
		a.start();
		b.start();

	}

}
