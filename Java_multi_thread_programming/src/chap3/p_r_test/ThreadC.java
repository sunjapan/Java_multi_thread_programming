package chap3.p_r_test;

public class ThreadC extends Thread {
	private C r;


	public ThreadC(C c) {
		super();
		this.r = c;
	}


	@Override
	public void run(){
		while(true){
			r.getValue();
		}
	}
	
}
