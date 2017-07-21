package cn.celloud.demo5;
/**
 * 等待前面一个线程结束，再执行
 * @author gaotianye
 *
 */
public class JoinDemo {
	public static void main(String[] args) {
		AddThread t1 = new AddThread();
		t1.setName("COUNT");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("join interrupt.....");
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		System.out.println("join..........");
	}
}
class AddThread extends Thread{
	@Override
	public void run() {
		int sum = 0;
		for(int i=1;i<100;i++){
			sum+=i;
		}
		System.out.println("sum:"+sum);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("sleep interrupt.....");
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
}
