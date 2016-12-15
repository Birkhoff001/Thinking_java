package andycpp;
import andycpp.Note;

abstract class Instrument {
	private int i;
	public abstract void play(Note n); 
//	{
//		System.out.println("Instrument.play()" + n);
//	}
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play()" + n);
	}
	public String what() {
		return "Wind";
	}
	public void adjust() {}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}
	public String what() {
		return "Percussion";
	}
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play()" + n);
	}
	public String what() {
		return "Stringed";
	}
	public void adjust() {}
}

class Woodwind extends Wind {
	public void play(Note n) {
		System.out.println("Woodwind.play()" + n);
	}
	public String what() {
		return "Woodwind";
	}
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play()");
	}
	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

public class Music {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
		i.play(Note.C_SHARP);
//		System.out.println("i.play(Note.MIDDLE_C) = " + 
//		Note.MIDDLE_C);
//		System.out.println("i.play(Note.MIDDLE_C) = " + 
//				Note.C_SHARP);
	}
	static void tuneAll(Instrument[] e) {
		for (int i = 0; i < e.length; i++) {
			tune(e[i]);
		}
	}
	public static void main(String[] args){
		Instrument[] in = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Woodwind()
		};
		tuneAll(in);
		Woodwind x = new Woodwind();
		x.play(null);
	}
}
