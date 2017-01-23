package chap2.synLockIn_2;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Sub extends Main {
	synchronized public void operateISubMethod(){
		try {
			while(i > 0){
				i--;
				System.out.println("sub print i="+i);
				Thread.sleep(100);
				this.operateIMainMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
