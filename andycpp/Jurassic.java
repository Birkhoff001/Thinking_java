package andycpp;

class SmallBrain {}

final class Dinosaur {
	int i = 6;
	int j = 9;
	SmallBrain x = new SmallBrain();
	void f() {}
}

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
		d.f();
		Jurassic j = new Jurassic();
		j.prt("d.i, d.j = " + d.i + "," + d.j);
		d.i = 33;
		d.j = 55;
		j.prt("d.i, d.j = " + d.i + "," + d.j);
		d.j++;
		j.prt("d.i, d.j = " + d.i + "," + d.j);
		ss();
	}
	void prt(String s) {
		System.out.println(s);
	}
	static void ss() {
		Jurassic j = new Jurassic();
		Dinosaur d = new Dinosaur();
		j.prt("d.i, d.j = " + d.i + "," + d.j);
	}
}

