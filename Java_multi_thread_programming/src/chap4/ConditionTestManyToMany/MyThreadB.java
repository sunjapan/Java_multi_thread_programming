package chap4.ConditionTestManyToMany;

public class MyThreadB extends Thread {
	private MyService service;

	public MyThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			service.get();
		}

	}
}
