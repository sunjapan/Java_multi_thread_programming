package chap5.timerTest2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run4 {

	static int i = 0;

	static public class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("正常执行了 " + i);
		}
	}


	public static void main(String[] args) {
		try {
			MyTask task1 = new MyTask();
			Timer timer = new Timer();
			while(true){
				i++;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString1 = "2017-02-07 16:36:00";
				Date dateRef1 = sdf.parse(dateString1);
				System.out.println("字符串1时间： " + dateRef1.toLocaleString()
						+ "当前时间: " + new Date().toLocaleString());
				
				timer.schedule(task1, dateRef1);
				timer.cancel();
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
