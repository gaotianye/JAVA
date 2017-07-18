package cn.celloud.demo2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * 实现Callable接口，并实现call方法，此方法作为线程执行体，并有返回值。
 * 
	创建实现Callable接口的实例，使用FutureTask类来包装Callable对象，
	该FutureTask对象封装了Callable对象的call方法的返回值。
	使用FutureTask对象作为Thread对象的target创建并启动新线程。
	调用FutureTask对象的get方法，获取子线程执行结束后的返回值。
 * @author gaotianye
 *
 */
public class CallableTest {
	public static void main(String[] args) {
		MyCallable test = new MyCallable();
		FutureTask<Integer> future = new FutureTask<Integer>(test);
		for(int count=0;count<50;count++){
			System.out.println("当前循环的线程是："+Thread.currentThread().getName()+",count:"+count);
			if(count==49){
				new Thread(future).start();
			}
		}
		try {
			System.out.println("子线程返回的值："+future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
