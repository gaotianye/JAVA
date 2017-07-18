package cn.celloud.demo1;

/**
 * 实现Runnable接口
 * @author gaotianye
 *
 */
public class Thread1 implements Runnable {
	@Override
	public void run() {
		System.out.println("线程"+Thread.currentThread().getName()+"正在运行中");
	}
}
