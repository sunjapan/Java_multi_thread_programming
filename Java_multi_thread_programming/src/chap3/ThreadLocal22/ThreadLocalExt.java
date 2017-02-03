package chap3.ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return "我是默认值，第一次get不再为null";
	}
}
