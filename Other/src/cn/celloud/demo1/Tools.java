package cn.celloud.demo1;
/**
 * 在工具类中，将某个方法指定为@Deprecated，所有使用这个方法时，都会出现中划线
 * @author gaotianye
 *
 */
public class Tools {
	public static void say(){
		System.out.println("I am say.........");
	}
	
	/**
	 * 建议使用say()
	 */
	@Deprecated
	public static void speak(){
		System.out.println("I am speak........");
	}
	
}
