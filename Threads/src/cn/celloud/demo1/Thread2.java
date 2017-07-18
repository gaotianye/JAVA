package cn.celloud.demo1;

public class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("线程"+Thread.currentThread().getName()+"正在运行中。。。。。");
	}
}
