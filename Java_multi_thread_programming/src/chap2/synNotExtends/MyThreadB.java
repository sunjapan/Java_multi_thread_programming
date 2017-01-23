package chap2.synNotExtends;

public class MyThreadB extends Thread {
	private Sub sub;
	public MyThreadB(Sub sub) {
		super();
		this.sub = sub;
	}
	public void run(){
		sub.serviceMethod();
	}
}
