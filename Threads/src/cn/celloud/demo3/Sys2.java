package cn.celloud.demo3;
/**
 * 解决重复消费资源问题
 * 方案1：同步代码块
 * @author gaotianye
 *
 */
public class Sys2 implements Runnable {
	int i = 100;
	@Override
	public void run() {
		/**
		 * 同步的前提：多个线程使用同一个锁，当前锁就是this
		 * 其次，锁的范围不要过大（影响性能），但是一定要锁住资源
		 */
		synchronized (this) {
			while(i>0){
				System.out.println(Thread.currentThread().getName()+",count:"+(i--));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
