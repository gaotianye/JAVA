package cn.celloud.demo5;
/**
 * main函数中，interrupt()仅仅是个标记，只有在run中判断isInterrupted为true时，
 * 才会真正中断线程。
 * TODO 但是run中不能有sleep方法，不然中断失败。
 * @author gaotianye
 *
 */
public class InterruptTest {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d1.interrupt();
		System.out.println("main ..........");
	}
}
class Demo extends Thread{
	@Override
	public void run() {
		while(true){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("需要中断");
				break;
			}
			System.out.println("没有中断，执行代码");
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println("执行代码");
	}
}
