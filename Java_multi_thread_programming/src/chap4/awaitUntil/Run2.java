package chap4.awaitUntil;

public class Run2 {

	public static void main(String[] args) {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();
		MyThreadB myThreadB = new MyThreadB(service);
		myThreadB.start();
	}

}
