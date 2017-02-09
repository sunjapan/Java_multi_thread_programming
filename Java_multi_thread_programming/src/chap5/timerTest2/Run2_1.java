package chap5.timerTest2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2_1 {

	static public class MyTaskA extends TimerTask {
		@Override
		public void run() {
			System.out.println("A运行了！时间为： " + new Date());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("A结束了！时间为： " + new Date());
		}
	}

	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2017-02-07 16:42:00";
			Timer timer = new Timer();
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间： "+dateRef.toLocaleString()+ "当前时间: "+new Date().toLocaleString());
			timer.schedule(taskA, dateRef,4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
