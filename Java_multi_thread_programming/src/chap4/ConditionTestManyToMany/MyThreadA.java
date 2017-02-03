package chap4.ConditionTestManyToMany;

public class MyThreadA extends Thread {
	private MyService service;

	public MyThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			service.set();
		}

	}
}
