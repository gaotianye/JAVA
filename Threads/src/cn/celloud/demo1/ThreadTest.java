package cn.celloud.demo1;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread1());
		/**
		 * 	普通方式：
		 * 	线程Thread-0正在运行中
			线程Thread-1正在运行中
		 */
		t1.setName("thread-0");
		t2.setName("thread-1");
		t1.start();
		t2.start();
		/**
		 * 	线程Thread-2正在运行中。。。。。
			线程Thread-3正在运行中。。。。。
		 */
		Thread2 t3 = new Thread2();
		Thread2 t4 = new Thread2();
		t3.start();
		t4.start();
		/**
		 * 普通：
		 * 线程Thread-4正在执行中
			线程Thread-5正在执行中
		   setName：
		   	线程test1正在执行中
			线程test2正在执行中
		 */
		Thread3 t_name1 = new Thread3();
		Thread3 t_name2 = new Thread3();
		t_name1.setName("test1");
		t_name2.setName("test2");
		t_name1.start();
		t_name2.start();
		/**
		 * name没有任何效果：
		 * 线程Thread-6正在执行中
			线程Thread-7正在执行中
		 */
		Thread3 t_name3 = new Thread3("gaotianye");
		Thread3 t_name4 = new Thread3("yuwei");
		t_name3.start();
		t_name4.start();
		/**
		 * myName照样不管用
		 * 线程Thread-8正在执行中
			线程Thread-9正在执行中
		 */
		Thread4 t_my_name1 = new Thread4("gaotianye");
		Thread4 t_my_name2 = new Thread4("yuwei");
		t_my_name1.start();
		t_my_name2.start();
		/**
		 * JDK1.8之前，是可以在创建对象时就执行name的。但是1.8时就不可以了
		 */
		Demo demo1 = new Demo("xiaoqiang");
		Demo demo2 = new Demo("wangcai");
		demo1.setName("小强");
		demo2.setName("旺财");
		demo1.start();
		demo2.start();
	}
}
