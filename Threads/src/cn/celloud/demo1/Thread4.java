package cn.celloud.demo1;

public class Thread4 extends Thread {
	private String myName;

	public Thread4() {
		super();
	}

	public Thread4(String myName) {
		super();
		this.myName = myName;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public void run() {
		System.out.println("线程"+Thread.currentThread().getName()+"正在执行中");
	}
}
