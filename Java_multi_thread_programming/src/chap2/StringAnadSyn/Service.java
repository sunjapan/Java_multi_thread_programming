package chap2.StringAnadSyn;

public class Service {
	public static void print(String stringParam){
		synchronized (stringParam) {
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
