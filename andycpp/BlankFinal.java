package andycpp;

class Poppet {}

class BlankFinal {
	final int i = 0;
	final int j;
	final Poppet p;
	BlankFinal() {
		j = 1;
		p = new Poppet();
	}
	BlankFinal(int x) {
		j = x;
		p = new Poppet();
	}
	public static void main(String[] arg) {
		BlankFinal bf = new BlankFinal();
	}
}
