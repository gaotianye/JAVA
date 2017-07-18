package cn.celloud.demo3;
/**
 * 多线程 共享资源i出现问题
 * 重复消费资源
 * @author gaotianye
 *
 */
public class Sys1 implements Runnable {
	int i = 100;
	@Override
	public void run() {
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
