package andycpp;

public class URShift {
	public static void main(String[] args) {
/*	
		int i = -1;
		i >>>= 10;
		System.out.println(i);
		long j = -1;
		j >>>= 10;
		System.out.println(j);
		short s = -1;
		s >>>= 10;
		System.out.println(s);
		byte t = -1;
		t >>>=10;
		System.out.println(t);
		
		double r = 0;
		while (r < 0.99d) {
			r = Math.random();
			System.out.println(r);
		}
	
		for (char c = 0; c < 128; c++) {
			if (c != 26) {
				System.out.println("value: " + (int)c + 
						"character: " + c);
			}
		}
		
		for (int o=1; o < 100; o++) {
			if (o == 47) {
				return;
			}
			else {
				pInt("now is : ", o);
			}
	}
*/		
		for (int p = 0; p < 100; p++) {
			char c = (char)(Math.random() * 26 + 'a');
			System.out.print(c + ": ");
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("Sometimes a vowel");
				break;
			default:
				System.out.println("consonant");
			}
		}
	}
	static void pInt(String h, int k) {
		System.out.println(k);
	}
}
