package cn.celloud.demo1;

public class Thread3 extends Thread {
	private String name;
	
	//Cannot override the final method from Thread
	//这是因为Thread也有一个name属性
/*	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public Thread3(String name) {
		super();
		this.name = name;
	}

	public Thread3() {
		super();
	}

	@Override
	public void run() {
		System.out.println("线程"+Thread.currentThread().getName()+"正在执行中");
	}
}
