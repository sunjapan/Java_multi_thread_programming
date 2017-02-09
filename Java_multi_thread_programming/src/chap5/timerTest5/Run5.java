package chap5.timerTest5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import chap5.timerTest4.Run.MyTask;

public class Run5 {
	private static Timer timer = new Timer();
	private static int runCount = 0;

	static public class MyTask1 extends TimerTask {
		@Override
		public void run() {
			System.out.println("1 begin 运行了！时间为： " + new Date());
			System.out.println("1   end 运行了！时间为： " + new Date());

		}
	}

	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2017-02-08 10:17:00";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间： " + dateRef.toLocaleString() + "当前时间: "
					+ new Date().toLocaleString());
			timer.schedule(task1, dateRef, 5000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
