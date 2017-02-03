package chap3.InheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}
	@Override
	protected Object childValue(Object parentValue) {
		// TODO Auto-generated method stub
		return "我在子线程加的！";
	}
}
