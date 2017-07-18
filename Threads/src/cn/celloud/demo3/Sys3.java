package cn.celloud.demo3;
/**
 * 解决重复消费资源问题
 * 方案2：同步函数
 * 
 * 当前锁就是this对象
 * @author gaotianye
 *
 */
public class Sys3 implements Runnable {
	int i = 100;
	@Override
	public synchronized void run() {
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
