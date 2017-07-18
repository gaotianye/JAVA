package cn.celloud.demo1;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread1());
		/**
		 * 	普通方式：
		 * 	线程Thread-0正在运行中
			线程Thread-1正在运行中
		 */
		t1.setName("thread-0");
		t2.setName("thread-1");
		t1.start();
		t2.start();
	}
}
