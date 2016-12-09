package andycpp;

class Soup {
	private Soup() {}
	public static Soup makeSoup() {
		return new Soup();
	}
	private static Soup s1 = new Soup();
	public static Soup access() {
		return s1;
	}
	public void f() {}
}

class Sandwich {
	void f() { 
		new Lunch();
		}
}

public class Lunch {
	private static void aa(){}
	protected static void bb() {}
	void test() {
		Soup s2 = Soup.makeSoup();
		Sandwich f1 = new Sandwich();
		Soup.access().f();
	}
	public static void main(String s) {
		Lunch lun = new Lunch();

	}
	
}
