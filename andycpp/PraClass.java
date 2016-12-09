package andycpp;

class PraProtect {
	void s(int i) {
		System.out.println(i);
	}
}

public class PraClass {
	private static void pra1() {
		System.out.println("It's private function.");
	}
	protected static void pra2() {}
	void pra3() {
		int test = 1;
		double test1 = 1.1;
	}
	public static void main(String s) {
		new PraClass();
		PraClass.pra1();
		PraProtect pro = new PraProtect();

	}
}

