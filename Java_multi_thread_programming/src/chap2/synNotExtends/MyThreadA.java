package chap2.synNotExtends;

public class MyThreadA extends Thread {
	private Sub sub;
	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}
	public void run(){
		sub.serviceMethod();
	}
}
