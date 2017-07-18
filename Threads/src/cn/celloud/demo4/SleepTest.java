package cn.celloud.demo4;

public class SleepTest {
	public static void main(String[] args) {
		SleepThread t = new SleepThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
