package cn.celloud.demo2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for(;i<100;i++){
			System.out.println("线程"+Thread.currentThread().getName()+",i:"+i);
		}
		return i;
	}
}
