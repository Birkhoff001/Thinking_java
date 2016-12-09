package andycpp;

public class Equivalence {
	public static void main (String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1.equals(n2));
		int x = 0, y = 1, z = 2;
		String sString = "x, y, z";
		System.out.println(x + y + z + " " + sString );
		System.out.println(sString + " " + x + y + z);
	}
}

