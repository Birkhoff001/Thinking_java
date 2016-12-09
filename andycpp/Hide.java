package andycpp;

class Homer {
	char doh(char c) {
		System.out.println("doh(char)" + c);
		return 'd';
	}
	float doh(float f) {
		System.out.println("doh(float)" + f);
		return 1.0f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m) {System.out.println("Bart construction " + m);}
}

class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh(1.0f);
		b.doh('x');
		b.doh(new Milhouse());
	}
}
