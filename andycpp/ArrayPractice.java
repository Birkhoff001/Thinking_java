package andycpp;
/*(1) ��Ĭ�Ϲ���������һ���ࣨû���Ա�������������ӡһ����Ϣ����������������һ������
 *(2) ����ϰ 1�Ļ���������һ�����صĹ��������������һ�� String�Ա���������ͬ�Լ�����Ϣ
 *��ӡ������
 *!!!!!!!!!!!!-----------------
 *(3) ����ϰ 2��������Ϊ�����ϣ������������Ķ�������һ�����飬����Ҫʵ�ʴ������󲢷���
 *����������г���ʱ��ע���Ƿ��ӡ�����Թ��������õĳ�ʼ����Ϣ��
 *(4) ����ͬ���������ϵ�����Ķ������������ϰ3��
 *(5) ���Ա�����before������after���͡�none�����г������� Garbage.java���ظ����������
 *�۲��Ƿ� ������п�����һЩ�̶���ģʽ���ı���룬ʹSystem.runFinalization()��
 *System.gc()֮ǰ���ã��ٹ� ������ 
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
