package andycpp;

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = new String("Constructed");
	}
	public String toString() {return s;}
}

public class SpirnklerSystem {
	private String value1="first", value2="second", 
			value3="third", value4="fourth";
	WaterSource source;
	int i=1;
	float f=(float) 2.1;
	void prt() {
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
		System.out.println("value4 = " + value4);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("source = " + source);
	}
	
	public static void main(String[] args) {
		SpirnklerSystem x = new SpirnklerSystem();
		x.prt();
	}
}
