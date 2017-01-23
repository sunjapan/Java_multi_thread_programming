package chap2.synNotExtends;

public class Main {
	synchronized public void serviceMethod() {
		try {
			System.out.println("in main 下一步sleep begin threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("in main 下一步sleep end threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
