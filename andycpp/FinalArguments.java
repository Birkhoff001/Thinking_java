package andycpp;

class Gizmo {
	public void spin() {}
}

public class FinalArguments {
	void with(final Gizmo g) {
		g.spin();
	}
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	int g(final int i) {
		return i + 1;
	}
	public static void main(String[] args) {
		FinalArguments x = new FinalArguments();
		x.g(2);
		x.with(new Gizmo());
		x.without(new Gizmo());
		x.prt("x.g(1) = " + x.g(2));
	}
	void prt(String s) {
		System.out.println(s);
	}
}
