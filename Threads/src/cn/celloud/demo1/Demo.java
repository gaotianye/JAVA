package cn.celloud.demo1;

public class Demo extends Thread {
	private String name;

	public Demo(String name) {
		super();
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("线程"+Thread.currentThread().getName()+"正在运行中");
	}
}
