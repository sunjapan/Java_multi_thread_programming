package innerTest1;

public class OutClass {
	static class Inner {
		public void method1() {
			synchronized ("其他的锁") {
				for (int i = 0; i <= 10; i++) {
					try {
						System.out.println(Thread.currentThread().getName()+" i="+i);
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		public synchronized void method2() {
			for (int i = 0; i <= 20; i++) {
				try {
					System.out.println(Thread.currentThread().getName()+" i="+i);
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
