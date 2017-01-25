package chap2.StringAnadSyn2;

public class Service {
	public static void print(Object object ){
		synchronized (object) {
			try {
				while(true){
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
