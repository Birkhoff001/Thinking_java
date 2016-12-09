package andycpp;

class Instrument {
	public void play() {}
	static void tune() {
//		i.play();
	}
}

class Wind extends Instrument {
	public static void main(String[] args) {
		Wind x = new Wind();
		Instrument y = new Instrument();
		y.play();
	}
}
