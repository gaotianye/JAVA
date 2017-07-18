package cn.celloud.demo4;
/**
 * sleep、wait在原位置阻塞，恢复后，也会在原位置继续向下执行。--不加锁情况
 * @author gaotianye
 *
 */
public class SleepThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0;i<10;i++){
			try {
				System.out.println("sleep start......"+Thread.currentThread().getName()+",i:"+i);
				Thread.sleep(1000);
				System.out.println("sleep end......"+Thread.currentThread().getName()+",i:"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("try over........"+Thread.currentThread().getName()+",i:"+i);
		}
		System.out.println("for over.........."+Thread.currentThread().getName());
	}
}
