package andycpp;
/*(1) 用默认构建器创建一个类（没有自变量），用它打印一条消息。创建属于这个类的一个对象。
 *(2) 在练习 1的基础上增加一个过载的构建器，令其采用一个 String自变量，并随同自己的消息
 *打印出来。
 *!!!!!!!!!!!!-----------------
 *(3) 以练习 2创建的类为基础上，创建属于它的对象句柄的一个数组，但不要实际创建对象并分配
 *到数组里。运行程序时，注意是否打印出来自构建器调用的初始化消息。
 *(4) 创建同句柄数组联系起来的对象，最终完成练习3。
 *(5) 用自变量“before”，“after”和“none”运行程序，试验 Garbage.java。重复这个操作，
 *观察是否 从输出中看出了一些固定的模式。改变代码，使System.runFinalization()在
 *System.gc()之前调用，再观 察结果。 
 *---------!!!!!!
*/

class R {
	R() {
		System.out.println("oh,it's a practice of no argument.");
	}
	R(String s) {
		System.out.println("oh,it's a practice. " + s);
	}

}

public class ArrayPractice {
	public static void main(String[] args) {
		String b = "hhh";
		new R();
		new R(b);
		String[] a = {
				new String("first"),
				new String("second"),
				new String("third"),
				};
			
		for(int i = 0; i < a.length; i++) {
			prt("a[" + i + "] = " + a[i]);
		}
	}
	static void prt(String s) {
		System.out.println(s);
	}
}
