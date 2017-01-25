package chap2.synStaticMethod;

public class Run {

	public static void main(String[] args) throws InterruptedException{
		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB();
		b.setName("B");
		b.start();
				
	}

}
