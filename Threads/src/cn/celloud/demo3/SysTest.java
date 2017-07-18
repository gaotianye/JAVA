package cn.celloud.demo3;

public class SysTest {
	public static void main(String[] args) {
		Sys3 sys1 = new Sys3();
		Thread t1 = new Thread(sys1);
		Thread t2 = new Thread(sys1);
		Thread t3 = new Thread(sys1);
		Thread t4 = new Thread(sys1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
