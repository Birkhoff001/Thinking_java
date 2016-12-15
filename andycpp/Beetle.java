package andycpp;

class Insect {
	int i = 9;
	int j;
	Insect() {
		prt("i = " + i + ", j = " + j);
		j = 39;
	}
	static int x1 = prt("static Insect.x1 initialized");
	static int prt(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	int k = prt("Beetle.k initialized");
	Beetle() {
		super();
		prt("k = " + k);
		prt("j = " + j);
	}
	static int x2 = prt("static Beetle.x2 initialized");
	static int prt(String s) {
		System.out.println(s);
		return 63;
	}
	public static void main(String[] args) {
		System.out.println("2333333");
		prt("Beetle constructor");
		System.out.println("555555");
		Beetle b = new Beetle();
	}
}
